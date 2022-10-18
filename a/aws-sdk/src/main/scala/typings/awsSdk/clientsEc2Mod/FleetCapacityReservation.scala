package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetCapacityReservation extends StObject {
  
  /**
    * The Availability Zone in which the Capacity Reservation reserves capacity.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Availability Zone in which the Capacity Reservation reserves capacity.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: js.UndefOr[typings.awsSdk.clientsEc2Mod.CapacityReservationId] = js.undefined
  
  /**
    * The date and time at which the Capacity Reservation was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether the Capacity Reservation reserves capacity for EBS-optimized instance types.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of capacity units fulfilled by the Capacity Reservation. For more information, see  Total target capacity in the Amazon EC2 User Guide.
    */
  var FulfilledCapacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The type of operating system for which the Capacity Reservation reserves capacity.
    */
  var InstancePlatform: js.UndefOr[CapacityReservationInstancePlatform] = js.undefined
  
  /**
    * The instance type for which the Capacity Reservation reserves capacity.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceType] = js.undefined
  
  /**
    * The priority of the instance type in the Capacity Reservation Fleet. For more information, see  Instance type priority in the Amazon EC2 User Guide.
    */
  var Priority: js.UndefOr[IntegerWithConstraints] = js.undefined
  
  /**
    * The total number of instances for which the Capacity Reservation reserves capacity.
    */
  var TotalInstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The weight of the instance type in the Capacity Reservation Fleet. For more information, see  Instance type weight in the Amazon EC2 User Guide.
    */
  var Weight: js.UndefOr[DoubleWithConstraints] = js.undefined
}
object FleetCapacityReservation {
  
  inline def apply(): FleetCapacityReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetCapacityReservation]
  }
  
  extension [Self <: FleetCapacityReservation](x: Self) {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneId(value: String): Self = StObject.set(x, "AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "AvailabilityZoneId", js.undefined)
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setCapacityReservationId(value: CapacityReservationId): Self = StObject.set(x, "CapacityReservationId", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationIdUndefined: Self = StObject.set(x, "CapacityReservationId", js.undefined)
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setFulfilledCapacity(value: Double): Self = StObject.set(x, "FulfilledCapacity", value.asInstanceOf[js.Any])
    
    inline def setFulfilledCapacityUndefined: Self = StObject.set(x, "FulfilledCapacity", js.undefined)
    
    inline def setInstancePlatform(value: CapacityReservationInstancePlatform): Self = StObject.set(x, "InstancePlatform", value.asInstanceOf[js.Any])
    
    inline def setInstancePlatformUndefined: Self = StObject.set(x, "InstancePlatform", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setPriority(value: IntegerWithConstraints): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setTotalInstanceCount(value: Integer): Self = StObject.set(x, "TotalInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setTotalInstanceCountUndefined: Self = StObject.set(x, "TotalInstanceCount", js.undefined)
    
    inline def setWeight(value: DoubleWithConstraints): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "Weight", js.undefined)
  }
}
