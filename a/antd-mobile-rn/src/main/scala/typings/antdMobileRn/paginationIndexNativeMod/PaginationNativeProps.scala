package typings.antdMobileRn.paginationIndexNativeMod

import typings.antdMobileRn.antdMobileRnStrings.button
import typings.antdMobileRn.antdMobileRnStrings.number
import typings.antdMobileRn.antdMobileRnStrings.pointer
import typings.antdMobileRn.paginationPropsTypeMod.PaginationPropsType
import typings.antdMobileRn.paginationStyleIndexNativeMod.IPaginationStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationNativeProps extends PaginationPropsType {
  var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[IPaginationStyle] = js.undefined
}

object PaginationNativeProps {
  @scala.inline
  def apply(
    current: Double,
    total: Double,
    indicatorStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    mode: button | number | pointer = null,
    nextText: String = null,
    onChange: /* current */ Double => Unit = null,
    onNext: () => Unit = null,
    onPrev: () => Unit = null,
    prevText: String = null,
    simple: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: IPaginationStyle = null
  ): PaginationNativeProps = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (!js.isUndefined(indicatorStyle)) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction0(onNext))
    if (onPrev != null) __obj.updateDynamic("onPrev")(js.Any.fromFunction0(onPrev))
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationNativeProps]
  }
}

