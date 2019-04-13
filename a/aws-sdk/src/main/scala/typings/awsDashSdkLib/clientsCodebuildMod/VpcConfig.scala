package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcConfig extends js.Object {
  /**
    * A list of one or more security groups IDs in your Amazon VPC.
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
  /**
    * A list of one or more subnet IDs in your Amazon VPC.
    */
  var subnets: js.UndefOr[Subnets] = js.undefined
  /**
    * The ID of the Amazon VPC.
    */
  var vpcId: js.UndefOr[NonEmptyString] = js.undefined
}

object VpcConfig {
  @scala.inline
  def apply(securityGroupIds: SecurityGroupIds = null, subnets: Subnets = null, vpcId: NonEmptyString = null): VpcConfig = {
    val __obj = js.Dynamic.literal()
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds)
    if (subnets != null) __obj.updateDynamic("subnets")(subnets)
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[VpcConfig]
  }
}

