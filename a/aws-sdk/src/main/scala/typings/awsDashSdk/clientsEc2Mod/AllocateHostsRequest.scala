package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateHostsRequest extends js.Object {
  /**
    * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. For more information, see  Understanding Instance Placement and Host Affinity in the Amazon EC2 User Guide for Linux Instances. Default: on 
    */
  var AutoPlacement: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.AutoPlacement] = js.native
  /**
    * The Availability Zone in which to allocate the Dedicated Host.
    */
  var AvailabilityZone: String = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by default. For more information, see  Host Recovery in the Amazon Elastic Compute Cloud User Guide. Default: off 
    */
  var HostRecovery: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.HostRecovery] = js.native
  /**
    * Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the Dedicated Hosts support multiple instance types within that instance family. If you want the Dedicated Hosts to support a specific instance type only, omit this parameter and specify InstanceType instead. You cannot specify InstanceFamily and InstanceType in the same request.
    */
  var InstanceFamily: js.UndefOr[String] = js.native
  /**
    * Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the Dedicated Hosts support instances of the specified instance type only. If you want the Dedicated Hosts to support multiple instance types in a specific instance family, omit this parameter and specify InstanceFamily instead. You cannot specify InstanceType and InstanceFamily in the same request.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The number of Dedicated Hosts to allocate to your account with these parameters.
    */
  var Quantity: Integer = js.native
  /**
    * The tags to apply to the Dedicated Host during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}

object AllocateHostsRequest {
  @scala.inline
  def apply(
    AvailabilityZone: String,
    Quantity: Integer,
    AutoPlacement: AutoPlacement = null,
    ClientToken: String = null,
    HostRecovery: HostRecovery = null,
    InstanceFamily: String = null,
    InstanceType: String = null,
    TagSpecifications: TagSpecificationList = null
  ): AllocateHostsRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    if (AutoPlacement != null) __obj.updateDynamic("AutoPlacement")(AutoPlacement.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (HostRecovery != null) __obj.updateDynamic("HostRecovery")(HostRecovery.asInstanceOf[js.Any])
    if (InstanceFamily != null) __obj.updateDynamic("InstanceFamily")(InstanceFamily.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateHostsRequest]
  }
}

