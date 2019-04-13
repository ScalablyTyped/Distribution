package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VPCConfigResponse extends js.Object {
  /**
    * A boolean indicating if a public IP was assigned.
    */
  var assignPublicIp: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of security group IDs associated with the simulation job.
    */
  var securityGroups: js.UndefOr[SecurityGroups] = js.undefined
  /**
    * A list of subnet IDs associated with the simulation job.
    */
  var subnets: js.UndefOr[Subnets] = js.undefined
  /**
    * The VPC ID associated with your simulation job.
    */
  var vpcId: js.UndefOr[GenericString] = js.undefined
}

object VPCConfigResponse {
  @scala.inline
  def apply(
    assignPublicIp: js.UndefOr[Boolean] = js.undefined,
    securityGroups: SecurityGroups = null,
    subnets: Subnets = null,
    vpcId: GenericString = null
  ): VPCConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assignPublicIp)) __obj.updateDynamic("assignPublicIp")(assignPublicIp)
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups)
    if (subnets != null) __obj.updateDynamic("subnets")(subnets)
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[VPCConfigResponse]
  }
}

