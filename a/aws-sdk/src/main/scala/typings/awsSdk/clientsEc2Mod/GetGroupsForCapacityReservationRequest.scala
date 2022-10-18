package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupsForCapacityReservationRequest extends StObject {
  
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: typings.awsSdk.clientsEc2Mod.CapacityReservationId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the returned nextToken value. This value can be between 5 and 500. If maxResults is given a larger value than 500, you receive an error.
    */
  var MaxResults: js.UndefOr[GetGroupsForCapacityReservationRequestMaxResults] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetGroupsForCapacityReservationRequest {
  
  inline def apply(CapacityReservationId: CapacityReservationId): GetGroupsForCapacityReservationRequest = {
    val __obj = js.Dynamic.literal(CapacityReservationId = CapacityReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupsForCapacityReservationRequest]
  }
  
  extension [Self <: GetGroupsForCapacityReservationRequest](x: Self) {
    
    inline def setCapacityReservationId(value: CapacityReservationId): Self = StObject.set(x, "CapacityReservationId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setMaxResults(value: GetGroupsForCapacityReservationRequestMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
