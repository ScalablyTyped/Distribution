package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2InstanceDetails extends js.Object {
  /**
    * The IAM profile ARN of the instance.
    */
  var IamInstanceProfileArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Amazon Machine Image (AMI) ID of the instance.
    */
  var ImageId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The IPv4 addresses associated with the instance.
    */
  var IpV4Addresses: js.UndefOr[StringList] = js.native
  /**
    * The IPv6 addresses associated with the instance.
    */
  var IpV6Addresses: js.UndefOr[StringList] = js.native
  /**
    * The key name associated with the instance.
    */
  var KeyName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date/time the instance was launched.
    */
  var LaunchedAt: js.UndefOr[NonEmptyString] = js.native
  /**
    * The identifier of the subnet that the instance was launched in.
    */
  var SubnetId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The instance type of the instance. 
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
  /**
    * The identifier of the VPC that the instance was launched in.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
}

object AwsEc2InstanceDetails {
  @scala.inline
  def apply(
    IamInstanceProfileArn: NonEmptyString = null,
    ImageId: NonEmptyString = null,
    IpV4Addresses: StringList = null,
    IpV6Addresses: StringList = null,
    KeyName: NonEmptyString = null,
    LaunchedAt: NonEmptyString = null,
    SubnetId: NonEmptyString = null,
    Type: NonEmptyString = null,
    VpcId: NonEmptyString = null
  ): AwsEc2InstanceDetails = {
    val __obj = js.Dynamic.literal()
    if (IamInstanceProfileArn != null) __obj.updateDynamic("IamInstanceProfileArn")(IamInstanceProfileArn.asInstanceOf[js.Any])
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    if (IpV4Addresses != null) __obj.updateDynamic("IpV4Addresses")(IpV4Addresses.asInstanceOf[js.Any])
    if (IpV6Addresses != null) __obj.updateDynamic("IpV6Addresses")(IpV6Addresses.asInstanceOf[js.Any])
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName.asInstanceOf[js.Any])
    if (LaunchedAt != null) __obj.updateDynamic("LaunchedAt")(LaunchedAt.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsEc2InstanceDetails]
  }
}

