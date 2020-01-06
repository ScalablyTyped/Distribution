package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovePermissionRequest extends js.Object {
  /**
    * The name of the event bus to revoke permissions for. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[NonPartnerEventBusName] = js.native
  /**
    * The statement ID corresponding to the account that is no longer allowed to put events to the default event bus.
    */
  var StatementId: typings.awsDashSdk.clientsCloudwatcheventsMod.StatementId = js.native
}

object RemovePermissionRequest {
  @scala.inline
  def apply(StatementId: StatementId, EventBusName: NonPartnerEventBusName = null): RemovePermissionRequest = {
    val __obj = js.Dynamic.literal(StatementId = StatementId.asInstanceOf[js.Any])
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovePermissionRequest]
  }
}

