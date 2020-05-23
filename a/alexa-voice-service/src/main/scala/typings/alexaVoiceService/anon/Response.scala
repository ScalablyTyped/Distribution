package typings.alexaVoiceService.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var response: Body
  var xhr: js.Any
}

object Response {
  @scala.inline
  def apply(response: Body, xhr: js.Any): Response = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

