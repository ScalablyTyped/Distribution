package typings.antDesignPro

import typings.antDesignPro.loginItemMod.LoginItemProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loginMod {
  
  @JSImport("ant-design-pro/lib/Login", JSImport.Default)
  @js.native
  class default () extends Login
  object default {
    
    @JSImport("ant-design-pro/lib/Login", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("ant-design-pro/lib/Login", "default.Captcha")
    @js.native
    def Captcha: FC[LoginItemProps] = js.native
    @scala.inline
    def Captcha_=(x: FC[LoginItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Captcha")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("ant-design-pro/lib/Login", "default.Mobile")
    @js.native
    def Mobile: FC[LoginItemProps] = js.native
    @scala.inline
    def Mobile_=(x: FC[LoginItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mobile")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("ant-design-pro/lib/Login", "default.Password")
    @js.native
    def Password: FC[LoginItemProps] = js.native
    @scala.inline
    def Password_=(x: FC[LoginItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Password")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("ant-design-pro/lib/Login", "default.Submit")
    @js.native
    def Submit: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof LoginSubmit */ js.Any = js.native
    @scala.inline
    def Submit_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof LoginSubmit */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Submit")(x.asInstanceOf[js.Any])
    
    /* was `typeof LoginTab` */
    @JSImport("ant-design-pro/lib/Login", "default.Tab")
    @js.native
    class Tab ()
      extends typings.antDesignPro.loginTabMod.default
    
    /* static member */
    @JSImport("ant-design-pro/lib/Login", "default.UserName")
    @js.native
    def UserName: FC[LoginItemProps] = js.native
    @scala.inline
    def UserName_=(x: FC[LoginItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UserName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils * / any */ @js.native
  trait Login
    extends Component[LoginProps, js.Any, js.Any]
  object Login {
    
    /* was `typeof LoginTab` */
    type Tab = typings.antDesignPro.loginTabMod.default
  }
  
  @js.native
  trait LoginProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var defaultActiveKey: js.UndefOr[String] = js.native
    
    var onSubmit: js.UndefOr[js.Function2[/* error */ js.Any, /* values */ js.Any, Unit]] = js.native
    
    var onTabChange: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object LoginProps {
    
    @scala.inline
    def apply(): LoginProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoginProps]
    }
    
    @scala.inline
    implicit class LoginPropsMutableBuilder[Self <: LoginProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultActiveKey(value: String): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: (/* error */ js.Any, /* values */ js.Any) => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnTabChange(value: /* key */ String => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
