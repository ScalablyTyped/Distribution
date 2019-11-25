package typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1ExecuteRequestInputs extends js.Object {
  var intent: SmartHomeV1Intents
  var payload: SmartHomeV1ExecuteRequestPayload
}

object SmartHomeV1ExecuteRequestInputs {
  @scala.inline
  def apply(intent: SmartHomeV1Intents, payload: SmartHomeV1ExecuteRequestPayload): SmartHomeV1ExecuteRequestInputs = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestInputs]
  }
}

