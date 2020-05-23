package typings.antdMobileRn.radioNativeMod

import typings.antdMobileRn.anon.Target
import typings.antdMobileRn.radioPropsTypeMod.RadioPropsType
import typings.antdMobileRn.radioStyleIndexNativeMod.IRadioStyle
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
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
    onChange: /* e */ Target => Unit = null,
    style: js.UndefOr[Null | StyleProp[ImageStyle]] = js.undefined,
    styles: IRadioStyle = null,
    wrapLabel: js.UndefOr[Boolean] = js.undefined
  ): RadioNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapLabel)) __obj.updateDynamic("wrapLabel")(wrapLabel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioNativeProps]
  }
}

