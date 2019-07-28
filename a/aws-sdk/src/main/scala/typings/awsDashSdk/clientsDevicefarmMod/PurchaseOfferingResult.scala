package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseOfferingResult extends js.Object {
  /**
    * Represents the offering transaction for the purchase result.
    */
  var offeringTransaction: js.UndefOr[OfferingTransaction] = js.undefined
}

object PurchaseOfferingResult {
  @scala.inline
  def apply(offeringTransaction: OfferingTransaction = null): PurchaseOfferingResult = {
    val __obj = js.Dynamic.literal()
    if (offeringTransaction != null) __obj.updateDynamic("offeringTransaction")(offeringTransaction)
    __obj.asInstanceOf[PurchaseOfferingResult]
  }
}

