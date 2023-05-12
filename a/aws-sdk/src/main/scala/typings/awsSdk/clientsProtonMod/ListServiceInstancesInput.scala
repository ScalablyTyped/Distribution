package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceInstancesInput extends StObject {
  
  /**
    * An array of filtering criteria that scope down the result list. By default, all service instances in the Amazon Web Services account are returned.
    */
  var filters: js.UndefOr[ListServiceInstancesFilterList] = js.undefined
  
  /**
    * The maximum number of service instances to list.
    */
  var maxResults: js.UndefOr[MaxPageResults] = js.undefined
  
  /**
    * A token that indicates the location of the next service in the array of service instances, after the list of service instances that was previously requested.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The name of the service that the service instance belongs to.
    */
  var serviceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The field that the result list is sorted by. When you choose to sort by serviceName, service instances within each service are sorted by service instance name. Default: serviceName 
    */
  var sortBy: js.UndefOr[ListServiceInstancesSortBy] = js.undefined
  
  /**
    * Result list sort order. Default: ASCENDING 
    */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}
object ListServiceInstancesInput {
  
  inline def apply(): ListServiceInstancesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceInstancesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServiceInstancesInput] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: ListServiceInstancesFilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: ListServiceInstancesFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxPageResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setSortBy(value: ListServiceInstancesSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
