package typings.antDesignReactNative.popoverStyleMod

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopoverStyle extends js.Object {
  
  var arrow: ViewStyle = js.native
  
  var background: ViewStyle = js.native
  
  var content: ViewStyle = js.native
}
object PopoverStyle {
  
  @scala.inline
  def apply(arrow: ViewStyle, background: ViewStyle, content: ViewStyle): PopoverStyle = {
    val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverStyle]
  }
  
  @scala.inline
  implicit class PopoverStyleOps[Self <: PopoverStyle] (val x: Self) extends AnyVal {
    
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
    def setArrow(value: ViewStyle): Self = this.set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: ViewStyle): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: ViewStyle): Self = this.set("content", value.asInstanceOf[js.Any])
  }
}
