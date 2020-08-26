package typings.antDesignReactNative.actionSheetStyleMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionSheetStyle extends js.Object {
  var btn: ViewStyle = js.native
  var cancelBtn: ViewStyle = js.native
  var cancelBtnMask: ViewStyle = js.native
  var container: ViewStyle = js.native
  var content: ViewStyle = js.native
  var destructiveBtn: TextStyle = js.native
  var mask: ViewStyle = js.native
  var message: ViewStyle = js.native
  var title: ViewStyle = js.native
  var titleText: TextStyle = js.native
  var wrap: ViewStyle = js.native
}

object ActionSheetStyle {
  @scala.inline
  def apply(
    btn: ViewStyle,
    cancelBtn: ViewStyle,
    cancelBtnMask: ViewStyle,
    container: ViewStyle,
    content: ViewStyle,
    destructiveBtn: TextStyle,
    mask: ViewStyle,
    message: ViewStyle,
    title: ViewStyle,
    titleText: TextStyle,
    wrap: ViewStyle
  ): ActionSheetStyle = {
    val __obj = js.Dynamic.literal(btn = btn.asInstanceOf[js.Any], cancelBtn = cancelBtn.asInstanceOf[js.Any], cancelBtnMask = cancelBtnMask.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], destructiveBtn = destructiveBtn.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetStyle]
  }
  @scala.inline
  implicit class ActionSheetStyleOps[Self <: ActionSheetStyle] (val x: Self) extends AnyVal {
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
    def setBtn(value: ViewStyle): Self = this.set("btn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelBtn(value: ViewStyle): Self = this.set("cancelBtn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelBtnMask(value: ViewStyle): Self = this.set("cancelBtnMask", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: ViewStyle): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestructiveBtn(value: TextStyle): Self = this.set("destructiveBtn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMask(value: ViewStyle): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: ViewStyle): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: ViewStyle): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleText(value: TextStyle): Self = this.set("titleText", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrap(value: ViewStyle): Self = this.set("wrap", value.asInstanceOf[js.Any])
  }
  
}

