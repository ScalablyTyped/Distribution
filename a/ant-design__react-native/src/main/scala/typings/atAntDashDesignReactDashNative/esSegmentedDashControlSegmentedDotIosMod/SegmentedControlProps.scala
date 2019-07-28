package typings.atAntDashDesignReactDashNative.esSegmentedDashControlSegmentedDotIosMod

import typings.atAntDashDesignReactDashNative.esSegmentedDashControlPropsTypeMod.SegmentedControlPropsType
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentedControlProps extends SegmentedControlPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object SegmentedControlProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* e */ js.Any => Unit = null,
    onValueChange: /* value */ String => Unit = null,
    selectedIndex: Int | Double = null,
    selectedTextColor: String = null,
    style: StyleProp[ViewStyle] = null,
    tintColor: String = null,
    values: js.Array[String] = null
  ): SegmentedControlProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedTextColor != null) __obj.updateDynamic("selectedTextColor")(selectedTextColor)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[SegmentedControlProps]
  }
}

