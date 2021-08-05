package typings.antdMobile

import typings.antdMobile.anon.Animated
import typings.antdMobile.anon.Close
import typings.antdMobile.anon.PartialHTMLPropsHTMLDivEl
import typings.antdMobile.antdMobileStrings.`login-password`
import typings.antdMobile.antdMobileStrings.`secure-text`
import typings.antdMobile.modalPropsTypeMod.Action
import typings.antdMobile.modalPropsTypeMod.CallbackOrActions
import typings.antdMobile.modalPropsTypeMod.ModalPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalModalMod {
  
  @JSImport("antd-mobile/lib/modal/Modal", JSImport.Default)
  @js.native
  class default () extends Modal
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/modal/Modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/modal/Modal", "default.defaultProps")
    @js.native
    def defaultProps: Animated = js.native
    inline def defaultProps_=(x: Animated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent")
  @js.native
  abstract class ModalComponent[P, S] protected ()
    extends Component[P, S, js.Any] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: js.Any) = this()
  }
  /* static members */
  object ModalComponent {
    
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def alert(title: ReactNode, message: ReactNode): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def alert(title: ReactNode, message: ReactNode, actions: js.Array[Action[CSSProperties]]): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def alert(title: ReactNode, message: ReactNode, actions: js.Array[Action[CSSProperties]], platform: String): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def alert(title: ReactNode, message: ReactNode, actions: Unit, platform: String): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    
    inline def operation(): Close = ^.asInstanceOf[js.Dynamic].applyDynamic("operation")().asInstanceOf[Close]
    inline def operation(actions: js.Array[Action[CSSProperties]]): Close = ^.asInstanceOf[js.Dynamic].applyDynamic("operation")(actions.asInstanceOf[js.Any]).asInstanceOf[Close]
    inline def operation(actions: js.Array[Action[CSSProperties]], platform: String): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("operation")(actions.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def operation(actions: Unit, platform: String): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("operation")(actions.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    
    inline def prompt(title: ReactNode, message: ReactNode, callbackOrActions: CallbackOrActions[CSSProperties]): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: Unit,
      defaultValue: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: Unit,
      defaultValue: String,
      placeholders: js.Array[String]
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: Unit,
      defaultValue: String,
      placeholders: js.Array[String],
      platform: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: Unit,
      defaultValue: String,
      placeholders: Unit,
      platform: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: Unit,
      defaultValue: Unit,
      placeholders: js.Array[String]
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: Unit,
      defaultValue: Unit,
      placeholders: js.Array[String],
      platform: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: Unit,
      defaultValue: Unit,
      placeholders: Unit,
      platform: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    
    inline def prompt_default(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typings.antdMobile.antdMobileStrings.default
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_default(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typings.antdMobile.antdMobileStrings.default,
      defaultValue: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_default(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typings.antdMobile.antdMobileStrings.default,
      defaultValue: String,
      placeholders: js.Array[String]
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_default(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typings.antdMobile.antdMobileStrings.default,
      defaultValue: String,
      placeholders: js.Array[String],
      platform: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_default(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typings.antdMobile.antdMobileStrings.default,
      defaultValue: String,
      placeholders: Unit,
      platform: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_default(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typings.antdMobile.antdMobileStrings.default,
      defaultValue: Unit,
      placeholders: js.Array[String]
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_default(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typings.antdMobile.antdMobileStrings.default,
      defaultValue: Unit,
      placeholders: js.Array[String],
      platform: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_default(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typings.antdMobile.antdMobileStrings.default,
      defaultValue: Unit,
      placeholders: Unit,
      platform: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    
    inline def prompt_loginpassword(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_loginpassword(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_loginpassword(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: String,
      placeholders: js.Array[String]
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_loginpassword(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: String,
      placeholders: js.Array[String],
      platform: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_loginpassword(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: String,
      placeholders: Unit,
      platform: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_loginpassword(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: Unit,
      placeholders: js.Array[String]
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_loginpassword(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: Unit,
      placeholders: js.Array[String],
      platform: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_loginpassword(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: Unit,
      placeholders: Unit,
      platform: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    
    inline def prompt_securetext(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_securetext(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_securetext(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: String,
      placeholders: js.Array[String]
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_securetext(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: String,
      placeholders: js.Array[String],
      platform: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_securetext(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: String,
      placeholders: Unit,
      platform: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_securetext(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: Unit,
      placeholders: js.Array[String]
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_securetext(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: Unit,
      placeholders: js.Array[String],
      platform: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
    inline def prompt_securetext(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: Unit,
      placeholders: Unit,
      platform: String
    ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackOrActions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Close]
  }
  
  @js.native
  trait Modal
    extends ModalComponent[ModalProps, js.Any] {
    
    def renderFooterButton(button: Action[CSSProperties], prefixCls: String, i: Double): Element = js.native
    def renderFooterButton(button: Action[CSSProperties], prefixCls: Unit, i: Double): Element = js.native
  }
  
  trait ModalProps
    extends StObject
       with ModalPropsType[CSSProperties] {
    
    var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var maskTransitionName: js.UndefOr[String] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var wrapClassName: js.UndefOr[String] = js.undefined
    
    var wrapProps: js.UndefOr[PartialHTMLPropsHTMLDivEl] = js.undefined
  }
  object ModalProps {
    
    inline def apply(visible: Boolean): ModalProps = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalProps]
    }
    
    extension [Self <: ModalProps](x: Self) {
      
      inline def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      inline def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setWrapClassName(value: String): Self = StObject.set(x, "wrapClassName", value.asInstanceOf[js.Any])
      
      inline def setWrapClassNameUndefined: Self = StObject.set(x, "wrapClassName", js.undefined)
      
      inline def setWrapProps(value: PartialHTMLPropsHTMLDivEl): Self = StObject.set(x, "wrapProps", value.asInstanceOf[js.Any])
      
      inline def setWrapPropsUndefined: Self = StObject.set(x, "wrapProps", js.undefined)
    }
  }
}
