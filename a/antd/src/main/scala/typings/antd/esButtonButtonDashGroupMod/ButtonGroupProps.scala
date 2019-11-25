package typings.antd.esButtonButtonDashGroupMod

import typings.antd.esButtonButtonMod.ButtonSize
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[ButtonSize] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ButtonGroupProps {
  @scala.inline
  def apply(
    className: String = null,
    prefixCls: String = null,
    size: ButtonSize = null,
    style: CSSProperties = null
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupProps]
  }
}

