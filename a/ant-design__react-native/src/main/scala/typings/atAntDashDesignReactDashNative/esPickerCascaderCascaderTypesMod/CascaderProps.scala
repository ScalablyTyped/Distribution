package typings.atAntDashDesignReactDashNative.esPickerCascaderCascaderTypesMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CascaderProps extends js.Object {
  var cols: js.UndefOr[Double] = js.undefined
  var data: js.Array[CascaderDataItem]
  var defaultValue: js.UndefOr[CascaderValue] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.undefined
  var onScrollChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.undefined
  var pickerItemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var rootNativeProps: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var value: js.UndefOr[CascaderValue] = js.undefined
}

object CascaderProps {
  @scala.inline
  def apply(
    data: js.Array[CascaderDataItem],
    cols: Int | Double = null,
    defaultValue: CascaderValue = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    indicatorStyle: StyleProp[ViewStyle] = null,
    onChange: /* value */ CascaderValue => Unit = null,
    onScrollChange: /* value */ CascaderValue => Unit = null,
    pickerItemStyle: StyleProp[ViewStyle] = null,
    rootNativeProps: js.Object = null,
    style: StyleProp[ViewStyle] = null,
    value: CascaderValue = null
  ): CascaderProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction1(onScrollChange))
    if (pickerItemStyle != null) __obj.updateDynamic("pickerItemStyle")(pickerItemStyle.asInstanceOf[js.Any])
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CascaderProps]
  }
}

