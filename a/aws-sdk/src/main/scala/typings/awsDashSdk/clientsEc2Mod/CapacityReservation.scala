package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapacityReservation extends js.Object {
  /**
    * The Availability Zone in which the capacity is reserved.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The Availability Zone ID of the Capacity Reservation.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.undefined
  /**
    * The remaining capacity. Indicates the number of instances that can be launched in the Capacity Reservation.
    */
  var AvailableInstanceCount: js.UndefOr[Integer] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Capacity Reservation.
    */
  var CapacityReservationArn: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: js.UndefOr[String] = js.undefined
  /**
    * The date and time at which the Capacity Reservation was created.
    */
  var CreateDate: js.UndefOr[DateTime] = js.undefined
  /**
    * Indicates whether the Capacity Reservation supports EBS-optimized instances. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS- optimized instance.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  /**
    * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. The Capacity Reservation's state changes to expired when it reaches its end date and time.
    */
  var EndDate: js.UndefOr[DateTime] = js.undefined
  /**
    * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following end types:    unlimited - The Capacity Reservation remains active until you explicitly cancel it.    limited - The Capacity Reservation expires automatically at a specified date and time.  
    */
  var EndDateType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.EndDateType] = js.undefined
  /**
    * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
    */
  var EphemeralStorage: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates the type of instance launches that the Capacity Reservation accepts. The options include:    open - The Capacity Reservation accepts all instances that have matching attributes (instance type, platform, and Availability Zone). Instances that have matching attributes launch into the Capacity Reservation automatically without specifying any additional parameters.    targeted - The Capacity Reservation only accepts instances that have matching attributes (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This ensures that only permitted instances can use the reserved capacity.   
    */
  var InstanceMatchCriteria: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.InstanceMatchCriteria] = js.undefined
  /**
    * The type of operating system for which the Capacity Reservation reserves capacity.
    */
  var InstancePlatform: js.UndefOr[CapacityReservationInstancePlatform] = js.undefined
  /**
    * The type of instance for which the Capacity Reservation reserves capacity.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  /**
    * The ID of the AWS account that owns the Capacity Reservation.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following states:    active - The Capacity Reservation is active and the capacity is available for your use.    expired - The Capacity Reservation expired automatically at the date and time specified in your request. The reserved capacity is no longer available for your use.    cancelled - The Capacity Reservation was manually cancelled. The reserved capacity is no longer available for your use.    pending - The Capacity Reservation request was successful but the capacity provisioning is still pending.    failed - The Capacity Reservation request has failed. A request might fail due to invalid request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.  
    */
  var State: js.UndefOr[CapacityReservationState] = js.undefined
  /**
    * Any tags assigned to the Capacity Reservation.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the following tenancy settings:    default - The Capacity Reservation is created on hardware that is shared with other AWS accounts.    dedicated - The Capacity Reservation is created on single-tenant hardware that is dedicated to a single AWS account.  
    */
  var Tenancy: js.UndefOr[CapacityReservationTenancy] = js.undefined
  /**
    * The total number of instances for which the Capacity Reservation reserves capacity.
    */
  var TotalInstanceCount: js.UndefOr[Integer] = js.undefined
}

object CapacityReservation {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    AvailabilityZoneId: String = null,
    AvailableInstanceCount: js.UndefOr[Integer] = js.undefined,
    CapacityReservationArn: String = null,
    CapacityReservationId: String = null,
    CreateDate: DateTime = null,
    EbsOptimized: js.UndefOr[Boolean] = js.undefined,
    EndDate: DateTime = null,
    EndDateType: EndDateType = null,
    EphemeralStorage: js.UndefOr[Boolean] = js.undefined,
    InstanceMatchCriteria: InstanceMatchCriteria = null,
    InstancePlatform: CapacityReservationInstancePlatform = null,
    InstanceType: String = null,
    OwnerId: String = null,
    State: CapacityReservationState = null,
    Tags: TagList = null,
    Tenancy: CapacityReservationTenancy = null,
    TotalInstanceCount: js.UndefOr[Integer] = js.undefined
  ): CapacityReservation = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (AvailabilityZoneId != null) __obj.updateDynamic("AvailabilityZoneId")(AvailabilityZoneId)
    if (!js.isUndefined(AvailableInstanceCount)) __obj.updateDynamic("AvailableInstanceCount")(AvailableInstanceCount)
    if (CapacityReservationArn != null) __obj.updateDynamic("CapacityReservationArn")(CapacityReservationArn)
    if (CapacityReservationId != null) __obj.updateDynamic("CapacityReservationId")(CapacityReservationId)
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized)
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate)
    if (EndDateType != null) __obj.updateDynamic("EndDateType")(EndDateType.asInstanceOf[js.Any])
    if (!js.isUndefined(EphemeralStorage)) __obj.updateDynamic("EphemeralStorage")(EphemeralStorage)
    if (InstanceMatchCriteria != null) __obj.updateDynamic("InstanceMatchCriteria")(InstanceMatchCriteria.asInstanceOf[js.Any])
    if (InstancePlatform != null) __obj.updateDynamic("InstancePlatform")(InstancePlatform.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (Tenancy != null) __obj.updateDynamic("Tenancy")(Tenancy.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalInstanceCount)) __obj.updateDynamic("TotalInstanceCount")(TotalInstanceCount)
    __obj.asInstanceOf[CapacityReservation]
  }
}

