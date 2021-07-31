package typings.antDesignPro

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loginItemMod {
  
  @JSImport("ant-design-pro/lib/Login/LoginItem", JSImport.Default)
  @js.native
  class default ()
    extends Component[LoginItemProps, js.Any, js.Any]
  
  type LoginItem = Component[LoginItemProps, js.Any, js.Any]
  
  trait LoginItemProps extends StObject {
    
    var buttonText: js.UndefOr[ReactNode] = js.undefined
    
    var countDown: js.UndefOr[Double] = js.undefined
    
    var customprops: js.UndefOr[js.Any] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ js.Any
    
    var getCaptchaButtonText: js.UndefOr[String] = js.undefined
    
    var getCaptchaSecondText: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
    
    var onGetCaptcha: js.UndefOr[js.Function1[/* event */ js.UndefOr[MouseEvent], Unit]] = js.undefined
    
    var onPressEnter: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var rules: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var `type`: String
    
    def updateActive(activeItem: js.Any): Unit
  }
  object LoginItemProps {
    
    @scala.inline
    def apply(
      form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ js.Any,
      `type`: String,
      updateActive: js.Any => Unit
    ): LoginItemProps = {
      val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], updateActive = js.Any.fromFunction1(updateActive))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginItemProps]
    }
    
    @scala.inline
    implicit class LoginItemPropsMutableBuilder[Self <: LoginItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonText(value: ReactNode): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      @scala.inline
      def setCountDown(value: Double): Self = StObject.set(x, "countDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountDownUndefined: Self = StObject.set(x, "countDown", js.undefined)
      
      @scala.inline
      def setCustomprops(value: js.Any): Self = StObject.set(x, "customprops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustompropsUndefined: Self = StObject.set(x, "customprops", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setForm(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ js.Any
      ): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCaptchaButtonText(value: String): Self = StObject.set(x, "getCaptchaButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCaptchaButtonTextUndefined: Self = StObject.set(x, "getCaptchaButtonText", js.undefined)
      
      @scala.inline
      def setGetCaptchaSecondText(value: String): Self = StObject.set(x, "getCaptchaSecondText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCaptchaSecondTextUndefined: Self = StObject.set(x, "getCaptchaSecondText", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnGetCaptcha(value: /* event */ js.UndefOr[MouseEvent] => Unit): Self = StObject.set(x, "onGetCaptcha", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGetCaptchaUndefined: Self = StObject.set(x, "onGetCaptcha", js.undefined)
      
      @scala.inline
      def setOnPressEnter(value: /* e */ js.Any => Unit): Self = StObject.set(x, "onPressEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressEnterUndefined: Self = StObject.set(x, "onPressEnter", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setRules(value: js.Array[js.Any]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: js.Any*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateActive(value: js.Any => Unit): Self = StObject.set(x, "updateActive", js.Any.fromFunction1(value))
    }
  }
  
  type LoginItemType = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemMap * / any ]: react.react.FC<ant-design-pro.ant-design-pro/lib/Login/LoginItem.WrappedLoginItemProps>}
    */ typings.antDesignPro.antDesignProStrings.LoginItemType & TopLevel[js.Any]
  
  /* Inlined antd.antd/lib/_util/type.Omit<ant-design-pro.ant-design-pro/lib/Login/LoginItem.LoginItemProps, 'form' | 'type' | 'updateActive'> */
  trait WrappedLoginItemProps extends StObject {
    
    var buttonText: js.UndefOr[ReactNode] = js.undefined
    
    var countDown: js.UndefOr[Double] = js.undefined
    
    var customprops: js.UndefOr[js.Any] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var getCaptchaButtonText: js.UndefOr[String] = js.undefined
    
    var getCaptchaSecondText: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
    
    var onGetCaptcha: js.UndefOr[js.Function1[/* event */ js.UndefOr[MouseEvent], Unit]] = js.undefined
    
    var onPressEnter: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var rules: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object WrappedLoginItemProps {
    
    @scala.inline
    def apply(): WrappedLoginItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrappedLoginItemProps]
    }
    
    @scala.inline
    implicit class WrappedLoginItemPropsMutableBuilder[Self <: WrappedLoginItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonText(value: ReactNode): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      @scala.inline
      def setCountDown(value: Double): Self = StObject.set(x, "countDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountDownUndefined: Self = StObject.set(x, "countDown", js.undefined)
      
      @scala.inline
      def setCustomprops(value: js.Any): Self = StObject.set(x, "customprops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustompropsUndefined: Self = StObject.set(x, "customprops", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setGetCaptchaButtonText(value: String): Self = StObject.set(x, "getCaptchaButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCaptchaButtonTextUndefined: Self = StObject.set(x, "getCaptchaButtonText", js.undefined)
      
      @scala.inline
      def setGetCaptchaSecondText(value: String): Self = StObject.set(x, "getCaptchaSecondText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCaptchaSecondTextUndefined: Self = StObject.set(x, "getCaptchaSecondText", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnGetCaptcha(value: /* event */ js.UndefOr[MouseEvent] => Unit): Self = StObject.set(x, "onGetCaptcha", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGetCaptchaUndefined: Self = StObject.set(x, "onGetCaptcha", js.undefined)
      
      @scala.inline
      def setOnPressEnter(value: /* e */ js.Any => Unit): Self = StObject.set(x, "onPressEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressEnterUndefined: Self = StObject.set(x, "onPressEnter", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setRules(value: js.Array[js.Any]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: js.Any*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
