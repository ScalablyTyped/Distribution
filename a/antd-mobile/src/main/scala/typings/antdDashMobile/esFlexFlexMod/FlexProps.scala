package typings.antdDashMobile.esFlexFlexMod

import typings.antdDashMobile.antdDashMobileStrings.`column-reverse`
import typings.antdDashMobile.antdDashMobileStrings.`row-reverse`
import typings.antdDashMobile.antdDashMobileStrings.`wrap-reverse`
import typings.antdDashMobile.antdDashMobileStrings.around
import typings.antdDashMobile.antdDashMobileStrings.baseline
import typings.antdDashMobile.antdDashMobileStrings.between
import typings.antdDashMobile.antdDashMobileStrings.center
import typings.antdDashMobile.antdDashMobileStrings.column
import typings.antdDashMobile.antdDashMobileStrings.end
import typings.antdDashMobile.antdDashMobileStrings.nowrap
import typings.antdDashMobile.antdDashMobileStrings.row
import typings.antdDashMobile.antdDashMobileStrings.start
import typings.antdDashMobile.antdDashMobileStrings.stretch
import typings.antdDashMobile.antdDashMobileStrings.wrap
import typings.antdDashMobile.esFlexPropsTypeMod.FlexPropsType
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexProps extends FlexPropsType {
  var alignContent: js.UndefOr[start | end | center | between | around | stretch] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object FlexProps {
  @scala.inline
  def apply(
    align: start | center | end | baseline | stretch = null,
    alignContent: start | end | center | between | around | stretch = null,
    className: String = null,
    direction: row | `row-reverse` | column | `column-reverse` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    justify: start | end | center | between | around = null,
    onClick: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    prefixCls: String = null,
    role: String = null,
    style: CSSProperties = null,
    wrap: nowrap | wrap | `wrap-reverse` = null
  ): FlexProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (role != null) __obj.updateDynamic("role")(role)
    if (style != null) __obj.updateDynamic("style")(style)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexProps]
  }
}

