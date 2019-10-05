package typings.atAntDashDesignReactDashNative.libSwipeDashActionMod

import typings.atAntDashDesignReactDashNative.Anon_BackgroundColor
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNativeDashSwipeout.reactDashNativeDashSwipeoutMod.SwipeoutButtonProperties
import typings.reactDashNativeDashSwipeout.reactDashNativeDashSwipeoutStrings.delete
import typings.reactDashNativeDashSwipeout.reactDashNativeDashSwipeoutStrings.primary
import typings.reactDashNativeDashSwipeout.reactDashNativeDashSwipeoutStrings.secondary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeoutButtonProps extends SwipeoutButtonProperties {
  var style: js.UndefOr[StyleProp[TextStyle] with Anon_BackgroundColor] = js.undefined
}

object SwipeoutButtonProps {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    color: String = null,
    component: Element = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onPress: () => Unit = null,
    style: StyleProp[TextStyle] with Anon_BackgroundColor = null,
    text: ReactNode = null,
    `type`: typings.reactDashNativeDashSwipeout.reactDashNativeDashSwipeoutStrings.default | delete | primary | secondary = null,
    underlayColor: String = null
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

