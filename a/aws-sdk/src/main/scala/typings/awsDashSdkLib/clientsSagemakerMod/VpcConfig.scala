package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcConfig extends js.Object {
  /**
    * The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security groups for the VPC that is specified in the Subnets field.
    */
  var SecurityGroupIds: VpcSecurityGroupIds
  /**
    * The ID of the subnets in the VPC to which you want to connect your training job or model. 
    */
  var Subnets: awsDashSdkLib.clientsSagemakerMod.Subnets
}

object VpcConfig {
  @scala.inline
  def apply(SecurityGroupIds: VpcSecurityGroupIds, Subnets: Subnets): VpcConfig = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds, Subnets = Subnets)
  
    __obj.asInstanceOf[VpcConfig]
  }
}

