package typings.atAntDashDesignReactDashNative.libSwitchMod

import typings.atAntDashDesignReactDashNative.libSwitchPropsTypeMod.SwitchPropsType
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
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
    style: StyleProp[ViewStyle] = null
  ): AntmSwitchProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntmSwitchProps]
  }
}

