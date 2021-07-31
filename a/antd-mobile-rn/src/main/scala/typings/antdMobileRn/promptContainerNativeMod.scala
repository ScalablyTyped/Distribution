package typings.antdMobileRn

import typings.antdMobileRn.anon.AntLocale
import typings.antdMobileRn.anon.Type
import typings.antdMobileRn.antdMobileRnStrings.`login-password`
import typings.antdMobileRn.antdMobileRnStrings.`secure-text`
import typings.antdMobileRn.modalPropsTypeMod.Action
import typings.antdMobileRn.modalPropsTypeMod.CallbackOrActions
import typings.antdMobileRn.promptDotnativeMod.IPromptStyle
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promptContainerNativeMod {
  
  @JSImport("antd-mobile-rn/lib/modal/PromptContainer.native", JSImport.Default)
  @js.native
  class default protected () extends PropmptContainer {
    def this(props: PropmptContainerProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/modal/PromptContainer.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/modal/PromptContainer.native", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/modal/PromptContainer.native", "default.defaultProps")
    @js.native
    def defaultProps: Type = js.native
    @scala.inline
    def defaultProps_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PropmptContainer
    extends Component[PropmptContainerProps, js.Any, js.Any] {
    
    def onChangeText(`type`: String, value: String): Unit = js.native
    
    def onClose(): Unit = js.native
  }
  
  trait PropmptContainerProps extends StObject {
    
    var actions: CallbackOrActions[TextStyle]
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[ReactNode] = js.undefined
    
    var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var placeholders: js.UndefOr[js.Array[String]] = js.undefined
    
    var styles: js.UndefOr[IPromptStyle] = js.undefined
    
    var title: ReactNode
    
    var `type`: js.UndefOr[
        typings.antdMobileRn.antdMobileRnStrings.default | `login-password` | `secure-text`
      ] = js.undefined
  }
  object PropmptContainerProps {
    
    @scala.inline
    def apply(actions: CallbackOrActions[TextStyle]): PropmptContainerProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropmptContainerProps]
    }
    
    @scala.inline
    implicit class PropmptContainerPropsMutableBuilder[Self <: PropmptContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: CallbackOrActions[TextStyle]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsFunction2(value: (/* valueOrLogin */ String, /* password */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "actions", js.Any.fromFunction2(value))
      
      @scala.inline
      def setActionsVarargs(value: Action[TextStyle]*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setMessage(value: ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setPlaceholders(value: js.Array[String]): Self = StObject.set(x, "placeholders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholdersUndefined: Self = StObject.set(x, "placeholders", js.undefined)
      
      @scala.inline
      def setPlaceholdersVarargs(value: String*): Self = StObject.set(x, "placeholders", js.Array(value :_*))
      
      @scala.inline
      def setStyles(value: IPromptStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: typings.antdMobileRn.antdMobileRnStrings.default | `login-password` | `secure-text`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
