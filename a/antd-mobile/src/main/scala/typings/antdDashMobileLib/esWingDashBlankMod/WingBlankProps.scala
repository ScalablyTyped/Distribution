package typings
package antdDashMobileLib.esWingDashBlankMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WingBlankProps
  extends antdDashMobileLib.esWingDashBlankPropsTypeMod.WingBlankPropsType {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object WingBlankProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    prefixCls: java.lang.String = null,
    size: antdDashMobileLib.antdDashMobileLibStrings.sm | antdDashMobileLib.antdDashMobileLibStrings.md | antdDashMobileLib.antdDashMobileLibStrings.lg = null,
    style: reactLib.reactMod.CSSProperties = null
  ): WingBlankProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[WingBlankProps]
  }
}

