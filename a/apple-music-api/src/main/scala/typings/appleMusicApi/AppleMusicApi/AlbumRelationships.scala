package typings.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/album/relationships
trait AlbumRelationships extends js.Object {
  var artists: Relationship[Artist]
  var genres: js.UndefOr[Relationship[Genre]] = js.undefined
  var tracks: Relationship[Song]
}

object AlbumRelationships {
  @scala.inline
  def apply(artists: Relationship[Artist], tracks: Relationship[Song], genres: Relationship[Genre] = null): AlbumRelationships = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    if (genres != null) __obj.updateDynamic("genres")(genres.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumRelationships]
  }
}

