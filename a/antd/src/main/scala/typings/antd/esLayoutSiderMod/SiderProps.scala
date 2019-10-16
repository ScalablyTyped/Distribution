package typings.antd.esLayoutSiderMod

import typings.antd.antdStrings.lg
import typings.antd.antdStrings.md
import typings.antd.antdStrings.sm
import typings.antd.antdStrings.xl
import typings.antd.antdStrings.xs
import typings.antd.antdStrings.xxl
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiderProps extends HTMLAttributes[HTMLDivElement] {
  var breakpoint: js.UndefOr[xs | sm | md | lg | xl | xxl] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var collapsedWidth: js.UndefOr[Double | String] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var defaultCollapsed: js.UndefOr[Boolean] = js.undefined
  var onBreakpoint: js.UndefOr[js.Function1[/* broken */ Boolean, Unit]] = js.undefined
  var onCollapse: js.UndefOr[js.Function2[/* collapsed */ Boolean, /* type */ CollapseType, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var reverseArrow: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[SiderTheme] = js.undefined
  var trigger: js.UndefOr[ReactNode] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var zeroWidthTriggerStyle: js.UndefOr[CSSProperties] = js.undefined
}

object SiderProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    breakpoint: xs | sm | md | lg | xl | xxl = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsedWidth: Double | String = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    defaultCollapsed: js.UndefOr[Boolean] = js.undefined,
    onBreakpoint: /* broken */ Boolean => Unit = null,
    onCollapse: (/* collapsed */ Boolean, /* type */ CollapseType) => Unit = null,
    prefixCls: String = null,
    reverseArrow: js.UndefOr[Boolean] = js.undefined,
    theme: SiderTheme = null,
    trigger: ReactNode = null,
    width: Double | String = null,
    zeroWidthTriggerStyle: CSSProperties = null
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
    if (zeroWidthTriggerStyle != null) __obj.updateDynamic("zeroWidthTriggerStyle")(zeroWidthTriggerStyle)
    __obj.asInstanceOf[SiderProps]
  }
}

