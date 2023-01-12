package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelCapacityReservationFleetsRequest extends StObject {
  
  /**
    * The IDs of the Capacity Reservation Fleets to cancel.
    */
  var CapacityReservationFleetIds: CapacityReservationFleetIdSet
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object CancelCapacityReservationFleetsRequest {
  
  inline def apply(CapacityReservationFleetIds: CapacityReservationFleetIdSet): CancelCapacityReservationFleetsRequest = {
    val __obj = js.Dynamic.literal(CapacityReservationFleetIds = CapacityReservationFleetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelCapacityReservationFleetsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelCapacityReservationFleetsRequest] (val x: Self) extends AnyVal {
    
    inline def setCapacityReservationFleetIds(value: CapacityReservationFleetIdSet): Self = StObject.set(x, "CapacityReservationFleetIds", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationFleetIdsVarargs(value: CapacityReservationFleetId*): Self = StObject.set(x, "CapacityReservationFleetIds", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
