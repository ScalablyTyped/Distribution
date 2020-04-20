package typings.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/songresponse
trait SongResponse extends js.Object {
  var data: js.Array[Song]
}

object SongResponse {
  @scala.inline
  def apply(data: js.Array[Song]): SongResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SongResponse]
  }
}

