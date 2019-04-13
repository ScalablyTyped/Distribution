package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyHsmRequest extends js.Object {
  /**
    * The new IP address for the elastic network interface (ENI) attached to the HSM. If the HSM is moved to a different subnet, and an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the new subnet.
    */
  var EniIp: js.UndefOr[IpAddress] = js.undefined
  /**
    * The new external ID.
    */
  var ExternalId: js.UndefOr[ExternalId] = js.undefined
  /**
    * The ARN of the HSM to modify.
    */
  var HsmArn: awsDashSdkLib.clientsCloudhsmMod.HsmArn
  /**
    * The new IAM role ARN.
    */
  var IamRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  /**
    * The new identifier of the subnet that the HSM is in. The new subnet must be in the same Availability Zone as the current subnet.
    */
  var SubnetId: js.UndefOr[SubnetId] = js.undefined
  /**
    * The new IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring server.
    */
  var SyslogIp: js.UndefOr[IpAddress] = js.undefined
}

object ModifyHsmRequest {
  @scala.inline
  def apply(
    HsmArn: HsmArn,
    EniIp: IpAddress = null,
    ExternalId: ExternalId = null,
    IamRoleArn: IamRoleArn = null,
    SubnetId: SubnetId = null,
    SyslogIp: IpAddress = null
  ): ModifyHsmRequest = {
    val __obj = js.Dynamic.literal(HsmArn = HsmArn)
    if (EniIp != null) __obj.updateDynamic("EniIp")(EniIp)
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId)
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (SyslogIp != null) __obj.updateDynamic("SyslogIp")(SyslogIp)
    __obj.asInstanceOf[ModifyHsmRequest]
  }
}

