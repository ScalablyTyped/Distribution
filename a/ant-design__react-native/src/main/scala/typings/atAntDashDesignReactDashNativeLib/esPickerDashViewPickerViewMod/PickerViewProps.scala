package typings
package atAntDashDesignReactDashNativeLib.esPickerDashViewPickerViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerViewProps extends js.Object {
  var cascade: js.UndefOr[scala.Boolean] = js.undefined
  var cols: js.UndefOr[scala.Double] = js.undefined
  var data: js.UndefOr[
    js.Array[
      js.Array[atAntDashDesignReactDashNativeLib.esPickerPropsTypeMod.PickerData] | atAntDashDesignReactDashNativeLib.esPickerPropsTypeMod.PickerData
    ]
  ] = js.undefined
  var indicatorStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var itemStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var onScrollChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object PickerViewProps {
  @scala.inline
  def apply(
    cascade: js.UndefOr[scala.Boolean] = js.undefined,
    cols: scala.Int | scala.Double = null,
    data: js.Array[
      js.Array[atAntDashDesignReactDashNativeLib.esPickerPropsTypeMod.PickerData] | atAntDashDesignReactDashNativeLib.esPickerPropsTypeMod.PickerData
    ] = null,
    indicatorStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    itemStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    onChange: /* value */ js.UndefOr[js.Any] => scala.Unit = null,
    onScrollChange: /* value */ js.UndefOr[js.Any] => scala.Unit = null,
    styles: js.Any = null,
    value: js.Array[_] = null
  ): PickerViewProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction1(onScrollChange))
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PickerViewProps]
  }
}

