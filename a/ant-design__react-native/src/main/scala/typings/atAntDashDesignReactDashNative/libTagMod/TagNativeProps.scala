package typings.atAntDashDesignReactDashNative.libTagMod

import typings.atAntDashDesignReactDashNative.libStyleMod.WithThemeStyles
import typings.atAntDashDesignReactDashNative.libTagPropsTypeMod.TagPropsType
import typings.atAntDashDesignReactDashNative.libTagStyleMod.TagStyle
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagNativeProps
  extends TagPropsType
     with WithThemeStyles[TagStyle] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object TagNativeProps {
  @scala.inline
  def apply(
    afterClose: () => Unit = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* selected */ Boolean => Unit = null,
    onClose: () => Unit = null,
    onLongPress: () => Unit = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    small: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[TagStyle] = null
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

