package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLCheckbox extends StObject {
  
  var Checked: Boolean
  
  var HTMLName: String
  
  var HTMLType: String
  
  @JSName("MSForms.HTMLCheckbox_typekey")
  var MSFormsDotHTMLCheckbox_typekey: HTMLCheckbox
  
  var Value: String
}
object HTMLCheckbox {
  
  @scala.inline
  def apply(
    Checked: Boolean,
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLCheckbox_typekey: HTMLCheckbox,
    Value: String
  ): HTMLCheckbox = {
    val __obj = js.Dynamic.literal(Checked = Checked.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLCheckbox_typekey")(MSFormsDotHTMLCheckbox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLCheckbox]
  }
  
  @scala.inline
  implicit class HTMLCheckboxMutableBuilder[Self <: HTMLCheckbox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "Checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLName(value: String): Self = StObject.set(x, "HTMLName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLType(value: String): Self = StObject.set(x, "HTMLType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSFormsDotHTMLCheckbox_typekey(value: HTMLCheckbox): Self = StObject.set(x, "MSForms.HTMLCheckbox_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
