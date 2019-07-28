package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseReservedNodeOfferingResult extends js.Object {
  var ReservedNode: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.ReservedNode] = js.undefined
}

object PurchaseReservedNodeOfferingResult {
  @scala.inline
  def apply(ReservedNode: ReservedNode = null): PurchaseReservedNodeOfferingResult = {
    val __obj = js.Dynamic.literal()
    if (ReservedNode != null) __obj.updateDynamic("ReservedNode")(ReservedNode)
    __obj.asInstanceOf[PurchaseReservedNodeOfferingResult]
  }
}

