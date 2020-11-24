package typings.antDesignReactNative.inputItemStyleMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputItemStyle extends js.Object {
  
  var clear: ViewStyle = js.native
  
  var container: ViewStyle = js.native
  
  var errorIcon: ViewStyle = js.native
  
  var extra: TextStyle = js.native
  
  var input: TextStyle = js.native
  
  var inputDisabled: TextStyle = js.native
  
  var inputErrorColor: TextStyle = js.native
  
  var text: TextStyle = js.native
}
object InputItemStyle {
  
  @scala.inline
  def apply(
    clear: ViewStyle,
    container: ViewStyle,
    errorIcon: ViewStyle,
    extra: TextStyle,
    input: TextStyle,
    inputDisabled: TextStyle,
    inputErrorColor: TextStyle,
    text: TextStyle
  ): InputItemStyle = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], errorIcon = errorIcon.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputDisabled = inputDisabled.asInstanceOf[js.Any], inputErrorColor = inputErrorColor.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputItemStyle]
  }
  
  @scala.inline
  implicit class InputItemStyleOps[Self <: InputItemStyle] (val x: Self) extends AnyVal {
    
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
    def setClear(value: ViewStyle): Self = this.set("clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorIcon(value: ViewStyle): Self = this.set("errorIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra(value: TextStyle): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: TextStyle): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDisabled(value: TextStyle): Self = this.set("inputDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputErrorColor(value: TextStyle): Self = this.set("inputErrorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: TextStyle): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
