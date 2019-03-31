package typings
package antdDashMobileDashRnLib.libSwipeDashActionIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeActionProps
  extends antdDashMobileDashRnLib.libSwipeDashActionPropsTypeMod.SwipeActionPropsType[reactDashNativeLib.reactDashNativeMod.TextStyle] {
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
}

object SwipeActionProps {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    left: js.Array[
      antdDashMobileDashRnLib.Anon_ClassName[reactDashNativeLib.reactDashNativeMod.TextStyle]
    ] = null,
    onClose: () => scala.Unit = null,
    onOpen: () => scala.Unit = null,
    right: js.Array[
      antdDashMobileDashRnLib.Anon_ClassName[reactDashNativeLib.reactDashNativeMod.TextStyle]
    ] = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: js.Any = null,
    title: java.lang.String = null
  ): SwipeActionProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (left != null) __obj.updateDynamic("left")(left)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (right != null) __obj.updateDynamic("right")(right)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SwipeActionProps]
  }
}

