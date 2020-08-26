package typings.antdMobileRn.textareaItemStyleIndexNativeMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextareaItemStyle extends js.Object {
  var container: ViewStyle = js.native
  var count: ViewStyle = js.native
  var errorIcon: ViewStyle = js.native
  var icon: ViewStyle = js.native
  var input: TextStyle = js.native
}

object ITextareaItemStyle {
  @scala.inline
  def apply(container: ViewStyle, count: ViewStyle, errorIcon: ViewStyle, icon: ViewStyle, input: TextStyle): ITextareaItemStyle = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], errorIcon = errorIcon.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextareaItemStyle]
  }
  @scala.inline
  implicit class ITextareaItemStyleOps[Self <: ITextareaItemStyle] (val x: Self) extends AnyVal {
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
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: ViewStyle): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorIcon(value: ViewStyle): Self = this.set("errorIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: ViewStyle): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: TextStyle): Self = this.set("input", value.asInstanceOf[js.Any])
  }
  
}

