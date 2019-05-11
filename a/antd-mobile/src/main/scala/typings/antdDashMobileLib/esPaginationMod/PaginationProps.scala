package typings
package antdDashMobileLib.esPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps
  extends antdDashMobileLib.esPaginationPropsTypeMod.PaginationPropsType {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    current: scala.Double,
    total: scala.Double,
    className: java.lang.String = null,
    mode: antdDashMobileLib.antdDashMobileLibStrings.button | antdDashMobileLib.antdDashMobileLibStrings.number | antdDashMobileLib.antdDashMobileLibStrings.pointer = null,
    nextText: java.lang.String = null,
    onChange: /* current */ scala.Double => scala.Unit = null,
    onNext: () => scala.Unit = null,
    onPrev: () => scala.Unit = null,
    prefixCls: java.lang.String = null,
    prevText: java.lang.String = null,
    simple: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null
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

