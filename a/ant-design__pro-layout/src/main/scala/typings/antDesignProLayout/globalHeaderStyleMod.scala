package typings.antDesignProLayout

import typings.antDesignProUtils.useStyleMod.ProAliasToken
import typings.antDesignProUtils.useStyleMod.UseStyleResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalHeaderStyleMod {
  
  @JSImport("@ant-design/pro-layout/es/components/GlobalHeader/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStyle(prefixCls: String): UseStyleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyle")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[UseStyleResult]
  
  trait GlobalHeaderToken
    extends StObject
       with ProAliasToken {
    
    var colorHeaderTitle: String
    
    var componentCls: String
    
    var heightLayoutHeader: Double
  }
  object GlobalHeaderToken {
    
    inline def apply(
      ProAliasToken: ProAliasToken,
      colorHeaderTitle: String,
      componentCls: String,
      heightLayoutHeader: Double
    ): GlobalHeaderToken = {
      val __obj = js.Dynamic.literal(colorHeaderTitle = colorHeaderTitle.asInstanceOf[js.Any], componentCls = componentCls.asInstanceOf[js.Any], heightLayoutHeader = heightLayoutHeader.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, ProAliasToken)
      __obj.asInstanceOf[GlobalHeaderToken]
    }
    
    extension [Self <: GlobalHeaderToken](x: Self) {
      
      inline def setColorHeaderTitle(value: String): Self = StObject.set(x, "colorHeaderTitle", value.asInstanceOf[js.Any])
      
      inline def setComponentCls(value: String): Self = StObject.set(x, "componentCls", value.asInstanceOf[js.Any])
      
      inline def setHeightLayoutHeader(value: Double): Self = StObject.set(x, "heightLayoutHeader", value.asInstanceOf[js.Any])
    }
  }
}
