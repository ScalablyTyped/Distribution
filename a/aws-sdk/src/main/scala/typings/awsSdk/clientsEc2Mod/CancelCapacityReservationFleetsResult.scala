package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelCapacityReservationFleetsResult extends StObject {
  
  /**
    * Information about the Capacity Reservation Fleets that could not be cancelled.
    */
  var FailedFleetCancellations: js.UndefOr[FailedCapacityReservationFleetCancellationResultSet] = js.undefined
  
  /**
    * Information about the Capacity Reservation Fleets that were successfully cancelled.
    */
  var SuccessfulFleetCancellations: js.UndefOr[CapacityReservationFleetCancellationStateSet] = js.undefined
}
object CancelCapacityReservationFleetsResult {
  
  inline def apply(): CancelCapacityReservationFleetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelCapacityReservationFleetsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelCapacityReservationFleetsResult] (val x: Self) extends AnyVal {
    
    inline def setFailedFleetCancellations(value: FailedCapacityReservationFleetCancellationResultSet): Self = StObject.set(x, "FailedFleetCancellations", value.asInstanceOf[js.Any])
    
    inline def setFailedFleetCancellationsUndefined: Self = StObject.set(x, "FailedFleetCancellations", js.undefined)
    
    inline def setFailedFleetCancellationsVarargs(value: FailedCapacityReservationFleetCancellationResult*): Self = StObject.set(x, "FailedFleetCancellations", js.Array(value*))
    
    inline def setSuccessfulFleetCancellations(value: CapacityReservationFleetCancellationStateSet): Self = StObject.set(x, "SuccessfulFleetCancellations", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulFleetCancellationsUndefined: Self = StObject.set(x, "SuccessfulFleetCancellations", js.undefined)
    
    inline def setSuccessfulFleetCancellationsVarargs(value: CapacityReservationFleetCancellationState*): Self = StObject.set(x, "SuccessfulFleetCancellations", js.Array(value*))
  }
}
