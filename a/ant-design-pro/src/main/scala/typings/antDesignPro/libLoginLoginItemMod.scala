package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoginLoginItemMod {
  
  @JSImport("ant-design-pro/lib/Login/LoginItem", JSImport.Default)
  @js.native
  open class default () extends Component[LoginItemProps, Any, Any]
  
  type LoginItem = Component[LoginItemProps, Any, Any]
  
  trait LoginItemProps extends StObject {
    
    var buttonText: js.UndefOr[ReactNode] = js.undefined
    
    var countDown: js.UndefOr[Double] = js.undefined
    
    var customprops: js.UndefOr[Any] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ Any
    
    var getCaptchaButtonText: js.UndefOr[String] = js.undefined
    
    var getCaptchaSecondText: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    var onGetCaptcha: js.UndefOr[js.Function1[/* event */ js.UndefOr[MouseEvent], Unit]] = js.undefined
    
    var onPressEnter: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var rules: js.UndefOr[js.Array[Any]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var `type`: String
    
    def updateActive(activeItem: Any): Unit
  }
  object LoginItemProps {
    
    inline def apply(
      form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ Any,
      `type`: String,
      updateActive: Any => Unit
    ): LoginItemProps = {
      val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], updateActive = js.Any.fromFunction1(updateActive))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginItemProps]
    }
    
    extension [Self <: LoginItemProps](x: Self) {
      
      inline def setButtonText(value: ReactNode): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setCountDown(value: Double): Self = StObject.set(x, "countDown", value.asInstanceOf[js.Any])
      
      inline def setCountDownUndefined: Self = StObject.set(x, "countDown", js.undefined)
      
      inline def setCustomprops(value: Any): Self = StObject.set(x, "customprops", value.asInstanceOf[js.Any])
      
      inline def setCustompropsUndefined: Self = StObject.set(x, "customprops", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setForm(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ Any
      ): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setGetCaptchaButtonText(value: String): Self = StObject.set(x, "getCaptchaButtonText", value.asInstanceOf[js.Any])
      
      inline def setGetCaptchaButtonTextUndefined: Self = StObject.set(x, "getCaptchaButtonText", js.undefined)
      
      inline def setGetCaptchaSecondText(value: String): Self = StObject.set(x, "getCaptchaSecondText", value.asInstanceOf[js.Any])
      
      inline def setGetCaptchaSecondTextUndefined: Self = StObject.set(x, "getCaptchaSecondText", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* e */ Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnGetCaptcha(value: /* event */ js.UndefOr[MouseEvent] => Unit): Self = StObject.set(x, "onGetCaptcha", js.Any.fromFunction1(value))
      
      inline def setOnGetCaptchaUndefined: Self = StObject.set(x, "onGetCaptcha", js.undefined)
      
      inline def setOnPressEnter(value: /* e */ Any => Unit): Self = StObject.set(x, "onPressEnter", js.Any.fromFunction1(value))
      
      inline def setOnPressEnterUndefined: Self = StObject.set(x, "onPressEnter", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRules(value: js.Array[Any]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Any*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUpdateActive(value: Any => Unit): Self = StObject.set(x, "updateActive", js.Any.fromFunction1(value))
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemMap * / any ]: react.react.FC<ant-design-pro.ant-design-pro/lib/Login/LoginItem.WrappedLoginItemProps>}
    }}}
    */
  @js.native
  trait LoginItemType extends StObject
  
  /* Inlined std.Omit<ant-design-pro.ant-design-pro/lib/Login/LoginItem.LoginItemProps, 'form' | 'type' | 'updateActive'> */
  trait WrappedLoginItemProps extends StObject {
    
    var buttonText: js.UndefOr[ReactNode] = js.undefined
    
    var countDown: js.UndefOr[Double] = js.undefined
    
    var customprops: js.UndefOr[Any] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var getCaptchaButtonText: js.UndefOr[String] = js.undefined
    
    var getCaptchaSecondText: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    var onGetCaptcha: js.UndefOr[js.Function1[/* event */ js.UndefOr[MouseEvent], Unit]] = js.undefined
    
    var onPressEnter: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var rules: js.UndefOr[js.Array[Any]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object WrappedLoginItemProps {
    
    inline def apply(): WrappedLoginItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrappedLoginItemProps]
    }
    
    extension [Self <: WrappedLoginItemProps](x: Self) {
      
      inline def setButtonText(value: ReactNode): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setCountDown(value: Double): Self = StObject.set(x, "countDown", value.asInstanceOf[js.Any])
      
      inline def setCountDownUndefined: Self = StObject.set(x, "countDown", js.undefined)
      
      inline def setCustomprops(value: Any): Self = StObject.set(x, "customprops", value.asInstanceOf[js.Any])
      
      inline def setCustompropsUndefined: Self = StObject.set(x, "customprops", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setGetCaptchaButtonText(value: String): Self = StObject.set(x, "getCaptchaButtonText", value.asInstanceOf[js.Any])
      
      inline def setGetCaptchaButtonTextUndefined: Self = StObject.set(x, "getCaptchaButtonText", js.undefined)
      
      inline def setGetCaptchaSecondText(value: String): Self = StObject.set(x, "getCaptchaSecondText", value.asInstanceOf[js.Any])
      
      inline def setGetCaptchaSecondTextUndefined: Self = StObject.set(x, "getCaptchaSecondText", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* e */ Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnGetCaptcha(value: /* event */ js.UndefOr[MouseEvent] => Unit): Self = StObject.set(x, "onGetCaptcha", js.Any.fromFunction1(value))
      
      inline def setOnGetCaptchaUndefined: Self = StObject.set(x, "onGetCaptcha", js.undefined)
      
      inline def setOnPressEnter(value: /* e */ Any => Unit): Self = StObject.set(x, "onPressEnter", js.Any.fromFunction1(value))
      
      inline def setOnPressEnterUndefined: Self = StObject.set(x, "onPressEnter", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRules(value: js.Array[Any]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Any*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
