package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPoolOriginationIdentitiesRequest extends StObject {
  
  /**
    * An array of PoolOriginationIdentitiesFilter objects to filter the results..
    */
  var Filters: js.UndefOr[PoolOriginationIdentitiesFilterList] = js.undefined
  
  /**
    * The maximum number of results to return per each request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.MaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results. You don't need to supply a value for this field in the initial request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.NextToken] = js.undefined
  
  /**
    * The unique identifier for the pool. This value can be either the PoolId or PoolArn.
    */
  var PoolId: PoolIdOrArn
}
object ListPoolOriginationIdentitiesRequest {
  
  inline def apply(PoolId: PoolIdOrArn): ListPoolOriginationIdentitiesRequest = {
    val __obj = js.Dynamic.literal(PoolId = PoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPoolOriginationIdentitiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPoolOriginationIdentitiesRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: PoolOriginationIdentitiesFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: PoolOriginationIdentitiesFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPoolId(value: PoolIdOrArn): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
  }
}
