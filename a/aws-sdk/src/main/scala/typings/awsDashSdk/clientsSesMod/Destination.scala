package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destination extends js.Object {
  /**
    * The BCC: field(s) of the message.
    */
  var BccAddresses: js.UndefOr[AddressList] = js.undefined
  /**
    * The CC: field(s) of the message.
    */
  var CcAddresses: js.UndefOr[AddressList] = js.undefined
  /**
    * The To: field(s) of the message.
    */
  var ToAddresses: js.UndefOr[AddressList] = js.undefined
}

object Destination {
  @scala.inline
  def apply(BccAddresses: AddressList = null, CcAddresses: AddressList = null, ToAddresses: AddressList = null): Destination = {
    val __obj = js.Dynamic.literal()
    if (BccAddresses != null) __obj.updateDynamic("BccAddresses")(BccAddresses)
    if (CcAddresses != null) __obj.updateDynamic("CcAddresses")(CcAddresses)
    if (ToAddresses != null) __obj.updateDynamic("ToAddresses")(ToAddresses)
    __obj.asInstanceOf[Destination]
  }
}

