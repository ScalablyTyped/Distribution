package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsEc2InstanceDetails extends js.Object {
  /**
    * The IAM profile ARN of the instance.
    */
  var IamInstanceProfileArn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The Amazon Machine Image (AMI) ID of the instance.
    */
  var ImageId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The IPv4 addresses associated with the instance.
    */
  var IpV4Addresses: js.UndefOr[StringList] = js.undefined
  /**
    * The IPv6 addresses associated with the instance.
    */
  var IpV6Addresses: js.UndefOr[StringList] = js.undefined
  /**
    * The key name associated with the instance.
    */
  var KeyName: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The date/time the instance was launched.
    */
  var LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The identifier of the subnet that the instance was launched in.
    */
  var SubnetId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The instance type of the instance. 
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The identifier of the VPC that the instance was launched in.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.undefined
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
    if (IamInstanceProfileArn != null) __obj.updateDynamic("IamInstanceProfileArn")(IamInstanceProfileArn)
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    if (IpV4Addresses != null) __obj.updateDynamic("IpV4Addresses")(IpV4Addresses)
    if (IpV6Addresses != null) __obj.updateDynamic("IpV6Addresses")(IpV6Addresses)
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName)
    if (LaunchedAt != null) __obj.updateDynamic("LaunchedAt")(LaunchedAt)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[AwsEc2InstanceDetails]
  }
}

