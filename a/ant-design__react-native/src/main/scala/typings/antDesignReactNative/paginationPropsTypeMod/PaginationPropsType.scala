package typings.antDesignReactNative.paginationPropsTypeMod

import typings.antDesignReactNative.antDesignReactNativeStrings.button
import typings.antDesignReactNative.antDesignReactNativeStrings.number
import typings.antDesignReactNative.antDesignReactNativeStrings.pointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationPropsType extends js.Object {
  var current: Double
  var mode: js.UndefOr[button | number | pointer] = js.undefined
  var nextText: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.undefined
  var onNext: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPrev: js.UndefOr[js.Function0[Unit]] = js.undefined
  var prevText: js.UndefOr[String] = js.undefined
  var simple: js.UndefOr[Boolean] = js.undefined
  var total: Double
}

object PaginationPropsType {
  @scala.inline
  def apply(
    current: Double,
    total: Double,
    mode: button | number | pointer = null,
    nextText: String = null,
    onChange: /* current */ Double => Unit = null,
    onNext: () => Unit = null,
    onPrev: () => Unit = null,
    prevText: String = null,
    simple: js.UndefOr[Boolean] = js.undefined
  ): PaginationPropsType = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction0(onNext))
    if (onPrev != null) __obj.updateDynamic("onPrev")(js.Any.fromFunction0(onPrev))
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationPropsType]
  }
}

