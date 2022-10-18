package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCapacityReservationRequest extends StObject {
  
  /**
    * The Availability Zone in which to create the Capacity Reservation.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Availability Zone in which to create the Capacity Reservation.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the Capacity Reservation supports EBS-optimized instances. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS- optimized instance.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. The Capacity Reservation's state changes to expired when it reaches its end date and time. You must provide an EndDate value if EndDateType is limited. Omit EndDate if EndDateType is unlimited. If the EndDateType is limited, the Capacity Reservation is cancelled within an hour from the specified time. For example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation is guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
    */
  var EndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following end types:    unlimited - The Capacity Reservation remains active until you explicitly cancel it. Do not provide an EndDate if the EndDateType is unlimited.    limited - The Capacity Reservation expires automatically at a specified date and time. You must provide an EndDate value if the EndDateType value is limited.  
    */
  var EndDateType: js.UndefOr[typings.awsSdk.clientsEc2Mod.EndDateType] = js.undefined
  
  /**
    *  Deprecated. 
    */
  var EphemeralStorage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of instances for which to reserve capacity. Valid range: 1 - 1000
    */
  var InstanceCount: Integer
  
  /**
    * Indicates the type of instance launches that the Capacity Reservation accepts. The options include:    open - The Capacity Reservation automatically matches all instances that have matching attributes (instance type, platform, and Availability Zone). Instances that have matching attributes run in the Capacity Reservation automatically without specifying any additional parameters.    targeted - The Capacity Reservation only accepts instances that have matching attributes (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This ensures that only permitted instances can use the reserved capacity.    Default: open 
    */
  var InstanceMatchCriteria: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceMatchCriteria] = js.undefined
  
  /**
    * The type of operating system for which to reserve capacity.
    */
  var InstancePlatform: CapacityReservationInstancePlatform
  
  /**
    * The instance type for which to reserve capacity. For more information, see Instance types in the Amazon EC2 User Guide.
    */
  var InstanceType: String
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost on which to create the Capacity Reservation.
    */
  var OutpostArn: js.UndefOr[typings.awsSdk.clientsEc2Mod.OutpostArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the cluster placement group in which to create the Capacity Reservation. For more information, see  Capacity Reservations for cluster placement groups in the Amazon EC2 User Guide.
    */
  var PlacementGroupArn: js.UndefOr[typings.awsSdk.clientsEc2Mod.PlacementGroupArn] = js.undefined
  
  /**
    * The tags to apply to the Capacity Reservation during launch.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the following tenancy settings:    default - The Capacity Reservation is created on hardware that is shared with other Amazon Web Services accounts.    dedicated - The Capacity Reservation is created on single-tenant hardware that is dedicated to a single Amazon Web Services account.  
    */
  var Tenancy: js.UndefOr[CapacityReservationTenancy] = js.undefined
}
object CreateCapacityReservationRequest {
  
  inline def apply(
    InstanceCount: Integer,
    InstancePlatform: CapacityReservationInstancePlatform,
    InstanceType: String
  ): CreateCapacityReservationRequest = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], InstancePlatform = InstancePlatform.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCapacityReservationRequest]
  }
  
  extension [Self <: CreateCapacityReservationRequest](x: Self) {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneId(value: String): Self = StObject.set(x, "AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "AvailabilityZoneId", js.undefined)
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateType(value: EndDateType): Self = StObject.set(x, "EndDateType", value.asInstanceOf[js.Any])
    
    inline def setEndDateTypeUndefined: Self = StObject.set(x, "EndDateType", js.undefined)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    inline def setEphemeralStorage(value: Boolean): Self = StObject.set(x, "EphemeralStorage", value.asInstanceOf[js.Any])
    
    inline def setEphemeralStorageUndefined: Self = StObject.set(x, "EphemeralStorage", js.undefined)
    
    inline def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceMatchCriteria(value: InstanceMatchCriteria): Self = StObject.set(x, "InstanceMatchCriteria", value.asInstanceOf[js.Any])
    
    inline def setInstanceMatchCriteriaUndefined: Self = StObject.set(x, "InstanceMatchCriteria", js.undefined)
    
    inline def setInstancePlatform(value: CapacityReservationInstancePlatform): Self = StObject.set(x, "InstancePlatform", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setOutpostArn(value: OutpostArn): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    inline def setPlacementGroupArn(value: PlacementGroupArn): Self = StObject.set(x, "PlacementGroupArn", value.asInstanceOf[js.Any])
    
    inline def setPlacementGroupArnUndefined: Self = StObject.set(x, "PlacementGroupArn", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
    
    inline def setTenancy(value: CapacityReservationTenancy): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    inline def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
  }
}
