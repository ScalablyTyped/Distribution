package typings.antDesignProLayout

import typings.antDesignProLayout.anon.ProLayoutCls
import typings.antDesignProProvider.esUseStyleMod.ProAliasToken
import typings.antDesignProProvider.esUseStyleMod.UseStyleResult
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
    
    var componentCls: String
    
    var proLayoutCls: String
  }
  object ProLayoutHeaderToken {
    
    inline def apply(ProAliasToken: ProAliasToken, componentCls: String, proLayoutCls: String): ProLayoutHeaderToken = {
      val __obj = js.Dynamic.literal(componentCls = componentCls.asInstanceOf[js.Any], proLayoutCls = proLayoutCls.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, ProAliasToken)
      __obj.asInstanceOf[ProLayoutHeaderToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProLayoutHeaderToken] (val x: Self) extends AnyVal {
      
      inline def setComponentCls(value: String): Self = StObject.set(x, "componentCls", value.asInstanceOf[js.Any])
      
      inline def setProLayoutCls(value: String): Self = StObject.set(x, "proLayoutCls", value.asInstanceOf[js.Any])
    }
  }
}
