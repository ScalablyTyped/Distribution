package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonClick extends js.Object {
  var buttonType: String = js.native
  var styles: StringDictionary[RegisteredStyle[_]] = js.native
  def buttonClick(): Unit = js.native
}

object ButtonClick {
  @scala.inline
  def apply(buttonClick: () => Unit, buttonType: String, styles: StringDictionary[RegisteredStyle[_]]): ButtonClick = {
    val __obj = js.Dynamic.literal(buttonClick = js.Any.fromFunction0(buttonClick), buttonType = buttonType.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonClick]
  }
  @scala.inline
  implicit class ButtonClickOps[Self <: ButtonClick] (val x: Self) extends AnyVal {
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
    def setButtonClick(value: () => Unit): Self = this.set("buttonClick", js.Any.fromFunction0(value))
    @scala.inline
    def setButtonType(value: String): Self = this.set("buttonType", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyles(value: StringDictionary[RegisteredStyle[_]]): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
  
}

