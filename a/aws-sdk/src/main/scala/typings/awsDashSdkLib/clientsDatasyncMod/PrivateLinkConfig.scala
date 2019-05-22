package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateLinkConfig extends js.Object {
  var PrivateLinkEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var SecurityGroupArns: js.UndefOr[PLSecurityGroupArnList] = js.undefined
  var SubnetArns: js.UndefOr[PLSubnetArnList] = js.undefined
}

object PrivateLinkConfig {
  @scala.inline
  def apply(
    PrivateLinkEndpoint: java.lang.String = null,
    SecurityGroupArns: PLSecurityGroupArnList = null,
    SubnetArns: PLSubnetArnList = null
  ): PrivateLinkConfig = {
    val __obj = js.Dynamic.literal()
    if (PrivateLinkEndpoint != null) __obj.updateDynamic("PrivateLinkEndpoint")(PrivateLinkEndpoint)
    if (SecurityGroupArns != null) __obj.updateDynamic("SecurityGroupArns")(SecurityGroupArns)
    if (SubnetArns != null) __obj.updateDynamic("SubnetArns")(SubnetArns)
    __obj.asInstanceOf[PrivateLinkConfig]
  }
}

