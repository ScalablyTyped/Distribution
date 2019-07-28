package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcConfig extends js.Object {
  /**
    * The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security groups for the VPC that is specified in the Subnets field.
    */
  var SecurityGroupIds: VpcSecurityGroupIds
  /**
    * The ID of the subnets in the VPC to which you want to connect your training job or model.   Amazon EC2 P3 accelerated computing instances are not available in the c/d/e availability zones of region us-east-1. If you want to create endpoints with P3 instances in VPC mode in region us-east-1, create subnets in a/b/f availability zones instead. 
    */
  var Subnets: typings.awsDashSdk.clientsSagemakerMod.Subnets
}

object VpcConfig {
  @scala.inline
  def apply(SecurityGroupIds: VpcSecurityGroupIds, Subnets: Subnets): VpcConfig = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds, Subnets = Subnets)
  
    __obj.asInstanceOf[VpcConfig]
  }
}

