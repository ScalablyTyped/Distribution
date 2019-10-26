package typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1SyncResponse extends SmartHomeV1Response {
  var payload: SmartHomeV1SyncPayload
  var requestId: String
}

object SmartHomeV1SyncResponse {
  @scala.inline
  def apply(payload: SmartHomeV1SyncPayload, requestId: String): SmartHomeV1SyncResponse = {
    val __obj = js.Dynamic.literal(payload = payload, requestId = requestId)
  
    __obj.asInstanceOf[SmartHomeV1SyncResponse]
  }
}

