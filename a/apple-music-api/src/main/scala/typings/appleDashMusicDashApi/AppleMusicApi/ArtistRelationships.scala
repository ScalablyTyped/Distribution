package typings.appleDashMusicDashApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/artist/relationships
trait ArtistRelationships extends js.Object {
  var albums: Relationship[Album]
  var genres: Relationship[Genre]
}

object ArtistRelationships {
  @scala.inline
  def apply(albums: Relationship[Album], genres: Relationship[Genre]): ArtistRelationships = {
    val __obj = js.Dynamic.literal(albums = albums, genres = genres)
  
    __obj.asInstanceOf[ArtistRelationships]
  }
}

