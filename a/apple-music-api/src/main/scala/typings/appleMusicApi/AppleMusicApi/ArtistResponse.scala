package typings.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/artistresponse
trait ArtistResponse extends js.Object {
  var data: js.Array[Artist]
}

object ArtistResponse {
  @scala.inline
  def apply(data: js.Array[Artist]): ArtistResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistResponse]
  }
}

