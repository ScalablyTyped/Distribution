package typings.antdDashMobileDashRn.libModalPromptContainerDotNativeMod

import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.`login-password`
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.`secure-text`
import typings.antdDashMobileDashRn.libModalPropsTypeMod.CallbackOrActions
import typings.antdDashMobileDashRn.libModalStylePromptDotNativeMod.IPromptStyle
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropmptContainerProps extends js.Object {
  var actions: CallbackOrActions[TextStyle]
  var defaultValue: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[ReactNode] = js.undefined
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var placeholders: js.UndefOr[js.Array[String]] = js.undefined
  var styles: js.UndefOr[IPromptStyle] = js.undefined
  var title: ReactNode
  var `type`: js.UndefOr[
    typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.default | `login-password` | `secure-text`
  ] = js.undefined
}

object PropmptContainerProps {
  @scala.inline
  def apply(
    actions: CallbackOrActions[TextStyle],
    defaultValue: String = null,
    message: ReactNode = null,
    onAnimationEnd: /* visible */ Boolean => Unit = null,
    placeholders: js.Array[String] = null,
    styles: IPromptStyle = null,
    title: ReactNode = null,
    `type`: typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.default | `login-password` | `secure-text` = null
  ): PropmptContainerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropmptContainerProps]
  }
}

