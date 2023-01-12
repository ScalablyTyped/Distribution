package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCapacityReservationFleetRequest extends StObject {
  
  /**
    * The strategy used by the Capacity Reservation Fleet to determine which of the specified instance types to use. Currently, only the prioritized allocation strategy is supported. For more information, see  Allocation strategy in the Amazon EC2 User Guide. Valid values: prioritized 
    */
  var AllocationStrategy: js.UndefOr[String] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation Fleet expires, its state changes to expired and all of the Capacity Reservations in the Fleet expire. The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation Fleet is guaranteed to expire between 13:30:55 and 14:30:55 on 5/31/2019. 
    */
  var EndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates the type of instance launches that the Capacity Reservation Fleet accepts. All Capacity Reservations in the Fleet inherit this instance matching criteria. Currently, Capacity Reservation Fleets support open instance matching criteria only. This means that instances that have matching attributes (instance type, platform, and Availability Zone) run in the Capacity Reservations automatically. Instances do not need to explicitly target a Capacity Reservation Fleet to use its reserved capacity.
    */
  var InstanceMatchCriteria: js.UndefOr[FleetInstanceMatchCriteria] = js.undefined
  
  /**
    * Information about the instance types for which to reserve the capacity.
    */
  var InstanceTypeSpecifications: ReservationFleetInstanceSpecificationList
  
  /**
    * The tags to assign to the Capacity Reservation Fleet. The tags are automatically assigned to the Capacity Reservations in the Fleet.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * Indicates the tenancy of the Capacity Reservation Fleet. All Capacity Reservations in the Fleet inherit this tenancy. The Capacity Reservation Fleet can have one of the following tenancy settings:    default - The Capacity Reservation Fleet is created on hardware that is shared with other Amazon Web Services accounts.    dedicated - The Capacity Reservations are created on single-tenant hardware that is dedicated to a single Amazon Web Services account.  
    */
  var Tenancy: js.UndefOr[FleetCapacityReservationTenancy] = js.undefined
  
  /**
    * The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value, together with the instance type weights that you assign to each instance type used by the Fleet determine the number of instances for which the Fleet reserves capacity. Both values are based on units that make sense for your workload. For more information, see  Total target capacity in the Amazon EC2 User Guide.
    */
  var TotalTargetCapacity: Integer
}
object CreateCapacityReservationFleetRequest {
  
  inline def apply(
    InstanceTypeSpecifications: ReservationFleetInstanceSpecificationList,
    TotalTargetCapacity: Integer
  ): CreateCapacityReservationFleetRequest = {
    val __obj = js.Dynamic.literal(InstanceTypeSpecifications = InstanceTypeSpecifications.asInstanceOf[js.Any], TotalTargetCapacity = TotalTargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCapacityReservationFleetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCapacityReservationFleetRequest] (val x: Self) extends AnyVal {
    
    inline def setAllocationStrategy(value: String): Self = StObject.set(x, "AllocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAllocationStrategyUndefined: Self = StObject.set(x, "AllocationStrategy", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    inline def setInstanceMatchCriteria(value: FleetInstanceMatchCriteria): Self = StObject.set(x, "InstanceMatchCriteria", value.asInstanceOf[js.Any])
    
    inline def setInstanceMatchCriteriaUndefined: Self = StObject.set(x, "InstanceMatchCriteria", js.undefined)
    
    inline def setInstanceTypeSpecifications(value: ReservationFleetInstanceSpecificationList): Self = StObject.set(x, "InstanceTypeSpecifications", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeSpecificationsVarargs(value: ReservationFleetInstanceSpecification*): Self = StObject.set(x, "InstanceTypeSpecifications", js.Array(value*))
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
    
    inline def setTenancy(value: FleetCapacityReservationTenancy): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    inline def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
    
    inline def setTotalTargetCapacity(value: Integer): Self = StObject.set(x, "TotalTargetCapacity", value.asInstanceOf[js.Any])
  }
}
