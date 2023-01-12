package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityReservationFleet extends StObject {
  
  /**
    * The strategy used by the Capacity Reservation Fleet to determine which of the specified instance types to use. For more information, see For more information, see  Allocation strategy in the Amazon EC2 User Guide.
    */
  var AllocationStrategy: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the Capacity Reservation Fleet.
    */
  var CapacityReservationFleetArn: js.UndefOr[String] = js.undefined
  
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
    * Indicates the type of instance launches that the Capacity Reservation Fleet accepts. All Capacity Reservations in the Fleet inherit this instance matching criteria. Currently, Capacity Reservation Fleets support open instance matching criteria only. This means that instances that have matching attributes (instance type, platform, and Availability Zone) run in the Capacity Reservations automatically. Instances do not need to explicitly target a Capacity Reservation Fleet to use its reserved capacity.
    */
  var InstanceMatchCriteria: js.UndefOr[FleetInstanceMatchCriteria] = js.undefined
  
  /**
    * Information about the instance types for which to reserve the capacity.
    */
  var InstanceTypeSpecifications: js.UndefOr[FleetCapacityReservationSet] = js.undefined
  
  /**
    * The state of the Capacity Reservation Fleet. Possible states include:    submitted - The Capacity Reservation Fleet request has been submitted and Amazon Elastic Compute Cloud is preparing to create the Capacity Reservations.    modifying - The Capacity Reservation Fleet is being modified. The Fleet remains in this state until the modification is complete.    active - The Capacity Reservation Fleet has fulfilled its total target capacity and it is attempting to maintain this capacity. The Fleet remains in this state until it is modified or deleted.    partially_fulfilled - The Capacity Reservation Fleet has partially fulfilled its total target capacity. There is insufficient Amazon EC2 to fulfill the total target capacity. The Fleet is attempting to asynchronously fulfill its total target capacity.    expiring - The Capacity Reservation Fleet has reach its end date and it is in the process of expiring. One or more of its Capacity reservations might still be active.    expired - The Capacity Reservation Fleet has reach its end date. The Fleet and its Capacity Reservations are expired. The Fleet can't create new Capacity Reservations.    cancelling - The Capacity Reservation Fleet is in the process of being cancelled. One or more of its Capacity reservations might still be active.    cancelled - The Capacity Reservation Fleet has been manually cancelled. The Fleet and its Capacity Reservations are cancelled and the Fleet can't create new Capacity Reservations.    failed - The Capacity Reservation Fleet failed to reserve capacity for the specified instance types.  
    */
  var State: js.UndefOr[CapacityReservationFleetState] = js.undefined
  
  /**
    * The tags assigned to the Capacity Reservation Fleet.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The tenancy of the Capacity Reservation Fleet. Tenancies include:    default - The Capacity Reservation Fleet is created on hardware that is shared with other Amazon Web Services accounts.    dedicated - The Capacity Reservation Fleet is created on single-tenant hardware that is dedicated to a single Amazon Web Services account.  
    */
  var Tenancy: js.UndefOr[FleetCapacityReservationTenancy] = js.undefined
  
  /**
    * The capacity units that have been fulfilled.
    */
  var TotalFulfilledCapacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The total number of capacity units for which the Capacity Reservation Fleet reserves capacity. For more information, see Total target capacity in the Amazon EC2 User Guide.
    */
  var TotalTargetCapacity: js.UndefOr[Integer] = js.undefined
}
object CapacityReservationFleet {
  
  inline def apply(): CapacityReservationFleet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityReservationFleet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapacityReservationFleet] (val x: Self) extends AnyVal {
    
    inline def setAllocationStrategy(value: String): Self = StObject.set(x, "AllocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAllocationStrategyUndefined: Self = StObject.set(x, "AllocationStrategy", js.undefined)
    
    inline def setCapacityReservationFleetArn(value: String): Self = StObject.set(x, "CapacityReservationFleetArn", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationFleetArnUndefined: Self = StObject.set(x, "CapacityReservationFleetArn", js.undefined)
    
    inline def setCapacityReservationFleetId(value: CapacityReservationFleetId): Self = StObject.set(x, "CapacityReservationFleetId", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationFleetIdUndefined: Self = StObject.set(x, "CapacityReservationFleetId", js.undefined)
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    inline def setInstanceMatchCriteria(value: FleetInstanceMatchCriteria): Self = StObject.set(x, "InstanceMatchCriteria", value.asInstanceOf[js.Any])
    
    inline def setInstanceMatchCriteriaUndefined: Self = StObject.set(x, "InstanceMatchCriteria", js.undefined)
    
    inline def setInstanceTypeSpecifications(value: FleetCapacityReservationSet): Self = StObject.set(x, "InstanceTypeSpecifications", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeSpecificationsUndefined: Self = StObject.set(x, "InstanceTypeSpecifications", js.undefined)
    
    inline def setInstanceTypeSpecificationsVarargs(value: FleetCapacityReservation*): Self = StObject.set(x, "InstanceTypeSpecifications", js.Array(value*))
    
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
