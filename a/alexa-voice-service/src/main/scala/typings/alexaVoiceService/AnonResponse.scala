package typings.alexaVoiceService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResponse extends js.Object {
  var response: AnonBody
  var xhr: js.Any
}

object AnonResponse {
  @scala.inline
  def apply(response: AnonBody, xhr: js.Any): AnonResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResponse]
  }
}

