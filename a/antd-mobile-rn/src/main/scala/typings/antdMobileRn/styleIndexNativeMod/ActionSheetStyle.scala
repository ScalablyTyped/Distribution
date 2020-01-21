package typings.antdMobileRn.styleIndexNativeMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetStyle extends js.Object {
  var btn: ViewStyle
  var cancelBtn: ViewStyle
  var cancelBtnMask: ViewStyle
  var container: ViewStyle
  var content: ViewStyle
  var destructiveBtn: TextStyle
  var mask: ViewStyle
  var message: ViewStyle
  var title: ViewStyle
  var titleText: TextStyle
  var wrap: ViewStyle
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
}

