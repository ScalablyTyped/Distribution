package typings.antDesignReactNative.promptContainerMod

import typings.antDesignReactNative.antDesignReactNativeStrings.`login-password`
import typings.antDesignReactNative.antDesignReactNativeStrings.`secure-text`
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.modalPropsTypeMod.Action
import typings.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typings.antDesignReactNative.modalPropsTypeMod.CallbackOrActions
import typings.antDesignReactNative.stylePromptMod.PromptStyle
import typings.react.mod.ReactNode
import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropmptContainerProps extends WithThemeStyles[PromptStyle] {
  var actions: CallbackOrActions[TextStyle] = js.native
  var defaultValue: js.UndefOr[String] = js.native
  var message: js.UndefOr[ReactNode] = js.native
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  var onBackHandler: js.UndefOr[CallbackOnBackHandler] = js.native
  var placeholders: js.UndefOr[js.Array[String]] = js.native
  var title: ReactNode = js.native
  var `type`: js.UndefOr[
    typings.antDesignReactNative.antDesignReactNativeStrings.default | `login-password` | `secure-text`
  ] = js.native
}

object PropmptContainerProps {
  @scala.inline
  def apply(actions: CallbackOrActions[TextStyle]): PropmptContainerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropmptContainerProps]
  }
  @scala.inline
  implicit class PropmptContainerPropsOps[Self <: PropmptContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionsVarargs(value: Action[TextStyle]*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActionsFunction2(value: (/* valueOrLogin */ String, /* password */ js.UndefOr[String]) => Unit): Self = this.set("actions", js.Any.fromFunction2(value))
    @scala.inline
    def setActions(value: CallbackOrActions[TextStyle]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setMessage(value: ReactNode): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    @scala.inline
    def setOnBackHandler(value: () => Boolean): Self = this.set("onBackHandler", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBackHandler: Self = this.set("onBackHandler", js.undefined)
    @scala.inline
    def setPlaceholdersVarargs(value: String*): Self = this.set("placeholders", js.Array(value :_*))
    @scala.inline
    def setPlaceholders(value: js.Array[String]): Self = this.set("placeholders", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholders: Self = this.set("placeholders", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(
      value: typings.antDesignReactNative.antDesignReactNativeStrings.default | `login-password` | `secure-text`
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

