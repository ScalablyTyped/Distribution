package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcConfig extends js.Object {
  /**
    * A list of one or more security groups IDs in your Amazon VPC.
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIds] = js.native
  /**
    * A list of one or more subnet IDs in your Amazon VPC.
    */
  var subnets: js.UndefOr[Subnets] = js.native
  /**
    * The ID of the Amazon VPC.
    */
  var vpcId: js.UndefOr[NonEmptyString] = js.native
}

object VpcConfig {
  @scala.inline
  def apply(securityGroupIds: SecurityGroupIds = null, subnets: Subnets = null, vpcId: NonEmptyString = null): VpcConfig = {
    val __obj = js.Dynamic.literal()
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (subnets != null) __obj.updateDynamic("subnets")(subnets.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfig]
  }
}

