package typings.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/albumresponse
trait AlbumResponse extends js.Object {
  var data: js.Array[Album]
}

object AlbumResponse {
  @scala.inline
  def apply(data: js.Array[Album]): AlbumResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumResponse]
  }
}

