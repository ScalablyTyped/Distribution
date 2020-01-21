package typings.antDesignReactNative.multiPickerPropsMod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPickerProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var onScrollChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
  var rootNativeProps: js.UndefOr[js.Any] = js.undefined
  var selectedValue: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object MultiPickerProps {
  @scala.inline
  def apply(
    children: js.Any = null,
    onScrollChange: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit = null,
    onValueChange: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit = null,
    rootNativeProps: js.Any = null,
    selectedValue: js.Array[_] = null,
    style: StyleProp[ViewStyle] = null
  ): MultiPickerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction2(onScrollChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2(onValueChange))
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps.asInstanceOf[js.Any])
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPickerProps]
  }
}

