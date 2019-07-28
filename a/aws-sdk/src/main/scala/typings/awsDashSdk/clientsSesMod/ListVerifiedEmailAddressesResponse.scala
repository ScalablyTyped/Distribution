package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVerifiedEmailAddressesResponse extends js.Object {
  /**
    * A list of email addresses that have been verified.
    */
  var VerifiedEmailAddresses: js.UndefOr[AddressList] = js.undefined
}

object ListVerifiedEmailAddressesResponse {
  @scala.inline
  def apply(VerifiedEmailAddresses: AddressList = null): ListVerifiedEmailAddressesResponse = {
    val __obj = js.Dynamic.literal()
    if (VerifiedEmailAddresses != null) __obj.updateDynamic("VerifiedEmailAddresses")(VerifiedEmailAddresses)
    __obj.asInstanceOf[ListVerifiedEmailAddressesResponse]
  }
}

