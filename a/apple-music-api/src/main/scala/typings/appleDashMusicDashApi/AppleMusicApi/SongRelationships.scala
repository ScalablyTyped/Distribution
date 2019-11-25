package typings.appleDashMusicDashApi.AppleMusicApi

import typings.appleDashMusicDashApi.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/song/relationships
trait SongRelationships extends js.Object {
  var albums: Relationship[Album]
  var artists: Relationship[Artist]
  var genres: js.UndefOr[Relationship[Genre]] = js.undefined
  var station: js.UndefOr[Anon_Data] = js.undefined
}

object SongRelationships {
  @scala.inline
  def apply(
    albums: Relationship[Album],
    artists: Relationship[Artist],
    genres: Relationship[Genre] = null,
    station: Anon_Data = null
  ): SongRelationships = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any])
    if (genres != null) __obj.updateDynamic("genres")(genres.asInstanceOf[js.Any])
    if (station != null) __obj.updateDynamic("station")(station.asInstanceOf[js.Any])
    __obj.asInstanceOf[SongRelationships]
  }
}

