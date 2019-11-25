package typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod

import typings.actionsDashOnDashGoogle.Anon_ActiondevicesDISCONNECT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1DisconnectRequest extends SmartHomeV1Request {
  var inputs: js.Array[Anon_ActiondevicesDISCONNECT]
  var requestId: String
}

object SmartHomeV1DisconnectRequest {
  @scala.inline
  def apply(inputs: js.Array[Anon_ActiondevicesDISCONNECT], requestId: String): SmartHomeV1DisconnectRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SmartHomeV1DisconnectRequest]
  }
}

