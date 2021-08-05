package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  var descendants: Boolean
  
  var first: Boolean
  
  var isViewQuery: Boolean
  
  var read: js.Any
  
  var selector: js.Any
  
  var static: js.UndefOr[Boolean] = js.undefined
}
object Query {
  
  inline def apply(descendants: Boolean, first: Boolean, isViewQuery: Boolean, read: js.Any, selector: js.Any): Query = {
    val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], isViewQuery = isViewQuery.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  extension [Self <: Query](x: Self) {
    
    inline def setDescendants(value: Boolean): Self = StObject.set(x, "descendants", value.asInstanceOf[js.Any])
    
    inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setIsViewQuery(value: Boolean): Self = StObject.set(x, "isViewQuery", value.asInstanceOf[js.Any])
    
    inline def setRead(value: js.Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: js.Any): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
  }
}
