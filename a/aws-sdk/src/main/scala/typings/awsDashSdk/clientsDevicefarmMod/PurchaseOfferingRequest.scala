package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseOfferingRequest extends js.Object {
  /**
    * The ID of the offering.
    */
  var offeringId: js.UndefOr[OfferingIdentifier] = js.native
  /**
    * The ID of the offering promotion to be applied to the purchase.
    */
  var offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier] = js.native
  /**
    * The number of device slots to purchase in an offering request.
    */
  var quantity: js.UndefOr[Integer] = js.native
}

object PurchaseOfferingRequest {
  @scala.inline
  def apply(
    offeringId: OfferingIdentifier = null,
    offeringPromotionId: OfferingPromotionIdentifier = null,
    quantity: Int | scala.Double = null
  ): PurchaseOfferingRequest = {
    val __obj = js.Dynamic.literal()
    if (offeringId != null) __obj.updateDynamic("offeringId")(offeringId.asInstanceOf[js.Any])
    if (offeringPromotionId != null) __obj.updateDynamic("offeringPromotionId")(offeringPromotionId.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseOfferingRequest]
  }
}

