package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accelerator extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the accelerator.
    */
  var AcceleratorArn: js.UndefOr[GenericString] = js.native
  /**
    * The date and time that the accelerator was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The Domain Name System (DNS) name that Global Accelerator creates that points to your accelerator's static IP addresses.  The naming convention for the DNS name is: a lower case letter a, followed by a 16-bit random hex string, followed by .awsglobalaccelerator.com. For example: a1234567890abcdef.awsglobalaccelerator.com. For more information about the default DNS name, see Support for DNS Addressing in Global Accelerator in the AWS Global Accelerator Developer Guide.
    */
  var DnsName: js.UndefOr[GenericString] = js.native
  /**
    * Indicates whether the accelerator is enabled. The value is true or false. The default value is true.  If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator can be deleted.
    */
  var Enabled: js.UndefOr[GenericBoolean] = js.native
  /**
    * The value for the address type must be IPv4. 
    */
  var IpAddressType: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.IpAddressType] = js.native
  /**
    * The static IP addresses that Global Accelerator associates with the accelerator.
    */
  var IpSets: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.IpSets] = js.native
  /**
    * The date and time that the accelerator was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the accelerator. The name must contain only alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
    */
  var Name: js.UndefOr[GenericString] = js.native
  /**
    * Describes the deployment status of the accelerator.
    */
  var Status: js.UndefOr[AcceleratorStatus] = js.native
}

object Accelerator {
  @scala.inline
  def apply(
    AcceleratorArn: GenericString = null,
    CreatedTime: Timestamp = null,
    DnsName: GenericString = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    IpAddressType: IpAddressType = null,
    IpSets: IpSets = null,
    LastModifiedTime: Timestamp = null,
    Name: GenericString = null,
    Status: AcceleratorStatus = null
  ): Accelerator = {
    val __obj = js.Dynamic.literal()
    if (AcceleratorArn != null) __obj.updateDynamic("AcceleratorArn")(AcceleratorArn.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (DnsName != null) __obj.updateDynamic("DnsName")(DnsName.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (IpAddressType != null) __obj.updateDynamic("IpAddressType")(IpAddressType.asInstanceOf[js.Any])
    if (IpSets != null) __obj.updateDynamic("IpSets")(IpSets.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accelerator]
  }
}

