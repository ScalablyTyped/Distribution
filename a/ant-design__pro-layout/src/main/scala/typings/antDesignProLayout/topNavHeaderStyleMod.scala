package typings.antDesignProLayout

import typings.antDesignProUtils.useStyleMod.ProAliasToken
import typings.antDesignProUtils.useStyleMod.UseStyleResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topNavHeaderStyleMod {
  
  @JSImport("@ant-design/pro-layout/es/components/TopNavHeader/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStyle(prefixCls: String): UseStyleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyle")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[UseStyleResult]
  
  trait TopNavHeaderToken
    extends StObject
       with ProAliasToken {
    
    var componentCls: String
  }
  object TopNavHeaderToken {
    
    inline def apply(ProAliasToken: ProAliasToken, componentCls: String): TopNavHeaderToken = {
      val __obj = js.Dynamic.literal(componentCls = componentCls.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, ProAliasToken)
      __obj.asInstanceOf[TopNavHeaderToken]
    }
    
    extension [Self <: TopNavHeaderToken](x: Self) {
      
      inline def setComponentCls(value: String): Self = StObject.set(x, "componentCls", value.asInstanceOf[js.Any])
    }
  }
}
