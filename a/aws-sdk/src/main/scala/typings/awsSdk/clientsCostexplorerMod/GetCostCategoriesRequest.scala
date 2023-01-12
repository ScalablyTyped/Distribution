package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCostCategoriesRequest extends StObject {
  
  var CostCategoryName: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.CostCategoryName] = js.undefined
  
  var Filter: js.UndefOr[Expression] = js.undefined
  
  /**
    * This field is only used when the SortBy value is provided in the request. The maximum number of objects that are returned for this request. If MaxResults isn't specified with the SortBy value, the request returns 1000 results as the default value for this parameter. For GetCostCategories, MaxResults has an upper quota of 1000.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.MaxResults] = js.undefined
  
  /**
    * If the number of objects that are still available for retrieval exceeds the quota, Amazon Web Services returns a NextPageToken value in the response. To retrieve the next batch of objects, provide the NextPageToken from the previous call in your next request.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  
  /**
    * The value that you want to search the filter values for. If you don't specify a CostCategoryName, SearchString is used to filter Cost Category names that match the SearchString pattern. If you specify a CostCategoryName, SearchString is used to filter Cost Category values that match the SearchString pattern.
    */
  var SearchString: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.SearchString] = js.undefined
  
  /**
    * The value that you sort the data by. The key represents the cost and usage metrics. The following values are supported:    BlendedCost     UnblendedCost     AmortizedCost     NetAmortizedCost     NetUnblendedCost     UsageQuantity     NormalizedUsageAmount    The supported key values for the SortOrder value are ASCENDING and DESCENDING. When you use the SortBy value, the NextPageToken and SearchString key values aren't supported.
    */
  var SortBy: js.UndefOr[SortDefinitions] = js.undefined
  
  var TimePeriod: DateInterval
}
object GetCostCategoriesRequest {
  
  inline def apply(TimePeriod: DateInterval): GetCostCategoriesRequest = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCostCategoriesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCostCategoriesRequest] (val x: Self) extends AnyVal {
    
    inline def setCostCategoryName(value: CostCategoryName): Self = StObject.set(x, "CostCategoryName", value.asInstanceOf[js.Any])
    
    inline def setCostCategoryNameUndefined: Self = StObject.set(x, "CostCategoryName", js.undefined)
    
    inline def setFilter(value: Expression): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setSearchString(value: SearchString): Self = StObject.set(x, "SearchString", value.asInstanceOf[js.Any])
    
    inline def setSearchStringUndefined: Self = StObject.set(x, "SearchString", js.undefined)
    
    inline def setSortBy(value: SortDefinitions): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortByVarargs(value: SortDefinition*): Self = StObject.set(x, "SortBy", js.Array(value*))
    
    inline def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
  }
}
