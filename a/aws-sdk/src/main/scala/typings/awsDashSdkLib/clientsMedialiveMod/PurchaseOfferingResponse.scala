package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseOfferingResponse extends js.Object {
  var Reservation: js.UndefOr[Reservation] = js.undefined
}

object PurchaseOfferingResponse {
  @scala.inline
  def apply(Reservation: Reservation = null): PurchaseOfferingResponse = {
    val __obj = js.Dynamic.literal()
    if (Reservation != null) __obj.updateDynamic("Reservation")(Reservation)
    __obj.asInstanceOf[PurchaseOfferingResponse]
  }
}

