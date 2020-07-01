package typings.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/artist/relationships
trait ArtistRelationships extends js.Object {
  var albums: Relationship[Album]
  var genres: js.UndefOr[Relationship[Genre]] = js.undefined
}

object ArtistRelationships {
  @scala.inline
  def apply(albums: Relationship[Album], genres: Relationship[Genre] = null): ArtistRelationships = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any])
    if (genres != null) __obj.updateDynamic("genres")(genres.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistRelationships]
  }
}

