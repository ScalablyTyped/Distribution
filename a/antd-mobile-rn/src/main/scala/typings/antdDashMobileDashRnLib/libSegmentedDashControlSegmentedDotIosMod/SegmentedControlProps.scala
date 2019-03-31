package typings
package antdDashMobileDashRnLib.libSegmentedDashControlSegmentedDotIosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentedControlProps
  extends antdDashMobileDashRnLib.libSegmentedDashControlPropsTypeMod.SegmentedControlPropsType {
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
}

object SegmentedControlProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* e */ js.Any => scala.Unit = null,
    onValueChange: /* value */ java.lang.String => scala.Unit = null,
    selectedIndex: scala.Int | scala.Double = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: js.Any = null,
    tintColor: java.lang.String = null,
    values: js.Array[java.lang.String] = null
  ): SegmentedControlProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[SegmentedControlProps]
  }
}

