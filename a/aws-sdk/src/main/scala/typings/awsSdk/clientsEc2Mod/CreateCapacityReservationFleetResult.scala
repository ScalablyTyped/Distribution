package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCapacityReservationFleetResult extends StObject {
  
  /**
    * The allocation strategy used by the Capacity Reservation Fleet.
    */
  var AllocationStrategy: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Capacity Reservation Fleet.
    */
  var CapacityReservationFleetId: js.UndefOr[typings.awsSdk.clientsEc2Mod.CapacityReservationFleetId] = js.undefined
  
  /**
    * The date and time at which the Capacity Reservation Fleet was created.
    */
  var CreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time at which the Capacity Reservation Fleet expires.
    */
  var EndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about the individual Capacity Reservations in the Capacity Reservation Fleet.
    */
  var FleetCapacityReservations: js.UndefOr[FleetCapacityReservationSet] = js.undefined
  
  /**
    * The instance matching criteria for the Capacity Reservation Fleet.
    */
  var InstanceMatchCriteria: js.UndefOr[FleetInstanceMatchCriteria] = js.undefined
  
  /**
    * The status of the Capacity Reservation Fleet.
    */
  var State: js.UndefOr[CapacityReservationFleetState] = js.undefined
  
  /**
    * The tags assigned to the Capacity Reservation Fleet.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Indicates the tenancy of Capacity Reservation Fleet.
    */
  var Tenancy: js.UndefOr[FleetCapacityReservationTenancy] = js.undefined
  
  /**
    * The requested capacity units that have been successfully reserved.
    */
  var TotalFulfilledCapacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The total number of capacity units for which the Capacity Reservation Fleet reserves capacity.
    */
  var TotalTargetCapacity: js.UndefOr[Integer] = js.undefined
}
object CreateCapacityReservationFleetResult {
  
  inline def apply(): CreateCapacityReservationFleetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCapacityReservationFleetResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCapacityReservationFleetResult] (val x: Self) extends AnyVal {
    
    inline def setAllocationStrategy(value: String): Self = StObject.set(x, "AllocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAllocationStrategyUndefined: Self = StObject.set(x, "AllocationStrategy", js.undefined)
    
    inline def setCapacityReservationFleetId(value: CapacityReservationFleetId): Self = StObject.set(x, "CapacityReservationFleetId", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationFleetIdUndefined: Self = StObject.set(x, "CapacityReservationFleetId", js.undefined)
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    inline def setFleetCapacityReservations(value: FleetCapacityReservationSet): Self = StObject.set(x, "FleetCapacityReservations", value.asInstanceOf[js.Any])
    
    inline def setFleetCapacityReservationsUndefined: Self = StObject.set(x, "FleetCapacityReservations", js.undefined)
    
    inline def setFleetCapacityReservationsVarargs(value: FleetCapacityReservation*): Self = StObject.set(x, "FleetCapacityReservations", js.Array(value*))
    
    inline def setInstanceMatchCriteria(value: FleetInstanceMatchCriteria): Self = StObject.set(x, "InstanceMatchCriteria", value.asInstanceOf[js.Any])
    
    inline def setInstanceMatchCriteriaUndefined: Self = StObject.set(x, "InstanceMatchCriteria", js.undefined)
    
    inline def setState(value: CapacityReservationFleetState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTenancy(value: FleetCapacityReservationTenancy): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    inline def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
    
    inline def setTotalFulfilledCapacity(value: Double): Self = StObject.set(x, "TotalFulfilledCapacity", value.asInstanceOf[js.Any])
    
    inline def setTotalFulfilledCapacityUndefined: Self = StObject.set(x, "TotalFulfilledCapacity", js.undefined)
    
    inline def setTotalTargetCapacity(value: Integer): Self = StObject.set(x, "TotalTargetCapacity", value.asInstanceOf[js.Any])
    
    inline def setTotalTargetCapacityUndefined: Self = StObject.set(x, "TotalTargetCapacity", js.undefined)
  }
}
