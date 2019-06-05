package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllocateHostsRequest extends js.Object {
  /**
    * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. For more information, see  Understanding Instance Placement and Host Affinity in the Amazon EC2 User Guide for Linux Instances. Default: on 
    */
  var AutoPlacement: js.UndefOr[AutoPlacement] = js.undefined
  /**
    * The Availability Zone in which to allocate the Dedicated Host.
    */
  var AvailabilityZone: String
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by default. For more information, see  Host Recovery in the Amazon Elastic Compute Cloud User Guide. Default: off 
    */
  var HostRecovery: js.UndefOr[HostRecovery] = js.undefined
  /**
    * Specifies the instance type for which to configure your Dedicated Hosts. When you specify the instance type, that is the only instance type that you can launch onto that host.
    */
  var InstanceType: String
  /**
    * The number of Dedicated Hosts to allocate to your account with these parameters.
    */
  var Quantity: Integer
  /**
    * The tags to apply to the Dedicated Host during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}

object AllocateHostsRequest {
  @scala.inline
  def apply(
    AvailabilityZone: String,
    InstanceType: String,
    Quantity: Integer,
    AutoPlacement: AutoPlacement = null,
    ClientToken: String = null,
    HostRecovery: HostRecovery = null,
    TagSpecifications: TagSpecificationList = null
  ): AllocateHostsRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone, InstanceType = InstanceType, Quantity = Quantity)
    if (AutoPlacement != null) __obj.updateDynamic("AutoPlacement")(AutoPlacement.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (HostRecovery != null) __obj.updateDynamic("HostRecovery")(HostRecovery.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications)
    __obj.asInstanceOf[AllocateHostsRequest]
  }
}

