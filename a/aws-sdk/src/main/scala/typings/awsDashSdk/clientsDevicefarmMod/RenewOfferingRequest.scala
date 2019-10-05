package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenewOfferingRequest extends js.Object {
  /**
    * The ID of a request to renew an offering.
    */
  var offeringId: js.UndefOr[OfferingIdentifier] = js.undefined
  /**
    * The quantity requested in an offering renewal.
    */
  var quantity: js.UndefOr[Integer] = js.undefined
}

object RenewOfferingRequest {
  @scala.inline
  def apply(offeringId: OfferingIdentifier = null, quantity: Int | scala.Double = null): RenewOfferingRequest = {
    val __obj = js.Dynamic.literal()
    if (offeringId != null) __obj.updateDynamic("offeringId")(offeringId)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenewOfferingRequest]
  }
}

