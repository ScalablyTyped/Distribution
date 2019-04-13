package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ec2Config extends js.Object {
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are configured for the Amazon EC2 resource.
    */
  var SecurityGroupArns: Ec2SecurityGroupArnList
  /**
    * The ARN of the subnet that the Amazon EC2 resource belongs in. 
    */
  var SubnetArn: Ec2SubnetArn
}

object Ec2Config {
  @scala.inline
  def apply(SecurityGroupArns: Ec2SecurityGroupArnList, SubnetArn: Ec2SubnetArn): Ec2Config = {
    val __obj = js.Dynamic.literal(SecurityGroupArns = SecurityGroupArns, SubnetArn = SubnetArn)
  
    __obj.asInstanceOf[Ec2Config]
  }
}

