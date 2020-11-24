package typings.antDesignReactNative.gridStyleMod

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridStyle extends js.Object {
  
  var grayBorderBox: ViewStyle = js.native
  
  var icon: ImageStyle = js.native
  
  var text: TextStyle = js.native
}
object GridStyle {
  
  @scala.inline
  def apply(grayBorderBox: ViewStyle, icon: ImageStyle, text: TextStyle): GridStyle = {
    val __obj = js.Dynamic.literal(grayBorderBox = grayBorderBox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridStyle]
  }
  
  @scala.inline
  implicit class GridStyleOps[Self <: GridStyle] (val x: Self) extends AnyVal {
    
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
    def setGrayBorderBox(value: ViewStyle): Self = this.set("grayBorderBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: ImageStyle): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: TextStyle): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
