package typings.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/album/relationships
trait AlbumRelationships extends js.Object {
  var artists: Relationship[Artist]
}

object AlbumRelationships {
  @scala.inline
  def apply(artists: Relationship[Artist]): AlbumRelationships = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumRelationships]
  }
}

