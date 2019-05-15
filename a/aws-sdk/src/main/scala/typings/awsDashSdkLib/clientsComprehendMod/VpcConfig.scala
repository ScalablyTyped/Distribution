package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcConfig extends js.Object {
  /**
    * The ID number for a security group on an instance of your private VPC. Security groups on your VPC function serve as a virtual firewall to control inbound and outbound traffic and provides security for the resources that you’ll be accessing on the VPC. This ID number is preceded by "sg-", for instance: "sg-03b388029b0a285ea". For more information, see Security Groups for your VPC. 
    */
  var SecurityGroupIds: awsDashSdkLib.clientsComprehendMod.SecurityGroupIds
  /**
    * The ID for each subnet being used in your private VPC. This subnet is a subset of the a range of IPv4 addresses used by the VPC and is specific to a given availability zone in the VPC’s region. This ID number is preceded by "subnet-", for instance: "subnet-04ccf456919e69055". For more information, see VPCs and Subnets. 
    */
  var Subnets: awsDashSdkLib.clientsComprehendMod.Subnets
}

object VpcConfig {
  @scala.inline
  def apply(SecurityGroupIds: SecurityGroupIds, Subnets: Subnets): VpcConfig = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds, Subnets = Subnets)
  
    __obj.asInstanceOf[VpcConfig]
  }
}

