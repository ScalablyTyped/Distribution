package typings
package atAntDashDesignReactDashNativeLib.libSwipeDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeoutButtonProps
  extends reactDashNativeDashSwipeoutLib.reactDashNativeDashSwipeoutMod.SwipeoutButtonProperties {
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] with atAntDashDesignReactDashNativeLib.Anon_BackgroundColor
  ] = js.undefined
}

object SwipeoutButtonProps {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    color: java.lang.String = null,
    component: reactLib.reactMod.Global.JSXNs.Element = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onPress: () => scala.Unit = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] with atAntDashDesignReactDashNativeLib.Anon_BackgroundColor = null,
    text: reactLib.reactMod.ReactNode = null,
    `type`: reactDashNativeDashSwipeoutLib.reactDashNativeDashSwipeoutLibStrings.default | reactDashNativeDashSwipeoutLib.reactDashNativeDashSwipeoutLibStrings.delete | reactDashNativeDashSwipeoutLib.reactDashNativeDashSwipeoutLibStrings.primary | reactDashNativeDashSwipeoutLib.reactDashNativeDashSwipeoutLibStrings.secondary = null,
    underlayColor: java.lang.String = null
  ): SwipeoutButtonProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (color != null) __obj.updateDynamic("color")(color)
    if (component != null) __obj.updateDynamic("component")(component)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor)
    __obj.asInstanceOf[SwipeoutButtonProps]
  }
}

