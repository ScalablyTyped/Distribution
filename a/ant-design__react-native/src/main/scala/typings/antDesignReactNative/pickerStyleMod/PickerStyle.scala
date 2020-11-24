package typings.antDesignReactNative.pickerStyleMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerStyle extends js.Object {
  
  var actionText: TextStyle = js.native
  
  var dismissText: TextStyle = js.native
  
  var header: ViewStyle = js.native
  
  var headerItem: ViewStyle = js.native
  
  var modal: ViewStyle = js.native
  
  var okText: TextStyle = js.native
  
  var title: TextStyle = js.native
}
object PickerStyle {
  
  @scala.inline
  def apply(
    actionText: TextStyle,
    dismissText: TextStyle,
    header: ViewStyle,
    headerItem: ViewStyle,
    modal: ViewStyle,
    okText: TextStyle,
    title: TextStyle
  ): PickerStyle = {
    val __obj = js.Dynamic.literal(actionText = actionText.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerItem = headerItem.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerStyle]
  }
  
  @scala.inline
  implicit class PickerStyleOps[Self <: PickerStyle] (val x: Self) extends AnyVal {
    
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
    def setActionText(value: TextStyle): Self = this.set("actionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissText(value: TextStyle): Self = this.set("dismissText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: ViewStyle): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderItem(value: ViewStyle): Self = this.set("headerItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModal(value: ViewStyle): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkText(value: TextStyle): Self = this.set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: TextStyle): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
