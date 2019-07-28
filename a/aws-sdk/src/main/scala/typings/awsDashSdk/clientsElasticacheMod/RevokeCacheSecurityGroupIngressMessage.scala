package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeCacheSecurityGroupIngressMessage extends js.Object {
  /**
    * The name of the cache security group to revoke ingress from.
    */
  var CacheSecurityGroupName: String
  /**
    * The name of the Amazon EC2 security group to revoke access from.
    */
  var EC2SecurityGroupName: String
  /**
    * The AWS account number of the Amazon EC2 security group owner. Note that this is not the same thing as an AWS access key ID - you must provide a valid AWS account number for this parameter.
    */
  var EC2SecurityGroupOwnerId: String
}

object RevokeCacheSecurityGroupIngressMessage {
  @scala.inline
  def apply(CacheSecurityGroupName: String, EC2SecurityGroupName: String, EC2SecurityGroupOwnerId: String): RevokeCacheSecurityGroupIngressMessage = {
    val __obj = js.Dynamic.literal(CacheSecurityGroupName = CacheSecurityGroupName, EC2SecurityGroupName = EC2SecurityGroupName, EC2SecurityGroupOwnerId = EC2SecurityGroupOwnerId)
  
    __obj.asInstanceOf[RevokeCacheSecurityGroupIngressMessage]
  }
}

