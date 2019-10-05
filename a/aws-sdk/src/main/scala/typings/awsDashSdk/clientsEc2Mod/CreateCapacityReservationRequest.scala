package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCapacityReservationRequest extends js.Object {
  /**
    * The Availability Zone in which to create the Capacity Reservation.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Availability Zone in which to create the Capacity Reservation.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.undefined
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency. Constraint: Maximum 64 ASCII characters.
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
  var EndDate: js.UndefOr[DateTime] = js.undefined
  /**
    * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following end types:    unlimited - The Capacity Reservation remains active until you explicitly cancel it. Do not provide an EndDate if the EndDateType is unlimited.    limited - The Capacity Reservation expires automatically at a specified date and time. You must provide an EndDate value if the EndDateType value is limited.  
    */
  var EndDateType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.EndDateType] = js.undefined
  /**
    * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
    */
  var EphemeralStorage: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of instances for which to reserve capacity.
    */
  var InstanceCount: Integer
  /**
    * Indicates the type of instance launches that the Capacity Reservation accepts. The options include:    open - The Capacity Reservation automatically matches all instances that have matching attributes (instance type, platform, and Availability Zone). Instances that have matching attributes run in the Capacity Reservation automatically without specifying any additional parameters.    targeted - The Capacity Reservation only accepts instances that have matching attributes (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This ensures that only permitted instances can use the reserved capacity.    Default: open 
    */
  var InstanceMatchCriteria: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.InstanceMatchCriteria] = js.undefined
  /**
    * The type of operating system for which to reserve capacity.
    */
  var InstancePlatform: CapacityReservationInstancePlatform
  /**
    * The instance type for which to reserve capacity. For more information, see Instance Types in the Amazon Elastic Compute Cloud User Guide.
    */
  var InstanceType: String
  /**
    * The tags to apply to the Capacity Reservation during launch.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  /**
    * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the following tenancy settings:    default - The Capacity Reservation is created on hardware that is shared with other AWS accounts.    dedicated - The Capacity Reservation is created on single-tenant hardware that is dedicated to a single AWS account.  
    */
  var Tenancy: js.UndefOr[CapacityReservationTenancy] = js.undefined
}

object CreateCapacityReservationRequest {
  @scala.inline
  def apply(
    InstanceCount: Integer,
    InstancePlatform: CapacityReservationInstancePlatform,
    InstanceType: String,
    AvailabilityZone: String = null,
    AvailabilityZoneId: String = null,
    ClientToken: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    EbsOptimized: js.UndefOr[scala.Boolean] = js.undefined,
    EndDate: DateTime = null,
    EndDateType: EndDateType = null,
    EphemeralStorage: js.UndefOr[scala.Boolean] = js.undefined,
    InstanceMatchCriteria: InstanceMatchCriteria = null,
    TagSpecifications: TagSpecificationList = null,
    Tenancy: CapacityReservationTenancy = null
  ): CreateCapacityReservationRequest = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount, InstancePlatform = InstancePlatform.asInstanceOf[js.Any], InstanceType = InstanceType)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (AvailabilityZoneId != null) __obj.updateDynamic("AvailabilityZoneId")(AvailabilityZoneId)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized)
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate)
    if (EndDateType != null) __obj.updateDynamic("EndDateType")(EndDateType.asInstanceOf[js.Any])
    if (!js.isUndefined(EphemeralStorage)) __obj.updateDynamic("EphemeralStorage")(EphemeralStorage)
    if (InstanceMatchCriteria != null) __obj.updateDynamic("InstanceMatchCriteria")(InstanceMatchCriteria.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications)
    if (Tenancy != null) __obj.updateDynamic("Tenancy")(Tenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCapacityReservationRequest]
  }
}

