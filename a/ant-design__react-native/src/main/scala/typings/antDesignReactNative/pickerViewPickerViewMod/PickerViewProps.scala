package typings.antDesignReactNative.pickerViewPickerViewMod

import typings.antDesignReactNative.pickerPropsTypeMod.PickerData
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerViewProps extends js.Object {
  var cascade: js.UndefOr[Boolean] = js.undefined
  var cols: js.UndefOr[Double] = js.undefined
  var data: js.UndefOr[js.Array[js.Array[PickerData] | PickerData]] = js.undefined
  var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  var onScrollChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object PickerViewProps {
  @scala.inline
  def apply(
    cascade: js.UndefOr[Boolean] = js.undefined,
    cols: js.UndefOr[Double] = js.undefined,
    data: js.Array[js.Array[PickerData] | PickerData] = null,
    indicatorStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    itemStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    onChange: /* value */ js.UndefOr[js.Any] => Unit = null,
    onScrollChange: /* value */ js.UndefOr[js.Any] => Unit = null,
    styles: js.Any = null,
    value: js.Array[_] = null
  ): PickerViewProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(indicatorStyle)) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(itemStyle)) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction1(onScrollChange))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerViewProps]
  }
}

