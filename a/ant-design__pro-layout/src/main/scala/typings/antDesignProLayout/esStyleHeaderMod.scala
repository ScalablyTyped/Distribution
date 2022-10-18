package typings.antDesignProLayout

import typings.antDesignProLayout.anon.ProLayoutCls
import typings.antDesignProUtils.esUseStyleMod.ProAliasToken
import typings.antDesignProUtils.esUseStyleMod.UseStyleResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStyleHeaderMod {
  
  @JSImport("@ant-design/pro-layout/es/style/header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStyle(prefixCls: String, props: ProLayoutCls): UseStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useStyle")(prefixCls.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[UseStyleResult]
  
  trait ProLayoutHeaderToken
    extends StObject
       with ProAliasToken {
    
    var ProLayoutHeaderHeaderHeight: Double
    
    var componentCls: String
    
    var proLayoutCls: String
  }
  object ProLayoutHeaderToken {
    
    inline def apply(
      ProAliasToken: ProAliasToken,
      ProLayoutHeaderHeaderHeight: Double,
      componentCls: String,
      proLayoutCls: String
    ): ProLayoutHeaderToken = {
      val __obj = js.Dynamic.literal(ProLayoutHeaderHeaderHeight = ProLayoutHeaderHeaderHeight.asInstanceOf[js.Any], componentCls = componentCls.asInstanceOf[js.Any], proLayoutCls = proLayoutCls.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, ProAliasToken)
      __obj.asInstanceOf[ProLayoutHeaderToken]
    }
    
    extension [Self <: ProLayoutHeaderToken](x: Self) {
      
      inline def setComponentCls(value: String): Self = StObject.set(x, "componentCls", value.asInstanceOf[js.Any])
      
      inline def setProLayoutCls(value: String): Self = StObject.set(x, "proLayoutCls", value.asInstanceOf[js.Any])
      
      inline def setProLayoutHeaderHeaderHeight(value: Double): Self = StObject.set(x, "ProLayoutHeaderHeaderHeight", value.asInstanceOf[js.Any])
    }
  }
}
