package typings.antDesignReactNative.stylePromptMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromptStyle extends js.Object {
  
  var input: TextStyle = js.native
  
  var inputFirst: ViewStyle = js.native
  
  var inputGroup: ViewStyle = js.native
  
  var inputLast: ViewStyle = js.native
  
  var inputWrapper: ViewStyle = js.native
  
  var message: TextStyle = js.native
}
object PromptStyle {
  
  @scala.inline
  def apply(
    input: TextStyle,
    inputFirst: ViewStyle,
    inputGroup: ViewStyle,
    inputLast: ViewStyle,
    inputWrapper: ViewStyle,
    message: TextStyle
  ): PromptStyle = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], inputFirst = inputFirst.asInstanceOf[js.Any], inputGroup = inputGroup.asInstanceOf[js.Any], inputLast = inputLast.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptStyle]
  }
  
  @scala.inline
  implicit class PromptStyleOps[Self <: PromptStyle] (val x: Self) extends AnyVal {
    
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
    def setInput(value: TextStyle): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFirst(value: ViewStyle): Self = this.set("inputFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputGroup(value: ViewStyle): Self = this.set("inputGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputLast(value: ViewStyle): Self = this.set("inputLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputWrapper(value: ViewStyle): Self = this.set("inputWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: TextStyle): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
