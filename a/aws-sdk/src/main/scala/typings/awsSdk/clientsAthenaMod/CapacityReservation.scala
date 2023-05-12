package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityReservation extends StObject {
  
  /**
    * The number of data processing units currently allocated.
    */
  var AllocatedDpus: AllocatedDpusInteger
  
  /**
    * The time in UTC epoch millis when the capacity reservation was created.
    */
  var CreationTime: js.Date
  
  var LastAllocation: js.UndefOr[CapacityAllocation] = js.undefined
  
  /**
    * The time of the most recent capacity allocation that succeeded.
    */
  var LastSuccessfulAllocationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the capacity reservation.
    */
  var Name: CapacityReservationName
  
  /**
    * The status of the capacity reservation.
    */
  var Status: CapacityReservationStatus
  
  /**
    * The number of data processing units requested.
    */
  var TargetDpus: TargetDpusInteger
}
object CapacityReservation {
  
  inline def apply(
    AllocatedDpus: AllocatedDpusInteger,
    CreationTime: js.Date,
    Name: CapacityReservationName,
    Status: CapacityReservationStatus,
    TargetDpus: TargetDpusInteger
  ): CapacityReservation = {
    val __obj = js.Dynamic.literal(AllocatedDpus = AllocatedDpus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], TargetDpus = TargetDpus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityReservation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapacityReservation] (val x: Self) extends AnyVal {
    
    inline def setAllocatedDpus(value: AllocatedDpusInteger): Self = StObject.set(x, "AllocatedDpus", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setLastAllocation(value: CapacityAllocation): Self = StObject.set(x, "LastAllocation", value.asInstanceOf[js.Any])
    
    inline def setLastAllocationUndefined: Self = StObject.set(x, "LastAllocation", js.undefined)
    
    inline def setLastSuccessfulAllocationTime(value: js.Date): Self = StObject.set(x, "LastSuccessfulAllocationTime", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulAllocationTimeUndefined: Self = StObject.set(x, "LastSuccessfulAllocationTime", js.undefined)
    
    inline def setName(value: CapacityReservationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CapacityReservationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTargetDpus(value: TargetDpusInteger): Self = StObject.set(x, "TargetDpus", value.asInstanceOf[js.Any])
  }
}
