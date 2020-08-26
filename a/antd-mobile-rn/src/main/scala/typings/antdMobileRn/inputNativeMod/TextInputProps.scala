package typings.antdMobileRn.inputNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextInputProps
  extends typings.reactNative.mod.TextInputProps {
  var focused: js.UndefOr[Boolean] = js.native
}

object TextInputProps {
  @scala.inline
  def apply(): TextInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputProps]
  }
  @scala.inline
  implicit class TextInputPropsOps[Self <: TextInputProps] (val x: Self) extends AnyVal {
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
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
  }
  
}

