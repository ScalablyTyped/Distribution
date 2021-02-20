package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLOption extends StObject {
  
  var Checked: Boolean = js.native
  
  val DisplayStyle: fmDisplayStyle = js.native
  
  var HTMLName: String = js.native
  
  var HTMLType: String = js.native
  
  @JSName("MSForms.HTMLOption_typekey")
  var MSFormsDotHTMLOption_typekey: HTMLOption = js.native
  
  var Value: String = js.native
}
object HTMLOption {
  
  @scala.inline
  def apply(
    Checked: Boolean,
    DisplayStyle: fmDisplayStyle,
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLOption_typekey: HTMLOption,
    Value: String
  ): HTMLOption = {
    val __obj = js.Dynamic.literal(Checked = Checked.asInstanceOf[js.Any], DisplayStyle = DisplayStyle.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLOption_typekey")(MSFormsDotHTMLOption_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLOption]
  }
  
  @scala.inline
  implicit class HTMLOptionMutableBuilder[Self <: HTMLOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "Checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayStyle(value: fmDisplayStyle): Self = StObject.set(x, "DisplayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLName(value: String): Self = StObject.set(x, "HTMLName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLType(value: String): Self = StObject.set(x, "HTMLType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSFormsDotHTMLOption_typekey(value: HTMLOption): Self = StObject.set(x, "MSForms.HTMLOption_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
