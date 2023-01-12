package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingTypeAggregation extends StObject {
  
  /**
    * The finding type to aggregate.
    */
  var findingType: js.UndefOr[AggregationFindingType] = js.undefined
  
  /**
    * The resource type to aggregate.
    */
  var resourceType: js.UndefOr[AggregationResourceType] = js.undefined
  
  /**
    * The value to sort results by.
    */
  var sortBy: js.UndefOr[FindingTypeSortBy] = js.undefined
  
  /**
    * The order to sort results by.
    */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}
object FindingTypeAggregation {
  
  inline def apply(): FindingTypeAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingTypeAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FindingTypeAggregation] (val x: Self) extends AnyVal {
    
    inline def setFindingType(value: AggregationFindingType): Self = StObject.set(x, "findingType", value.asInstanceOf[js.Any])
    
    inline def setFindingTypeUndefined: Self = StObject.set(x, "findingType", js.undefined)
    
    inline def setResourceType(value: AggregationResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setSortBy(value: FindingTypeSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
