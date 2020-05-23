package typings.antDesignReactNative.swipeActionMod

import typings.antDesignReactNative.anon.BackgroundColor
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNativeSwipeout.mod.SwipeoutButtonProperties
import typings.reactNativeSwipeout.reactNativeSwipeoutStrings.delete
import typings.reactNativeSwipeout.reactNativeSwipeoutStrings.primary
import typings.reactNativeSwipeout.reactNativeSwipeoutStrings.secondary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeoutButtonProps extends SwipeoutButtonProperties {
  var style: js.UndefOr[StyleProp[TextStyle] with BackgroundColor] = js.undefined
}

object SwipeoutButtonProps {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    color: String = null,
    component: Element = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onPress: () => Unit = null,
    style: StyleProp[TextStyle] with BackgroundColor = null,
    text: ReactNode = null,
    `type`: typings.reactNativeSwipeout.reactNativeSwipeoutStrings.default | delete | primary | secondary = null,
    underlayColor: String = null
  ): SwipeoutButtonProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeoutButtonProps]
  }
}

