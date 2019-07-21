package typings
package atAntDashDesignReactDashNativeLib.esTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagNativeProps
  extends atAntDashDesignReactDashNativeLib.esTagPropsTypeMod.TagPropsType
     with atAntDashDesignReactDashNativeLib.esStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.esTagStyleMod.TagStyle] {
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object TagNativeProps {
  @scala.inline
  def apply(
    afterClose: () => scala.Unit = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* selected */ scala.Boolean => scala.Unit = null,
    onClose: () => scala.Unit = null,
    onLongPress: () => scala.Unit = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    small: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.esTagStyleMod.TagStyle] = null
  ): TagNativeProps = {
    val __obj = js.Dynamic.literal()
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction0(afterClose))
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[TagNativeProps]
  }
}

