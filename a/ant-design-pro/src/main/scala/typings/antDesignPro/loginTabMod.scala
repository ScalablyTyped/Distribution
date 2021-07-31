package typings.antDesignPro

import typings.antDesignPro.anon.AddTab
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loginTabMod {
  
  @JSImport("ant-design-pro/lib/Login/LoginTab", JSImport.Default)
  @js.native
  class default ()
    extends Component[LoginTabProps, js.Any, js.Any]
  
  type LoginTab = Component[LoginTabProps, js.Any, js.Any]
  
  trait LoginTabProps extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var tab: js.UndefOr[ReactNode] = js.undefined
    
    var tabUtil: AddTab
  }
  object LoginTabProps {
    
    @scala.inline
    def apply(tabUtil: AddTab): LoginTabProps = {
      val __obj = js.Dynamic.literal(tabUtil = tabUtil.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginTabProps]
    }
    
    @scala.inline
    implicit class LoginTabPropsMutableBuilder[Self <: LoginTabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setTab(value: ReactNode): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
      
      @scala.inline
      def setTabUtil(value: AddTab): Self = StObject.set(x, "tabUtil", value.asInstanceOf[js.Any])
    }
  }
}
