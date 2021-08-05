package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route extends StObject {
  
  var children: js.UndefOr[js.Array[Route]] = js.undefined
  
  var loadChildren: js.UndefOr[String | Type | js.Any] = js.undefined
}
object Route {
  
  inline def apply(): Route = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Route]
  }
  
  extension [Self <: Route](x: Self) {
    
    inline def setChildren(value: js.Array[Route]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: Route*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setLoadChildren(value: String | Type | js.Any): Self = StObject.set(x, "loadChildren", value.asInstanceOf[js.Any])
    
    inline def setLoadChildrenUndefined: Self = StObject.set(x, "loadChildren", js.undefined)
  }
}
