package typings
package antdDashMobileLib.esPickerDashViewPickerViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerView extends js.Object {
  var cascade: js.UndefOr[scala.Boolean] = js.undefined
  var cols: js.UndefOr[scala.Double] = js.undefined
  var data: js.UndefOr[
    js.Array[
      js.Array[antdDashMobileLib.esPickerPropsTypeMod.PickerData] | antdDashMobileLib.esPickerPropsTypeMod.PickerData
    ]
  ] = js.undefined
  var indicatorStyle: js.UndefOr[js.Any] = js.undefined
  var itemStyle: js.UndefOr[js.Any] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var onScrollChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var pickerPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object IPickerView {
  @scala.inline
  def apply(
    cascade: js.UndefOr[scala.Boolean] = js.undefined,
    cols: scala.Int | scala.Double = null,
    data: js.Array[
      js.Array[antdDashMobileLib.esPickerPropsTypeMod.PickerData] | antdDashMobileLib.esPickerPropsTypeMod.PickerData
    ] = null,
    indicatorStyle: js.Any = null,
    itemStyle: js.Any = null,
    onChange: /* value */ js.UndefOr[js.Any] => scala.Unit = null,
    onScrollChange: /* value */ js.UndefOr[js.Any] => scala.Unit = null,
    pickerPrefixCls: java.lang.String = null,
    prefixCls: java.lang.String = null,
    value: js.Array[_] = null
  ): IPickerView = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction1(onScrollChange))
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IPickerView]
  }
}

