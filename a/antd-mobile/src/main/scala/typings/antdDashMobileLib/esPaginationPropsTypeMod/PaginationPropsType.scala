package typings
package antdDashMobileLib.esPaginationPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationPropsType extends js.Object {
  var current: scala.Double
  var mode: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.button | antdDashMobileLib.antdDashMobileLibStrings.number | antdDashMobileLib.antdDashMobileLibStrings.pointer
  ] = js.undefined
  var nextText: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* current */ scala.Double, scala.Unit]] = js.undefined
  var onNext: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPrev: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var prevText: js.UndefOr[java.lang.String] = js.undefined
  var simple: js.UndefOr[scala.Boolean] = js.undefined
  var total: scala.Double
}

object PaginationPropsType {
  @scala.inline
  def apply(
    current: scala.Double,
    total: scala.Double,
    mode: antdDashMobileLib.antdDashMobileLibStrings.button | antdDashMobileLib.antdDashMobileLibStrings.number | antdDashMobileLib.antdDashMobileLibStrings.pointer = null,
    nextText: java.lang.String = null,
    onChange: /* current */ scala.Double => scala.Unit = null,
    onNext: () => scala.Unit = null,
    onPrev: () => scala.Unit = null,
    prevText: java.lang.String = null,
    simple: js.UndefOr[scala.Boolean] = js.undefined
  ): PaginationPropsType = {
    val __obj = js.Dynamic.literal(current = current, total = total)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction0(onNext))
    if (onPrev != null) __obj.updateDynamic("onPrev")(js.Any.fromFunction0(onPrev))
    if (prevText != null) __obj.updateDynamic("prevText")(prevText)
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple)
    __obj.asInstanceOf[PaginationPropsType]
  }
}

