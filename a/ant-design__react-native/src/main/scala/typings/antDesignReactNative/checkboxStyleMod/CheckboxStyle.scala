package typings.antDesignReactNative.checkboxStyleMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxStyle extends js.Object {
  
  var agreeItem: ViewStyle = js.native
  
  var agreeItemCheckbox: TextStyle = js.native
  
  var checkboxItemCheckbox: TextStyle = js.native
  
  var icon: TextStyle = js.native
  
  var iconRight: TextStyle = js.native
  
  var wrapper: ViewStyle = js.native
}
object CheckboxStyle {
  
  @scala.inline
  def apply(
    agreeItem: ViewStyle,
    agreeItemCheckbox: TextStyle,
    checkboxItemCheckbox: TextStyle,
    icon: TextStyle,
    iconRight: TextStyle,
    wrapper: ViewStyle
  ): CheckboxStyle = {
    val __obj = js.Dynamic.literal(agreeItem = agreeItem.asInstanceOf[js.Any], agreeItemCheckbox = agreeItemCheckbox.asInstanceOf[js.Any], checkboxItemCheckbox = checkboxItemCheckbox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconRight = iconRight.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxStyle]
  }
  
  @scala.inline
  implicit class CheckboxStyleOps[Self <: CheckboxStyle] (val x: Self) extends AnyVal {
    
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
    def setAgreeItem(value: ViewStyle): Self = this.set("agreeItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgreeItemCheckbox(value: TextStyle): Self = this.set("agreeItemCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxItemCheckbox(value: TextStyle): Self = this.set("checkboxItemCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: TextStyle): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconRight(value: TextStyle): Self = this.set("iconRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapper(value: ViewStyle): Self = this.set("wrapper", value.asInstanceOf[js.Any])
  }
}
