package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseScheduledInstancesResult extends js.Object {
  /**
    * Information about the Scheduled Instances.
    */
  var ScheduledInstanceSet: js.UndefOr[PurchasedScheduledInstanceSet] = js.undefined
}

object PurchaseScheduledInstancesResult {
  @scala.inline
  def apply(ScheduledInstanceSet: PurchasedScheduledInstanceSet = null): PurchaseScheduledInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (ScheduledInstanceSet != null) __obj.updateDynamic("ScheduledInstanceSet")(ScheduledInstanceSet)
    __obj.asInstanceOf[PurchaseScheduledInstancesResult]
  }
}

