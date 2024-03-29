package typings.antDesignPro

import typings.antDesignPro.anon.AddTab
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoginLoginTabMod {
  
  @JSImport("ant-design-pro/lib/Login/LoginTab", JSImport.Default)
  @js.native
  open class default () extends Component[LoginTabProps, Any, Any]
  
  type LoginTab = Component[LoginTabProps, Any, Any]
  
  trait LoginTabProps extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var tab: js.UndefOr[ReactNode] = js.undefined
    
    var tabUtil: AddTab
  }
  object LoginTabProps {
    
    inline def apply(tabUtil: AddTab): LoginTabProps = {
      val __obj = js.Dynamic.literal(tabUtil = tabUtil.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginTabProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoginTabProps] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setTab(value: ReactNode): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
      
      inline def setTabUtil(value: AddTab): Self = StObject.set(x, "tabUtil", value.asInstanceOf[js.Any])
    }
  }
}
