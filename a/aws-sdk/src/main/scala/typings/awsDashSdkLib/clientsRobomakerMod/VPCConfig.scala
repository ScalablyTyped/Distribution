package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VPCConfig extends js.Object {
  /**
    * A boolean indicating whether to assign a public IP address.
    */
  var assignPublicIp: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of one or more security groups IDs in your VPC.
    */
  var securityGroups: js.UndefOr[SecurityGroups] = js.undefined
  /**
    * A list of one or more subnet IDs in your VPC.
    */
  var subnets: Subnets
}

object VPCConfig {
  @scala.inline
  def apply(
    subnets: Subnets,
    assignPublicIp: js.UndefOr[Boolean] = js.undefined,
    securityGroups: SecurityGroups = null
  ): VPCConfig = {
    val __obj = js.Dynamic.literal(subnets = subnets)
    if (!js.isUndefined(assignPublicIp)) __obj.updateDynamic("assignPublicIp")(assignPublicIp)
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups)
    __obj.asInstanceOf[VPCConfig]
  }
}

