package typings.antDesignReactNative.cascaderTypesMod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
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
    cols: js.UndefOr[Double] = js.undefined,
    defaultValue: CascaderValue = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    indicatorStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    onChange: /* value */ CascaderValue => Unit = null,
    onScrollChange: /* value */ CascaderValue => Unit = null,
    pickerItemStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    rootNativeProps: js.Object = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    value: CascaderValue = null
  ): CascaderProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indicatorStyle)) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction1(onScrollChange))
    if (!js.isUndefined(pickerItemStyle)) __obj.updateDynamic("pickerItemStyle")(pickerItemStyle.asInstanceOf[js.Any])
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascaderProps]
  }
}

