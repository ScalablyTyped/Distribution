package typings.antDesignProLayout.anon

import typings.antDesignProLayout.antDesignProLayoutStrings.header
import typings.antDesignProLayout.antDesignProLayoutStrings.sider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/es/components/SiderMenu/SiderMenu.PrivateSiderMenuProps> */
trait PartialPrivateSiderMenuPr extends StObject {
  
  var matchMenuKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  var menuRenderType: js.UndefOr[header | sider] = js.undefined
  
  var originCollapsed: js.UndefOr[Boolean] = js.undefined
}
object PartialPrivateSiderMenuPr {
  
  inline def apply(): PartialPrivateSiderMenuPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPrivateSiderMenuPr]
  }
  
  extension [Self <: PartialPrivateSiderMenuPr](x: Self) {
    
    inline def setMatchMenuKeys(value: js.Array[String]): Self = StObject.set(x, "matchMenuKeys", value.asInstanceOf[js.Any])
    
    inline def setMatchMenuKeysUndefined: Self = StObject.set(x, "matchMenuKeys", js.undefined)
    
    inline def setMatchMenuKeysVarargs(value: String*): Self = StObject.set(x, "matchMenuKeys", js.Array(value*))
    
    inline def setMenuRenderType(value: header | sider): Self = StObject.set(x, "menuRenderType", value.asInstanceOf[js.Any])
    
    inline def setMenuRenderTypeUndefined: Self = StObject.set(x, "menuRenderType", js.undefined)
    
    inline def setOriginCollapsed(value: Boolean): Self = StObject.set(x, "originCollapsed", value.asInstanceOf[js.Any])
    
    inline def setOriginCollapsedUndefined: Self = StObject.set(x, "originCollapsed", js.undefined)
  }
}
