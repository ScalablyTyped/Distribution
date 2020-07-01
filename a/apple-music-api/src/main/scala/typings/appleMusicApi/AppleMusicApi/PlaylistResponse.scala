package typings.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/playlistresponse
trait PlaylistResponse extends js.Object {
  var data: js.Array[Playlist]
}

object PlaylistResponse {
  @scala.inline
  def apply(data: js.Array[Playlist]): PlaylistResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistResponse]
  }
}

