package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSenderIdsRequest extends StObject {
  
  /**
    * An array of SenderIdFilter objects to filter the results.
    */
  var Filters: js.UndefOr[SenderIdFilterList] = js.undefined
  
  /**
    * The maximum number of results to return per each request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.MaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results. You don't need to supply a value for this field in the initial request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.NextToken] = js.undefined
  
  /**
    * An array of SenderIdAndCountry objects to search for.
    */
  var SenderIds: js.UndefOr[SenderIdList] = js.undefined
}
object DescribeSenderIdsRequest {
  
  inline def apply(): DescribeSenderIdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSenderIdsRequest]
  }
  
  extension [Self <: DescribeSenderIdsRequest](x: Self) {
    
    inline def setFilters(value: SenderIdFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: SenderIdFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSenderIds(value: SenderIdList): Self = StObject.set(x, "SenderIds", value.asInstanceOf[js.Any])
    
    inline def setSenderIdsUndefined: Self = StObject.set(x, "SenderIds", js.undefined)
    
    inline def setSenderIdsVarargs(value: SenderIdAndCountry*): Self = StObject.set(x, "SenderIds", js.Array(value*))
  }
}
