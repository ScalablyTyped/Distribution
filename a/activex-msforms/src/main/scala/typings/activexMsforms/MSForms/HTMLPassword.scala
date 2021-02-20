package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLPassword extends StObject {
  
  var HTMLName: String = js.native
  
  var HTMLType: String = js.native
  
  @JSName("MSForms.HTMLPassword_typekey")
  var MSFormsDotHTMLPassword_typekey: HTMLPassword = js.native
  
  var MaxLength: Double = js.native
  
  var Value: String = js.native
  
  var Width: Double = js.native
}
object HTMLPassword {
  
  @scala.inline
  def apply(
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLPassword_typekey: HTMLPassword,
    MaxLength: Double,
    Value: String,
    Width: Double
  ): HTMLPassword = {
    val __obj = js.Dynamic.literal(HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLPassword_typekey")(MSFormsDotHTMLPassword_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPassword]
  }
  
  @scala.inline
  implicit class HTMLPasswordMutableBuilder[Self <: HTMLPassword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHTMLName(value: String): Self = StObject.set(x, "HTMLName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLType(value: String): Self = StObject.set(x, "HTMLType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSFormsDotHTMLPassword_typekey(value: HTMLPassword): Self = StObject.set(x, "MSForms.HTMLPassword_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "MaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
