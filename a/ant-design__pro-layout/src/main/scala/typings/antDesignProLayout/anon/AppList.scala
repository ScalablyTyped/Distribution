package typings.antDesignProLayout.anon

import typings.antDesignProLayout.typesMod.AppsLogoComponentsAppList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppList extends StObject {
  
  var appList: js.UndefOr[AppsLogoComponentsAppList] = js.undefined
  
  var baseClassName: String
  
  var hashId: js.UndefOr[String] = js.undefined
}
object AppList {
  
  inline def apply(baseClassName: String): AppList = {
    val __obj = js.Dynamic.literal(baseClassName = baseClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppList]
  }
  
  extension [Self <: AppList](x: Self) {
    
    inline def setAppList(value: AppsLogoComponentsAppList): Self = StObject.set(x, "appList", value.asInstanceOf[js.Any])
    
    inline def setAppListUndefined: Self = StObject.set(x, "appList", js.undefined)
    
    inline def setAppListVarargs(value: Desc*): Self = StObject.set(x, "appList", js.Array(value*))
    
    inline def setBaseClassName(value: String): Self = StObject.set(x, "baseClassName", value.asInstanceOf[js.Any])
    
    inline def setHashId(value: String): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
    
    inline def setHashIdUndefined: Self = StObject.set(x, "hashId", js.undefined)
  }
}
