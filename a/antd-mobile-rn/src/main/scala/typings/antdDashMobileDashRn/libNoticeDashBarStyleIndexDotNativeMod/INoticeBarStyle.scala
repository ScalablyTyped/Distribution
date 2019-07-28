package typings.antdDashMobileDashRn.libNoticeDashBarStyleIndexDotNativeMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INoticeBarStyle extends js.Object {
  var actionWrap: ViewStyle
  var close: TextStyle
  var container: ViewStyle
  var content: TextStyle
  var left15: ViewStyle
  var left6: ViewStyle
  var link: TextStyle
  var notice: ViewStyle
}

object INoticeBarStyle {
  @scala.inline
  def apply(
    actionWrap: ViewStyle,
    close: TextStyle,
    container: ViewStyle,
    content: TextStyle,
    left15: ViewStyle,
    left6: ViewStyle,
    link: TextStyle,
    notice: ViewStyle
  ): INoticeBarStyle = {
    val __obj = js.Dynamic.literal(actionWrap = actionWrap, close = close, container = container, content = content, left15 = left15, left6 = left6, link = link, notice = notice)
  
    __obj.asInstanceOf[INoticeBarStyle]
  }
}

