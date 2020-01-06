package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseReservedNodeOfferingResult extends js.Object {
  var ReservedNode: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.ReservedNode] = js.native
}

object PurchaseReservedNodeOfferingResult {
  @scala.inline
  def apply(ReservedNode: ReservedNode = null): PurchaseReservedNodeOfferingResult = {
    val __obj = js.Dynamic.literal()
    if (ReservedNode != null) __obj.updateDynamic("ReservedNode")(ReservedNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedNodeOfferingResult]
  }
}

