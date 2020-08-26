package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonType extends js.Object {
  var buttonType: String = js.native
  var prefixCls: String = js.native
  def onButtonClick(): Unit = js.native
}

object ButtonType {
  @scala.inline
  def apply(buttonType: String, onButtonClick: () => Unit, prefixCls: String): ButtonType = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], onButtonClick = js.Any.fromFunction0(onButtonClick), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonType]
  }
  @scala.inline
  implicit class ButtonTypeOps[Self <: ButtonType] (val x: Self) extends AnyVal {
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
    def setButtonType(value: String): Self = this.set("buttonType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnButtonClick(value: () => Unit): Self = this.set("onButtonClick", js.Any.fromFunction0(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
  }
  
}

