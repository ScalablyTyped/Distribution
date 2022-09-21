package typings.ahooks.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageSize
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var current: Double
  
  var pageSize: Double
}
object PageSize {
  
  inline def apply(current: Double, pageSize: Double): PageSize = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSize]
  }
  
  extension [Self <: PageSize](x: Self) {
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
  }
}
