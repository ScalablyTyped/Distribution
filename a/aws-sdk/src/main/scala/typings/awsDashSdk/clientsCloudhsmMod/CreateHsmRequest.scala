package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHsmRequest extends js.Object {
  /**
    * A user-defined token to ensure idempotence. Subsequent calls to this operation with the same token will be ignored.
    */
  var ClientToken: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.ClientToken] = js.undefined
  /**
    * The IP address to assign to the HSM's ENI. If an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the subnet.
    */
  var EniIp: js.UndefOr[IpAddress] = js.undefined
  /**
    * The external ID from IamRoleArn, if present.
    */
  var ExternalId: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.ExternalId] = js.undefined
  /**
    * The ARN of an IAM role to enable the AWS CloudHSM service to allocate an ENI on your behalf.
    */
  var IamRoleArn: typings.awsDashSdk.clientsCloudhsmMod.IamRoleArn
  /**
    * The SSH public key to install on the HSM.
    */
  var SshKey: typings.awsDashSdk.clientsCloudhsmMod.SshKey
  /**
    * The identifier of the subnet in your VPC in which to place the HSM.
    */
  var SubnetId: typings.awsDashSdk.clientsCloudhsmMod.SubnetId
  var SubscriptionType: typings.awsDashSdk.clientsCloudhsmMod.SubscriptionType
  /**
    * The IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring server.
    */
  var SyslogIp: js.UndefOr[IpAddress] = js.undefined
}

object CreateHsmRequest {
  @scala.inline
  def apply(
    IamRoleArn: IamRoleArn,
    SshKey: SshKey,
    SubnetId: SubnetId,
    SubscriptionType: SubscriptionType,
    ClientToken: ClientToken = null,
    EniIp: IpAddress = null,
    ExternalId: ExternalId = null,
    SyslogIp: IpAddress = null
  ): CreateHsmRequest = {
    val __obj = js.Dynamic.literal(IamRoleArn = IamRoleArn, SshKey = SshKey, SubnetId = SubnetId, SubscriptionType = SubscriptionType.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (EniIp != null) __obj.updateDynamic("EniIp")(EniIp)
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId)
    if (SyslogIp != null) __obj.updateDynamic("SyslogIp")(SyslogIp)
    __obj.asInstanceOf[CreateHsmRequest]
  }
}

