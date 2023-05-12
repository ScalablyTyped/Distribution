package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabularConditions extends StObject {
  
  /**
    * Filter criteria that orders the output. It can be sorted in ascending or descending order.
    */
  var orderBy: js.UndefOr[OrderByList] = js.undefined
  
  /**
    * You can filter the request using various logical operators and a key-value format. For example:  {"key": "serverType", "value": "webServer"} 
    */
  var propertyFilters: js.UndefOr[PropertyFilters] = js.undefined
}
object TabularConditions {
  
  inline def apply(): TabularConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabularConditions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabularConditions] (val x: Self) extends AnyVal {
    
    inline def setOrderBy(value: OrderByList): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setOrderByVarargs(value: OrderBy*): Self = StObject.set(x, "orderBy", js.Array(value*))
    
    inline def setPropertyFilters(value: PropertyFilters): Self = StObject.set(x, "propertyFilters", value.asInstanceOf[js.Any])
    
    inline def setPropertyFiltersUndefined: Self = StObject.set(x, "propertyFilters", js.undefined)
    
    inline def setPropertyFiltersVarargs(value: PropertyFilter*): Self = StObject.set(x, "propertyFilters", js.Array(value*))
  }
}
