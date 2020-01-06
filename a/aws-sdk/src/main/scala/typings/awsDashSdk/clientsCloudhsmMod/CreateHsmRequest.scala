package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHsmRequest extends js.Object {
  /**
    * A user-defined token to ensure idempotence. Subsequent calls to this operation with the same token will be ignored.
    */
  var ClientToken: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.ClientToken] = js.native
  /**
    * The IP address to assign to the HSM's ENI. If an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the subnet.
    */
  var EniIp: js.UndefOr[IpAddress] = js.native
  /**
    * The external ID from IamRoleArn, if present.
    */
  var ExternalId: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.ExternalId] = js.native
  /**
    * The ARN of an IAM role to enable the AWS CloudHSM service to allocate an ENI on your behalf.
    */
  var IamRoleArn: typings.awsDashSdk.clientsCloudhsmMod.IamRoleArn = js.native
  /**
    * The SSH public key to install on the HSM.
    */
  var SshKey: typings.awsDashSdk.clientsCloudhsmMod.SshKey = js.native
  /**
    * The identifier of the subnet in your VPC in which to place the HSM.
    */
  var SubnetId: typings.awsDashSdk.clientsCloudhsmMod.SubnetId = js.native
  var SubscriptionType: typings.awsDashSdk.clientsCloudhsmMod.SubscriptionType = js.native
  /**
    * The IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring server.
    */
  var SyslogIp: js.UndefOr[IpAddress] = js.native
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
    val __obj = js.Dynamic.literal(IamRoleArn = IamRoleArn.asInstanceOf[js.Any], SshKey = SshKey.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any], SubscriptionType = SubscriptionType.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (EniIp != null) __obj.updateDynamic("EniIp")(EniIp.asInstanceOf[js.Any])
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId.asInstanceOf[js.Any])
    if (SyslogIp != null) __obj.updateDynamic("SyslogIp")(SyslogIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHsmRequest]
  }
}

