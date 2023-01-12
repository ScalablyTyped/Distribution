package typings.antDesignProLayout

import typings.antDesignProProvider.esUseStyleMod.ProAliasToken
import typings.antDesignProProvider.esUseStyleMod.UseStyleResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsGridContentStyleMod {
  
  @JSImport("@ant-design/pro-layout/es/components/GridContent/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStyle(prefixCls: String): UseStyleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyle")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[UseStyleResult]
  
  trait GridContentToken
    extends StObject
       with ProAliasToken {
    
    var componentCls: String
  }
  object GridContentToken {
    
    inline def apply(ProAliasToken: ProAliasToken, componentCls: String): GridContentToken = {
      val __obj = js.Dynamic.literal(componentCls = componentCls.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, ProAliasToken)
      __obj.asInstanceOf[GridContentToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridContentToken] (val x: Self) extends AnyVal {
      
      inline def setComponentCls(value: String): Self = StObject.set(x, "componentCls", value.asInstanceOf[js.Any])
    }
  }
}
