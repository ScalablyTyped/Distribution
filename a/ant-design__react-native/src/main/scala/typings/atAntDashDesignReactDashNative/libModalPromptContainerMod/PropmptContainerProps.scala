package typings.atAntDashDesignReactDashNative.libModalPromptContainerMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`login-password`
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`secure-text`
import typings.atAntDashDesignReactDashNative.libModalPropsTypeMod.CallbackOnBackHandler
import typings.atAntDashDesignReactDashNative.libModalPropsTypeMod.CallbackOrActions
import typings.atAntDashDesignReactDashNative.libModalStylePromptMod.PromptStyle
import typings.atAntDashDesignReactDashNative.libStyleMod.WithThemeStyles
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropmptContainerProps extends WithThemeStyles[PromptStyle] {
  var actions: CallbackOrActions[TextStyle]
  var defaultValue: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[ReactNode] = js.undefined
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var onBackHandler: js.UndefOr[CallbackOnBackHandler] = js.undefined
  var placeholders: js.UndefOr[js.Array[String]] = js.undefined
  var title: ReactNode
  var `type`: js.UndefOr[
    typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.default | `login-password` | `secure-text`
  ] = js.undefined
}

object PropmptContainerProps {
  @scala.inline
  def apply(
    actions: CallbackOrActions[TextStyle],
    defaultValue: String = null,
    message: ReactNode = null,
    onAnimationEnd: /* visible */ Boolean => Unit = null,
    onBackHandler: () => Boolean = null,
    placeholders: js.Array[String] = null,
    styles: Partial[PromptStyle] = null,
    title: ReactNode = null,
    `type`: typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.default | `login-password` | `secure-text` = null
  ): PropmptContainerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onBackHandler != null) __obj.updateDynamic("onBackHandler")(js.Any.fromFunction0(onBackHandler))
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropmptContainerProps]
  }
}

