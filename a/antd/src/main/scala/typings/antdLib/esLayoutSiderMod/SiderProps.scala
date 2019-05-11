package typings
package antdLib.esLayoutSiderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiderProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] {
  var breakpoint: js.UndefOr[
    antdLib.antdLibStrings.xs | antdLib.antdLibStrings.sm | antdLib.antdLibStrings.md | antdLib.antdLibStrings.lg | antdLib.antdLibStrings.xl | antdLib.antdLibStrings.xxl
  ] = js.undefined
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var collapsedWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  var defaultCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  var onBreakpoint: js.UndefOr[js.Function1[/* broken */ scala.Boolean, scala.Unit]] = js.undefined
  var onCollapse: js.UndefOr[js.Function2[/* collapsed */ scala.Boolean, /* type */ CollapseType, scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var reverseArrow: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[SiderTheme] = js.undefined
  var trigger: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object SiderProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] = null,
    breakpoint: antdLib.antdLibStrings.xs | antdLib.antdLibStrings.sm | antdLib.antdLibStrings.md | antdLib.antdLibStrings.lg | antdLib.antdLibStrings.xl | antdLib.antdLibStrings.xxl = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    collapsedWidth: scala.Double | java.lang.String = null,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    defaultCollapsed: js.UndefOr[scala.Boolean] = js.undefined,
    onBreakpoint: /* broken */ scala.Boolean => scala.Unit = null,
    onCollapse: (/* collapsed */ scala.Boolean, /* type */ CollapseType) => scala.Unit = null,
    prefixCls: java.lang.String = null,
    reverseArrow: js.UndefOr[scala.Boolean] = js.undefined,
    theme: SiderTheme = null,
    trigger: reactLib.reactMod.ReactNode = null,
    width: scala.Double | java.lang.String = null
  ): SiderProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (collapsedWidth != null) __obj.updateDynamic("collapsedWidth")(collapsedWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (!js.isUndefined(defaultCollapsed)) __obj.updateDynamic("defaultCollapsed")(defaultCollapsed)
    if (onBreakpoint != null) __obj.updateDynamic("onBreakpoint")(js.Any.fromFunction1(onBreakpoint))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction2(onCollapse))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(reverseArrow)) __obj.updateDynamic("reverseArrow")(reverseArrow)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiderProps]
  }
}

