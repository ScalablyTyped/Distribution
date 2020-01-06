package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseScheduledInstancesResult extends js.Object {
  /**
    * Information about the Scheduled Instances.
    */
  var ScheduledInstanceSet: js.UndefOr[PurchasedScheduledInstanceSet] = js.native
}

object PurchaseScheduledInstancesResult {
  @scala.inline
  def apply(ScheduledInstanceSet: PurchasedScheduledInstanceSet = null): PurchaseScheduledInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (ScheduledInstanceSet != null) __obj.updateDynamic("ScheduledInstanceSet")(ScheduledInstanceSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseScheduledInstancesResult]
  }
}

