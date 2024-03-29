package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSpotFleetRequestsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of the Spot Fleet requests.
    */
  var SpotFleetRequestIds: SpotFleetRequestIdList
  
  /**
    * Indicates whether to terminate the associated instances when the Spot Fleet request is canceled. The default is to terminate the instances. To let the instances continue to run after the Spot Fleet request is canceled, specify no-terminate-instances.
    */
  var TerminateInstances: Boolean
}
object CancelSpotFleetRequestsRequest {
  
  inline def apply(SpotFleetRequestIds: SpotFleetRequestIdList, TerminateInstances: Boolean): CancelSpotFleetRequestsRequest = {
    val __obj = js.Dynamic.literal(SpotFleetRequestIds = SpotFleetRequestIds.asInstanceOf[js.Any], TerminateInstances = TerminateInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSpotFleetRequestsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelSpotFleetRequestsRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setSpotFleetRequestIds(value: SpotFleetRequestIdList): Self = StObject.set(x, "SpotFleetRequestIds", value.asInstanceOf[js.Any])
    
    inline def setSpotFleetRequestIdsVarargs(value: SpotFleetRequestId*): Self = StObject.set(x, "SpotFleetRequestIds", js.Array(value*))
    
    inline def setTerminateInstances(value: Boolean): Self = StObject.set(x, "TerminateInstances", value.asInstanceOf[js.Any])
  }
}
