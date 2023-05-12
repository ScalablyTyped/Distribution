package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFleetsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of the EC2 Fleets.
    */
  var FleetIds: FleetIdSet
  
  /**
    * Indicates whether to terminate the associated instances when the EC2 Fleet is deleted. The default is to terminate the instances. To let the instances continue to run after the EC2 Fleet is deleted, specify no-terminate-instances. Supported only for fleets of type maintain and request. For instant fleets, you cannot specify NoTerminateInstances. A deleted instant fleet with running instances is not supported.
    */
  var TerminateInstances: Boolean
}
object DeleteFleetsRequest {
  
  inline def apply(FleetIds: FleetIdSet, TerminateInstances: Boolean): DeleteFleetsRequest = {
    val __obj = js.Dynamic.literal(FleetIds = FleetIds.asInstanceOf[js.Any], TerminateInstances = TerminateInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFleetsRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFleetIds(value: FleetIdSet): Self = StObject.set(x, "FleetIds", value.asInstanceOf[js.Any])
    
    inline def setFleetIdsVarargs(value: FleetId*): Self = StObject.set(x, "FleetIds", js.Array(value*))
    
    inline def setTerminateInstances(value: Boolean): Self = StObject.set(x, "TerminateInstances", value.asInstanceOf[js.Any])
  }
}
