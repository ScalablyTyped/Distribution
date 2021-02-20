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
import scala.scalajs.js.`|`
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
    @scala.inline
    def defaultProps_=(x: Animated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
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
    
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.alert")
    @js.native
    def alert(title: ReactNode, message: ReactNode): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.alert")
    @js.native
    def alert(title: ReactNode, message: ReactNode, actions: js.UndefOr[scala.Nothing], platform: String): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.alert")
    @js.native
    def alert(title: ReactNode, message: ReactNode, actions: js.Array[Action[CSSProperties]]): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.alert")
    @js.native
    def alert(title: ReactNode, message: ReactNode, actions: js.Array[Action[CSSProperties]], platform: String): Close = js.native
    
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.operation")
    @js.native
    def operation(): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.operation")
    @js.native
    def operation(actions: js.UndefOr[scala.Nothing], platform: String): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.operation")
    @js.native
    def operation(actions: js.Array[Action[CSSProperties]]): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.operation")
    @js.native
    def operation(actions: js.Array[Action[CSSProperties]], platform: String): Close = js.native
    
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt(title: ReactNode, message: ReactNode, callbackOrActions: CallbackOrActions[CSSProperties]): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: js.UndefOr[scala.Nothing],
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.UndefOr[scala.Nothing],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: js.UndefOr[scala.Nothing],
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.Array[String]
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: js.UndefOr[scala.Nothing],
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.Array[String],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: js.UndefOr[scala.Nothing],
      defaultValue: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: js.UndefOr[scala.Nothing],
      defaultValue: String,
      placeholders: js.UndefOr[scala.Nothing],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: js.UndefOr[scala.Nothing],
      defaultValue: String,
      placeholders: js.Array[String]
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: js.UndefOr[scala.Nothing],
      defaultValue: String,
      placeholders: js.Array[String],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_default(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typings.antdMobile.antdMobileStrings.default
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_default(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typings.antdMobile.antdMobileStrings.default,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.UndefOr[scala.Nothing],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_default(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typings.antdMobile.antdMobileStrings.default,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.Array[String]
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_default(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typings.antdMobile.antdMobileStrings.default,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.Array[String],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_default(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typings.antdMobile.antdMobileStrings.default,
      defaultValue: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_default(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typings.antdMobile.antdMobileStrings.default,
      defaultValue: String,
      placeholders: js.UndefOr[scala.Nothing],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_default(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typings.antdMobile.antdMobileStrings.default,
      defaultValue: String,
      placeholders: js.Array[String]
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_default(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: typings.antdMobile.antdMobileStrings.default,
      defaultValue: String,
      placeholders: js.Array[String],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_loginpassword(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_loginpassword(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.UndefOr[scala.Nothing],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_loginpassword(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.Array[String]
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_loginpassword(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.Array[String],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_loginpassword(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_loginpassword(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: String,
      placeholders: js.UndefOr[scala.Nothing],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_loginpassword(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: String,
      placeholders: js.Array[String]
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_loginpassword(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `login-password`,
      defaultValue: String,
      placeholders: js.Array[String],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_securetext(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_securetext(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.UndefOr[scala.Nothing],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_securetext(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.Array[String]
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_securetext(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: js.UndefOr[scala.Nothing],
      placeholders: js.Array[String],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_securetext(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_securetext(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: String,
      placeholders: js.UndefOr[scala.Nothing],
      platform: String
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_securetext(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: String,
      placeholders: js.Array[String]
    ): Close = js.native
    @JSImport("antd-mobile/lib/modal/Modal", "ModalComponent.prompt")
    @js.native
    def prompt_securetext(
      title: ReactNode,
      message: ReactNode,
      callbackOrActions: CallbackOrActions[CSSProperties],
      `type`: `secure-text`,
      defaultValue: String,
      placeholders: js.Array[String],
      platform: String
    ): Close = js.native
  }
  
  @js.native
  trait Modal
    extends ModalComponent[ModalProps, js.Any] {
    
    def renderFooterButton(button: Action[CSSProperties], prefixCls: js.UndefOr[scala.Nothing], i: Double): Element = js.native
    def renderFooterButton(button: Action[CSSProperties], prefixCls: String, i: Double): Element = js.native
  }
  
  @js.native
  trait ModalProps extends ModalPropsType[CSSProperties] {
    
    var bodyStyle: js.UndefOr[CSSProperties] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var maskTransitionName: js.UndefOr[String] = js.native
    
    var platform: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var wrapClassName: js.UndefOr[String] = js.native
    
    var wrapProps: js.UndefOr[PartialHTMLPropsHTMLDivEl] = js.native
  }
  object ModalProps {
    
    @scala.inline
    def apply(visible: Boolean): ModalProps = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit class ModalPropsMutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setWrapClassName(value: String): Self = StObject.set(x, "wrapClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapClassNameUndefined: Self = StObject.set(x, "wrapClassName", js.undefined)
      
      @scala.inline
      def setWrapProps(value: PartialHTMLPropsHTMLDivEl): Self = StObject.set(x, "wrapProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapPropsUndefined: Self = StObject.set(x, "wrapProps", js.undefined)
    }
  }
}
