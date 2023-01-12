package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecoveryInstancesRequest extends StObject {
  
  /**
    * A set of filters by which to return Recovery Instances.
    */
  var filters: js.UndefOr[DescribeRecoveryInstancesRequestFilters] = js.undefined
  
  /**
    * Maximum number of Recovery Instances to retrieve.
    */
  var maxResults: js.UndefOr[StrictlyPositiveInteger] = js.undefined
  
  /**
    * The token of the next Recovery Instance to retrieve.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeRecoveryInstancesRequest {
  
  inline def apply(): DescribeRecoveryInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecoveryInstancesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRecoveryInstancesRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: DescribeRecoveryInstancesRequestFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setMaxResults(value: StrictlyPositiveInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
