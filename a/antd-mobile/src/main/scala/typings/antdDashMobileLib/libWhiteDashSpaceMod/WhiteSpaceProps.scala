package typings
package antdDashMobileLib.libWhiteDashSpaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpaceProps
  extends antdDashMobileLib.libWhiteDashSpacePropsTypeMod.WhiteSpacePropsType {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLDivElement]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object WhiteSpaceProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    onClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLDivElement] = null,
    prefixCls: java.lang.String = null,
    size: antdDashMobileLib.antdDashMobileLibStrings.xs | antdDashMobileLib.antdDashMobileLibStrings.sm | antdDashMobileLib.antdDashMobileLibStrings.md | antdDashMobileLib.antdDashMobileLibStrings.lg | antdDashMobileLib.antdDashMobileLibStrings.xl = null,
    style: reactLib.reactMod.CSSProperties = null
  ): WhiteSpaceProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[WhiteSpaceProps]
  }
}

