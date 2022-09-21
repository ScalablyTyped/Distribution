package typings.antDesignProLayout.anon

import typings.antDesignProLayout.typesMod.AppsLogoComponentsAppList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixCls extends StObject {
  
  var appList: js.UndefOr[AppsLogoComponentsAppList] = js.undefined
  
  var prefixCls: js.UndefOr[String] = js.undefined
}
object PrefixCls {
  
  inline def apply(): PrefixCls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixCls]
  }
  
  extension [Self <: PrefixCls](x: Self) {
    
    inline def setAppList(value: AppsLogoComponentsAppList): Self = StObject.set(x, "appList", value.asInstanceOf[js.Any])
    
    inline def setAppListUndefined: Self = StObject.set(x, "appList", js.undefined)
    
    inline def setAppListVarargs(value: Desc*): Self = StObject.set(x, "appList", js.Array(value*))
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
  }
}
