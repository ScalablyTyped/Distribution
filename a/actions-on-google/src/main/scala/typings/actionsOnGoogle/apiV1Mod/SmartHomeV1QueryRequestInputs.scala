package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1QueryRequestInputs extends js.Object {
  var intent: SmartHomeV1Intents
  var payload: SmartHomeV1QueryRequestPayload
}

object SmartHomeV1QueryRequestInputs {
  @scala.inline
  def apply(intent: SmartHomeV1Intents, payload: SmartHomeV1QueryRequestPayload): SmartHomeV1QueryRequestInputs = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SmartHomeV1QueryRequestInputs]
  }
}

