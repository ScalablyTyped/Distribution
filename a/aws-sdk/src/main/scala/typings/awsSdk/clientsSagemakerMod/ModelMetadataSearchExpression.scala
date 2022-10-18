package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelMetadataSearchExpression extends StObject {
  
  /**
    * A list of filter objects.
    */
  var Filters: js.UndefOr[ModelMetadataFilters] = js.undefined
}
object ModelMetadataSearchExpression {
  
  inline def apply(): ModelMetadataSearchExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelMetadataSearchExpression]
  }
  
  extension [Self <: ModelMetadataSearchExpression](x: Self) {
    
    inline def setFilters(value: ModelMetadataFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: ModelMetadataFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
  }
}
