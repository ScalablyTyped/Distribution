package typings.antDesignProLayout

import typings.antDesignProUtils.esUseStyleMod.ProAliasToken
import typings.antDesignProUtils.esUseStyleMod.UseStyleResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsFooterToolbarStyleMod {
  
  @JSImport("@ant-design/pro-layout/es/components/FooterToolbar/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStyle(prefixCls: String): UseStyleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyle")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[UseStyleResult]
  
  trait AppsLogoComponentsToken
    extends StObject
       with ProAliasToken {
    
    var componentCls: String
  }
  object AppsLogoComponentsToken {
    
    inline def apply(ProAliasToken: ProAliasToken, componentCls: String): AppsLogoComponentsToken = {
      val __obj = js.Dynamic.literal(componentCls = componentCls.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, ProAliasToken)
      __obj.asInstanceOf[AppsLogoComponentsToken]
    }
    
    extension [Self <: AppsLogoComponentsToken](x: Self) {
      
      inline def setComponentCls(value: String): Self = StObject.set(x, "componentCls", value.asInstanceOf[js.Any])
    }
  }
}
