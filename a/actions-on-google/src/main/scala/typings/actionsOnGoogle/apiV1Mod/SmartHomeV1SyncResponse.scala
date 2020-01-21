package typings.actionsOnGoogle.apiV1Mod

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
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SmartHomeV1SyncResponse]
  }
}

