package typings.antDesignReactNative.switchMod

import typings.antDesignReactNative.switchPropsTypeMod.SwitchPropsType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntmSwitchProps extends SwitchPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object AntmSwitchProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* checked */ Boolean => Unit = null,
    onPress: /* checked */ js.UndefOr[Boolean] => Unit = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): AntmSwitchProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntmSwitchProps]
  }
}

