package typings.antdDashMobile.libPaginationMod

import typings.antdDashMobile.antdDashMobileStrings.button
import typings.antdDashMobile.antdDashMobileStrings.number
import typings.antdDashMobile.antdDashMobileStrings.pointer
import typings.antdDashMobile.libPaginationPropsTypeMod.PaginationPropsType
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends PaginationPropsType {
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    current: Double,
    total: Double,
    className: String = null,
    mode: button | number | pointer = null,
    nextText: String = null,
    onChange: /* current */ Double => Unit = null,
    onNext: () => Unit = null,
    onPrev: () => Unit = null,
    prefixCls: String = null,
    prevText: String = null,
    simple: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): PaginationProps = {
    val __obj = js.Dynamic.literal(current = current, total = total)
    if (className != null) __obj.updateDynamic("className")(className)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction0(onNext))
    if (onPrev != null) __obj.updateDynamic("onPrev")(js.Any.fromFunction0(onPrev))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (prevText != null) __obj.updateDynamic("prevText")(prevText)
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PaginationProps]
  }
}

