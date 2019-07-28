package typings.antdDashMobileDashRn.libRadioRadioDotNativeMod

import typings.antdDashMobileDashRn.Anon_Target
import typings.antdDashMobileDashRn.libRadioPropsTypeMod.RadioPropsType
import typings.antdDashMobileDashRn.libRadioStyleIndexDotNativeMod.IRadioStyle
import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.StyleProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioNativeProps extends RadioPropsType {
  var style: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  var styles: js.UndefOr[IRadioStyle] = js.undefined
}

object RadioNativeProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* e */ Anon_Target => Unit = null,
    style: StyleProp[ImageStyle] = null,
    styles: IRadioStyle = null,
    wrapLabel: js.UndefOr[Boolean] = js.undefined
  ): RadioNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (!js.isUndefined(wrapLabel)) __obj.updateDynamic("wrapLabel")(wrapLabel)
    __obj.asInstanceOf[RadioNativeProps]
  }
}

