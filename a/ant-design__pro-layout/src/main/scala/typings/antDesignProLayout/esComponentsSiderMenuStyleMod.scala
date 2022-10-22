package typings.antDesignProLayout

import typings.antDesignProLayout.anon.ProLayoutCollapsedWidth
import typings.antDesignProProvider.esUseStyleMod.ProAliasToken
import typings.antDesignProProvider.esUseStyleMod.UseStyleResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsSiderMenuStyleMod {
  
  @JSImport("@ant-design/pro-layout/es/components/SiderMenu/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStyle(prefixCls: String, hasProLayoutCollapsedWidth: ProLayoutCollapsedWidth): UseStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useStyle")(prefixCls.asInstanceOf[js.Any], hasProLayoutCollapsedWidth.asInstanceOf[js.Any])).asInstanceOf[UseStyleResult]
  
  trait SiderMenuToken
    extends StObject
       with ProAliasToken {
    
    var componentCls: String
    
    var proLayoutCollapsedWidth: Double
  }
  object SiderMenuToken {
    
    inline def apply(ProAliasToken: ProAliasToken, componentCls: String, proLayoutCollapsedWidth: Double): SiderMenuToken = {
      val __obj = js.Dynamic.literal(componentCls = componentCls.asInstanceOf[js.Any], proLayoutCollapsedWidth = proLayoutCollapsedWidth.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, ProAliasToken)
      __obj.asInstanceOf[SiderMenuToken]
    }
    
    extension [Self <: SiderMenuToken](x: Self) {
      
      inline def setComponentCls(value: String): Self = StObject.set(x, "componentCls", value.asInstanceOf[js.Any])
      
      inline def setProLayoutCollapsedWidth(value: Double): Self = StObject.set(x, "proLayoutCollapsedWidth", value.asInstanceOf[js.Any])
    }
  }
}
