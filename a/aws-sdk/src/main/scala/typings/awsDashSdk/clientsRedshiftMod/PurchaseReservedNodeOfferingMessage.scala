package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseReservedNodeOfferingMessage extends js.Object {
  /**
    * The number of reserved nodes that you want to purchase. Default: 1 
    */
  var NodeCount: js.UndefOr[IntegerOptional] = js.native
  /**
    * The unique identifier of the reserved node offering you want to purchase.
    */
  var ReservedNodeOfferingId: String = js.native
}

object PurchaseReservedNodeOfferingMessage {
  @scala.inline
  def apply(ReservedNodeOfferingId: String, NodeCount: Int | scala.Double = null): PurchaseReservedNodeOfferingMessage = {
    val __obj = js.Dynamic.literal(ReservedNodeOfferingId = ReservedNodeOfferingId.asInstanceOf[js.Any])
    if (NodeCount != null) __obj.updateDynamic("NodeCount")(NodeCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedNodeOfferingMessage]
  }
}

