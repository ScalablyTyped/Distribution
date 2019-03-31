package typings
package antdDashMobileLib.libPickerPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait PickerPropsType extends js.Object {
  var cascade: js.UndefOr[scala.Boolean] = js.undefined
  var cols: js.UndefOr[scala.Double] = js.undefined
  var data: js.Array[PickerData] | js.Array[js.Array[PickerData]]
  var extra: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[
    js.Function1[
      /* values */ js.Array[reactLib.reactMod.ReactNs.ReactNode], 
      java.lang.String | js.Array[reactLib.reactMod.ReactNs.ReactNode]
    ]
  ] = js.undefined
  var indicatorStyle: js.UndefOr[js.Any] = js.undefined
  var itemStyle: js.UndefOr[js.Any] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[
      /* date */ js.UndefOr[rmcDashCascaderLib.libCascaderTypesMod.CascaderValue], 
      scala.Unit
    ]
  ] = js.undefined
  var onPickerChange: js.UndefOr[
    js.Function1[/* value */ rmcDashCascaderLib.libCascaderTypesMod.CascaderValue, scala.Unit]
  ] = js.undefined
  var value: js.UndefOr[js.Array[java.lang.String | scala.Double]] = js.undefined
}

object PickerPropsType {
  @scala.inline
  def apply(
    data: js.Array[PickerData] | js.Array[js.Array[PickerData]],
    cascade: js.UndefOr[scala.Boolean] = js.undefined,
    cols: scala.Int | scala.Double = null,
    extra: java.lang.String = null,
    format: /* values */ js.Array[reactLib.reactMod.ReactNs.ReactNode] => java.lang.String | js.Array[reactLib.reactMod.ReactNs.ReactNode] = null,
    indicatorStyle: js.Any = null,
    itemStyle: js.Any = null,
    onChange: /* date */ js.UndefOr[rmcDashCascaderLib.libCascaderTypesMod.CascaderValue] => scala.Unit = null,
    onPickerChange: /* value */ rmcDashCascaderLib.libCascaderTypesMod.CascaderValue => scala.Unit = null,
    value: js.Array[java.lang.String | scala.Double] = null
  ): PickerPropsType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPickerChange != null) __obj.updateDynamic("onPickerChange")(js.Any.fromFunction1(onPickerChange))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PickerPropsType]
  }
}

