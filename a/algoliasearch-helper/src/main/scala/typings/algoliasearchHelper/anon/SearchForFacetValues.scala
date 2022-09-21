package typings.algoliasearchHelper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchForFacetValues extends StObject {
  
  var searchForFacetValues: Any
}
object SearchForFacetValues {
  
  inline def apply(searchForFacetValues: Any): SearchForFacetValues = {
    val __obj = js.Dynamic.literal(searchForFacetValues = searchForFacetValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchForFacetValues]
  }
  
  extension [Self <: SearchForFacetValues](x: Self) {
    
    inline def setSearchForFacetValues(value: Any): Self = StObject.set(x, "searchForFacetValues", value.asInstanceOf[js.Any])
  }
}
