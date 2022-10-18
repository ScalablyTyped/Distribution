package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCapacityReservationFleetsRequest extends StObject {
  
  /**
    * The IDs of the Capacity Reservation Fleets to describe.
    */
  var CapacityReservationFleetIds: js.UndefOr[CapacityReservationFleetIdSet] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    state - The state of the Fleet (submitted | modifying | active | partially_fulfilled | expiring | expired | cancelling | cancelled | failed).    instance-match-criteria - The instance matching criteria for the Fleet. Only open is supported.    tenancy - The tenancy of the Fleet (default | dedicated).    allocation-strategy - The allocation strategy used by the Fleet. Only prioritized is supported.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the returned nextToken value. This value can be between 5 and 500. If maxResults is given a larger value than 500, you receive an error.
    */
  var MaxResults: js.UndefOr[DescribeCapacityReservationFleetsMaxResults] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeCapacityReservationFleetsRequest {
  
  inline def apply(): DescribeCapacityReservationFleetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCapacityReservationFleetsRequest]
  }
  
  extension [Self <: DescribeCapacityReservationFleetsRequest](x: Self) {
    
    inline def setCapacityReservationFleetIds(value: CapacityReservationFleetIdSet): Self = StObject.set(x, "CapacityReservationFleetIds", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationFleetIdsUndefined: Self = StObject.set(x, "CapacityReservationFleetIds", js.undefined)
    
    inline def setCapacityReservationFleetIdsVarargs(value: CapacityReservationFleetId*): Self = StObject.set(x, "CapacityReservationFleetIds", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: DescribeCapacityReservationFleetsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
