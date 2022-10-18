package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTagsRequest extends StObject {
  
  var Filter: js.UndefOr[Expression] = js.undefined
  
  /**
    * This field is only used when SortBy is provided in the request. The maximum number of objects that are returned for this request. If MaxResults isn't specified with SortBy, the request returns 1000 results as the default value for this parameter. For GetTags, MaxResults has an upper quota of 1000.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.MaxResults] = js.undefined
  
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  
  /**
    * The value that you want to search for.
    */
  var SearchString: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.SearchString] = js.undefined
  
  /**
    * The value that you want to sort the data by. The key represents cost and usage metrics. The following values are supported:    BlendedCost     UnblendedCost     AmortizedCost     NetAmortizedCost     NetUnblendedCost     UsageQuantity     NormalizedUsageAmount    The supported values for SortOrder are ASCENDING and DESCENDING. When you use SortBy, NextPageToken and SearchString aren't supported.
    */
  var SortBy: js.UndefOr[SortDefinitions] = js.undefined
  
  /**
    * The key of the tag that you want to return values for.
    */
  var TagKey: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.TagKey] = js.undefined
  
  /**
    * The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date is exclusive. For example, if start is 2017-01-01 and end is 2017-05-01, then the cost and usage data is retrieved from 2017-01-01 up to and including 2017-04-30 but not including 2017-05-01.
    */
  var TimePeriod: DateInterval
}
object GetTagsRequest {
  
  inline def apply(TimePeriod: DateInterval): GetTagsRequest = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagsRequest]
  }
  
  extension [Self <: GetTagsRequest](x: Self) {
    
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
    
    inline def setTagKey(value: TagKey): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
    
    inline def setTagKeyUndefined: Self = StObject.set(x, "TagKey", js.undefined)
    
    inline def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
  }
}
