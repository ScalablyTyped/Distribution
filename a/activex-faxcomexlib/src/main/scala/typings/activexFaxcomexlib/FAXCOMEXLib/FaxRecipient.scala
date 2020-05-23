package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxRecipient Class */
trait FaxRecipient extends js.Object {
  @JSName("FAXCOMEXLib.FaxRecipient_typekey")
  var FAXCOMEXLibDotFaxRecipient_typekey: FaxRecipient
  /** Recipient's fax number */
  var FaxNumber: String
  /** Recipient's name */
  var Name: String
}

object FaxRecipient {
  @scala.inline
  def apply(FAXCOMEXLibDotFaxRecipient_typekey: FaxRecipient, FaxNumber: String, Name: String): FaxRecipient = {
    val __obj = js.Dynamic.literal(FaxNumber = FaxNumber.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxRecipient_typekey")(FAXCOMEXLibDotFaxRecipient_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxRecipient]
  }
}

