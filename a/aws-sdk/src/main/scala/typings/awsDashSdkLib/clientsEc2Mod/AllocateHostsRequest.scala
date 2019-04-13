package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllocateHostsRequest extends js.Object {
  /**
    * This is enabled by default. This property allows instances to be automatically placed onto available Dedicated Hosts, when you are launching instances without specifying a host ID. Default: Enabled
    */
  var AutoPlacement: js.UndefOr[AutoPlacement] = js.undefined
  /**
    * The Availability Zone for the Dedicated Hosts.
    */
  var AvailabilityZone: String
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency in the Amazon Elastic Compute Cloud User Guide. 
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * Specify the instance type for which to configure your Dedicated Hosts. When you specify the instance type, that is the only instance type that you can launch onto that host.
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
    TagSpecifications: TagSpecificationList = null
  ): AllocateHostsRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone, InstanceType = InstanceType, Quantity = Quantity)
    if (AutoPlacement != null) __obj.updateDynamic("AutoPlacement")(AutoPlacement.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications)
    __obj.asInstanceOf[AllocateHostsRequest]
  }
}

