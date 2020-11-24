package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxRecipient Class */
@js.native
trait FaxRecipient extends js.Object {
  
  @JSName("FAXCOMEXLib.FaxRecipient_typekey")
  var FAXCOMEXLibDotFaxRecipient_typekey: FaxRecipient = js.native
  
  /** Recipient's fax number */
  var FaxNumber: String = js.native
  
  /** Recipient's name */
  var Name: String = js.native
}
object FaxRecipient {
  
  @scala.inline
  def apply(FAXCOMEXLibDotFaxRecipient_typekey: FaxRecipient, FaxNumber: String, Name: String): FaxRecipient = {
    val __obj = js.Dynamic.literal(FaxNumber = FaxNumber.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxRecipient_typekey")(FAXCOMEXLibDotFaxRecipient_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxRecipient]
  }
  
  @scala.inline
  implicit class FaxRecipientOps[Self <: FaxRecipient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFAXCOMEXLibDotFaxRecipient_typekey(value: FaxRecipient): Self = this.set("FAXCOMEXLib.FaxRecipient_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxNumber(value: String): Self = this.set("FaxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}
