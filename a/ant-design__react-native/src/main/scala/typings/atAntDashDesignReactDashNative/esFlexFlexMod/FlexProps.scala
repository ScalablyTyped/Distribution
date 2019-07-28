package typings.atAntDashDesignReactDashNative.esFlexFlexMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`column-reverse`
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`row-reverse`
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`wrap-reverse`
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.around
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.baseline
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.between
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.center
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.column
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.end
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.nowrap
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.row
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.start
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.stretch
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.wrap
import typings.atAntDashDesignReactDashNative.esFlexPropsTypeMod.FlexPropsType
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
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
    style: StyleProp[ViewStyle] = null,
    wrap: nowrap | wrap | `wrap-reverse` = null
  ): FlexProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction0(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction0(onPressOut))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexProps]
  }
}

