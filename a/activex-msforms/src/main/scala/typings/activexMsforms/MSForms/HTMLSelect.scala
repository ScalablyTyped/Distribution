package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLSelect extends js.Object {
  
  var DisplayValues: js.Any = js.native
  
  var HTMLName: String = js.native
  
  @JSName("MSForms.HTMLSelect_typekey")
  var MSFormsDotHTMLSelect_typekey: HTMLSelect = js.native
  
  var MultiSelect: Boolean = js.native
  
  var Selected: String = js.native
  
  var Size: Double = js.native
  
  var Values: js.Any = js.native
}
object HTMLSelect {
  
  @scala.inline
  def apply(
    DisplayValues: js.Any,
    HTMLName: String,
    MSFormsDotHTMLSelect_typekey: HTMLSelect,
    MultiSelect: Boolean,
    Selected: String,
    Size: Double,
    Values: js.Any
  ): HTMLSelect = {
    val __obj = js.Dynamic.literal(DisplayValues = DisplayValues.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], MultiSelect = MultiSelect.asInstanceOf[js.Any], Selected = Selected.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLSelect_typekey")(MSFormsDotHTMLSelect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLSelect]
  }
  
  @scala.inline
  implicit class HTMLSelectOps[Self <: HTMLSelect] (val x: Self) extends AnyVal {
    
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
    def setDisplayValues(value: js.Any): Self = this.set("DisplayValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLName(value: String): Self = this.set("HTMLName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSFormsDotHTMLSelect_typekey(value: HTMLSelect): Self = this.set("MSForms.HTMLSelect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("MultiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: String): Self = this.set("Selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Any): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
}
