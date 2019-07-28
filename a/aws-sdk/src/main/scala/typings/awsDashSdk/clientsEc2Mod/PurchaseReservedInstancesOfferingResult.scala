package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseReservedInstancesOfferingResult extends js.Object {
  /**
    * The IDs of the purchased Reserved Instances.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.undefined
}

object PurchaseReservedInstancesOfferingResult {
  @scala.inline
  def apply(ReservedInstancesId: String = null): PurchaseReservedInstancesOfferingResult = {
    val __obj = js.Dynamic.literal()
    if (ReservedInstancesId != null) __obj.updateDynamic("ReservedInstancesId")(ReservedInstancesId)
    __obj.asInstanceOf[PurchaseReservedInstancesOfferingResult]
  }
}

