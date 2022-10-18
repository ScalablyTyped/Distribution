package typings.antDesignProLayout

import typings.antDesignProUtils.esUseStyleMod.ProAliasToken
import typings.antDesignProUtils.esUseStyleMod.UseStyleResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsGlobalFooterStyleMod {
  
  @JSImport("@ant-design/pro-layout/es/components/GlobalFooter/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStyle(prefixCls: String): UseStyleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyle")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[UseStyleResult]
  
  trait GlobalFooterToken
    extends StObject
       with ProAliasToken {
    
    var componentCls: String
    
    var probgLayout: js.UndefOr[String] = js.undefined
  }
  object GlobalFooterToken {
    
    inline def apply(ProAliasToken: ProAliasToken, componentCls: String): GlobalFooterToken = {
      val __obj = js.Dynamic.literal(componentCls = componentCls.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, ProAliasToken)
      __obj.asInstanceOf[GlobalFooterToken]
    }
    
    extension [Self <: GlobalFooterToken](x: Self) {
      
      inline def setComponentCls(value: String): Self = StObject.set(x, "componentCls", value.asInstanceOf[js.Any])
      
      inline def setProbgLayout(value: String): Self = StObject.set(x, "probgLayout", value.asInstanceOf[js.Any])
      
      inline def setProbgLayoutUndefined: Self = StObject.set(x, "probgLayout", js.undefined)
    }
  }
}
