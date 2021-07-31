package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxRecipient Class */
trait FaxRecipient extends StObject {
  
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
  
  @scala.inline
  implicit class FaxRecipientMutableBuilder[Self <: FaxRecipient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFAXCOMEXLibDotFaxRecipient_typekey(value: FaxRecipient): Self = StObject.set(x, "FAXCOMEXLib.FaxRecipient_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxNumber(value: String): Self = StObject.set(x, "FaxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
