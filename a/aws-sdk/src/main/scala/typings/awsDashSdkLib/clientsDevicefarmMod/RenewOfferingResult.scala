package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenewOfferingResult extends js.Object {
  /**
    * Represents the status of the offering transaction for the renewal.
    */
  var offeringTransaction: js.UndefOr[OfferingTransaction] = js.undefined
}

object RenewOfferingResult {
  @scala.inline
  def apply(offeringTransaction: OfferingTransaction = null): RenewOfferingResult = {
    val __obj = js.Dynamic.literal()
    if (offeringTransaction != null) __obj.updateDynamic("offeringTransaction")(offeringTransaction)
    __obj.asInstanceOf[RenewOfferingResult]
  }
}

