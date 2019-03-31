package typings
package antdDashMobileLib.libFlexFlexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexProps
  extends antdDashMobileLib.libFlexPropsTypeMod.FlexPropsType {
  var alignContent: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.start | antdDashMobileLib.antdDashMobileLibStrings.end | antdDashMobileLib.antdDashMobileLibStrings.center | antdDashMobileLib.antdDashMobileLibStrings.between | antdDashMobileLib.antdDashMobileLibStrings.around | antdDashMobileLib.antdDashMobileLibStrings.stretch
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object FlexProps {
  @scala.inline
  def apply(
    align: antdDashMobileLib.antdDashMobileLibStrings.start | antdDashMobileLib.antdDashMobileLibStrings.center | antdDashMobileLib.antdDashMobileLibStrings.end | antdDashMobileLib.antdDashMobileLibStrings.baseline | antdDashMobileLib.antdDashMobileLibStrings.stretch = null,
    alignContent: antdDashMobileLib.antdDashMobileLibStrings.start | antdDashMobileLib.antdDashMobileLibStrings.end | antdDashMobileLib.antdDashMobileLibStrings.center | antdDashMobileLib.antdDashMobileLibStrings.between | antdDashMobileLib.antdDashMobileLibStrings.around | antdDashMobileLib.antdDashMobileLibStrings.stretch = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    direction: antdDashMobileLib.antdDashMobileLibStrings.row | antdDashMobileLib.antdDashMobileLibStrings.`row-reverse` | antdDashMobileLib.antdDashMobileLibStrings.column | antdDashMobileLib.antdDashMobileLibStrings.`column-reverse` = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    justify: antdDashMobileLib.antdDashMobileLibStrings.start | antdDashMobileLib.antdDashMobileLibStrings.end | antdDashMobileLib.antdDashMobileLibStrings.center | antdDashMobileLib.antdDashMobileLibStrings.between | antdDashMobileLib.antdDashMobileLibStrings.around = null,
    onClick: () => scala.Unit = null,
    prefixCls: java.lang.String = null,
    role: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    wrap: antdDashMobileLib.antdDashMobileLibStrings.nowrap | antdDashMobileLib.antdDashMobileLibStrings.wrap | antdDashMobileLib.antdDashMobileLibStrings.`wrap-reverse` = null
  ): FlexProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (role != null) __obj.updateDynamic("role")(role)
    if (style != null) __obj.updateDynamic("style")(style)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexProps]
  }
}

