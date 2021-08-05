package typings.antDesignReactNative

import typings.antDesignReactNative.anon.AntLocale
import typings.antDesignReactNative.anon.Type
import typings.antDesignReactNative.antDesignReactNativeStrings.`login-password`
import typings.antDesignReactNative.antDesignReactNativeStrings.`secure-text`
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.modalPropsTypeMod.Action
import typings.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typings.antDesignReactNative.modalPropsTypeMod.CallbackOrActions
import typings.antDesignReactNative.stylePromptMod.PromptStyle
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promptContainerMod {
  
  @JSImport("@ant-design/react-native/lib/modal/PromptContainer", JSImport.Default)
  @js.native
  class default protected () extends PropmptContainer {
    def this(props: PropmptContainerProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/modal/PromptContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/modal/PromptContainer", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    inline def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/modal/PromptContainer", "default.defaultProps")
    @js.native
    def defaultProps: Type = js.native
    inline def defaultProps_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PropmptContainer
    extends Component[PropmptContainerProps, js.Any, js.Any] {
    
    def onBackAndroid(): Boolean = js.native
    
    def onChangeText(`type`: String, value: String): Unit = js.native
    
    def onClose(): Unit = js.native
  }
  
  trait PropmptContainerProps
    extends StObject
       with WithThemeStyles[PromptStyle] {
    
    var actions: CallbackOrActions[TextStyle]
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[ReactNode] = js.undefined
    
    var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var onBackHandler: js.UndefOr[CallbackOnBackHandler] = js.undefined
    
    var placeholders: js.UndefOr[js.Array[String]] = js.undefined
    
    var title: ReactNode
    
    var `type`: js.UndefOr[
        typings.antDesignReactNative.antDesignReactNativeStrings.default | `login-password` | `secure-text`
      ] = js.undefined
  }
  object PropmptContainerProps {
    
    inline def apply(actions: CallbackOrActions[TextStyle]): PropmptContainerProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropmptContainerProps]
    }
    
    extension [Self <: PropmptContainerProps](x: Self) {
      
      inline def setActions(value: CallbackOrActions[TextStyle]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsFunction2(value: (/* valueOrLogin */ String, /* password */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "actions", js.Any.fromFunction2(value))
      
      inline def setActionsVarargs(value: Action[TextStyle]*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setMessage(value: ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnBackHandler(value: () => Boolean): Self = StObject.set(x, "onBackHandler", js.Any.fromFunction0(value))
      
      inline def setOnBackHandlerUndefined: Self = StObject.set(x, "onBackHandler", js.undefined)
      
      inline def setPlaceholders(value: js.Array[String]): Self = StObject.set(x, "placeholders", value.asInstanceOf[js.Any])
      
      inline def setPlaceholdersUndefined: Self = StObject.set(x, "placeholders", js.undefined)
      
      inline def setPlaceholdersVarargs(value: String*): Self = StObject.set(x, "placeholders", js.Array(value :_*))
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(
        value: typings.antDesignReactNative.antDesignReactNativeStrings.default | `login-password` | `secure-text`
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
