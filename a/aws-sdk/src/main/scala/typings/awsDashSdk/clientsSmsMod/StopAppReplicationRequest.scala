package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopAppReplicationRequest extends js.Object {
  /**
    * ID of the application to stop replicating.
    */
  var appId: js.UndefOr[AppId] = js.undefined
}

object StopAppReplicationRequest {
  @scala.inline
  def apply(appId: AppId = null): StopAppReplicationRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    __obj.asInstanceOf[StopAppReplicationRequest]
  }
}

