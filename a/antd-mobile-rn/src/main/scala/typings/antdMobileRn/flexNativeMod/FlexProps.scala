package typings.antdMobileRn.flexNativeMod

import typings.antdMobileRn.antdMobileRnStrings.`column-reverse`
import typings.antdMobileRn.antdMobileRnStrings.`row-reverse`
import typings.antdMobileRn.antdMobileRnStrings.`wrap-reverse`
import typings.antdMobileRn.antdMobileRnStrings.around
import typings.antdMobileRn.antdMobileRnStrings.baseline
import typings.antdMobileRn.antdMobileRnStrings.between
import typings.antdMobileRn.antdMobileRnStrings.center
import typings.antdMobileRn.antdMobileRnStrings.column
import typings.antdMobileRn.antdMobileRnStrings.end
import typings.antdMobileRn.antdMobileRnStrings.nowrap
import typings.antdMobileRn.antdMobileRnStrings.row
import typings.antdMobileRn.antdMobileRnStrings.start
import typings.antdMobileRn.antdMobileRnStrings.stretch
import typings.antdMobileRn.antdMobileRnStrings.wrap
import typings.antdMobileRn.flexPropsTypeMod.FlexPropsType
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexProps extends FlexPropsType {
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object FlexProps {
  @scala.inline
  def apply(
    align: start | center | end | baseline | stretch = null,
    children: ReactNode = null,
    direction: row | `row-reverse` | column | `column-reverse` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    justify: start | end | center | between | around = null,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    onPressIn: () => Unit = null,
    onPressOut: () => Unit = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    wrap: nowrap | wrap | `wrap-reverse` = null
  ): FlexProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction0(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction0(onPressOut))
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexProps]
  }
}

