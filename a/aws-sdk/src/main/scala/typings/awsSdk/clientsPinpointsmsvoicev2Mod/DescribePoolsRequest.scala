package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePoolsRequest extends StObject {
  
  /**
    * An array of PoolFilter objects to filter the results.
    */
  var Filters: js.UndefOr[PoolFilterList] = js.undefined
  
  /**
    * The maximum number of results to return per each request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.MaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results. You don't need to supply a value for this field in the initial request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.NextToken] = js.undefined
  
  /**
    * The unique identifier of pools to find. This is an array of strings that can be either the PoolId or PoolArn.
    */
  var PoolIds: js.UndefOr[PoolIdList] = js.undefined
}
object DescribePoolsRequest {
  
  inline def apply(): DescribePoolsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePoolsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePoolsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: PoolFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: PoolFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPoolIds(value: PoolIdList): Self = StObject.set(x, "PoolIds", value.asInstanceOf[js.Any])
    
    inline def setPoolIdsUndefined: Self = StObject.set(x, "PoolIds", js.undefined)
    
    inline def setPoolIdsVarargs(value: PoolIdOrArn*): Self = StObject.set(x, "PoolIds", js.Array(value*))
  }
}
