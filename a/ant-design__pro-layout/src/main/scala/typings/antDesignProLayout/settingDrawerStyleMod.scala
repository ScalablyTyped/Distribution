package typings.antDesignProLayout

import typings.antDesignProUtils.useStyleMod.ProAliasToken
import typings.antDesignProUtils.useStyleMod.UseStyleResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingDrawerStyleMod {
  
  @JSImport("@ant-design/pro-layout/es/components/SettingDrawer/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStyle(prefixCls: String): UseStyleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyle")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[UseStyleResult]
  
  trait SettingDrawerToken
    extends StObject
       with ProAliasToken {
    
    var componentCls: String
  }
  object SettingDrawerToken {
    
    inline def apply(ProAliasToken: ProAliasToken, componentCls: String): SettingDrawerToken = {
      val __obj = js.Dynamic.literal(componentCls = componentCls.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, ProAliasToken)
      __obj.asInstanceOf[SettingDrawerToken]
    }
    
    extension [Self <: SettingDrawerToken](x: Self) {
      
      inline def setComponentCls(value: String): Self = StObject.set(x, "componentCls", value.asInstanceOf[js.Any])
    }
  }
}
