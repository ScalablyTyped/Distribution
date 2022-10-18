package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ec2Config extends StObject {
  
  /**
    * Specifies the Amazon Resource Names (ARNs) of the security groups associated with an Amazon EFS file system's mount target.
    */
  var SecurityGroupArns: Ec2SecurityGroupArnList
  
  /**
    * Specifies the ARN of a subnet where DataSync creates the network interfaces for managing traffic during your transfer. The subnet must be located:   In the same virtual private cloud (VPC) as the Amazon EFS file system.   In the same Availability Zone as at least one mount target for the Amazon EFS file system.    You don't need to specify a subnet that includes a file system mount target. 
    */
  var SubnetArn: Ec2SubnetArn
}
object Ec2Config {
  
  inline def apply(SecurityGroupArns: Ec2SecurityGroupArnList, SubnetArn: Ec2SubnetArn): Ec2Config = {
    val __obj = js.Dynamic.literal(SecurityGroupArns = SecurityGroupArns.asInstanceOf[js.Any], SubnetArn = SubnetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ec2Config]
  }
  
  extension [Self <: Ec2Config](x: Self) {
    
    inline def setSecurityGroupArns(value: Ec2SecurityGroupArnList): Self = StObject.set(x, "SecurityGroupArns", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupArnsVarargs(value: Ec2SecurityGroupArn*): Self = StObject.set(x, "SecurityGroupArns", js.Array(value*))
    
    inline def setSubnetArn(value: Ec2SubnetArn): Self = StObject.set(x, "SubnetArn", value.asInstanceOf[js.Any])
  }
}
