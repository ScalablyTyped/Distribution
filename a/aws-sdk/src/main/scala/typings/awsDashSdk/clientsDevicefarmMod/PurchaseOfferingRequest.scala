package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseOfferingRequest extends js.Object {
  /**
    * The ID of the offering.
    */
  var offeringId: js.UndefOr[OfferingIdentifier] = js.undefined
  /**
    * The ID of the offering promotion to be applied to the purchase.
    */
  var offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier] = js.undefined
  /**
    * The number of device slots you wish to purchase in an offering request.
    */
  var quantity: js.UndefOr[Integer] = js.undefined
}

object PurchaseOfferingRequest {
  @scala.inline
  def apply(
    offeringId: OfferingIdentifier = null,
    offeringPromotionId: OfferingPromotionIdentifier = null,
    quantity: Int | scala.Double = null
  ): PurchaseOfferingRequest = {
    val __obj = js.Dynamic.literal()
    if (offeringId != null) __obj.updateDynamic("offeringId")(offeringId)
    if (offeringPromotionId != null) __obj.updateDynamic("offeringPromotionId")(offeringPromotionId)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseOfferingRequest]
  }
}

