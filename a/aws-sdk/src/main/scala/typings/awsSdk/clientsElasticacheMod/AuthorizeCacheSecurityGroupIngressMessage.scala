package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeCacheSecurityGroupIngressMessage extends StObject {
  
  /**
    * The cache security group that allows network ingress.
    */
  var CacheSecurityGroupName: String
  
  /**
    * The Amazon EC2 security group to be authorized for ingress to the cache security group.
    */
  var EC2SecurityGroupName: String
  
  /**
    * The Amazon account number of the Amazon EC2 security group owner. Note that this is not the same thing as an Amazon access key ID - you must provide a valid Amazon account number for this parameter.
    */
  var EC2SecurityGroupOwnerId: String
}
object AuthorizeCacheSecurityGroupIngressMessage {
  
  inline def apply(CacheSecurityGroupName: String, EC2SecurityGroupName: String, EC2SecurityGroupOwnerId: String): AuthorizeCacheSecurityGroupIngressMessage = {
    val __obj = js.Dynamic.literal(CacheSecurityGroupName = CacheSecurityGroupName.asInstanceOf[js.Any], EC2SecurityGroupName = EC2SecurityGroupName.asInstanceOf[js.Any], EC2SecurityGroupOwnerId = EC2SecurityGroupOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeCacheSecurityGroupIngressMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizeCacheSecurityGroupIngressMessage] (val x: Self) extends AnyVal {
    
    inline def setCacheSecurityGroupName(value: String): Self = StObject.set(x, "CacheSecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setEC2SecurityGroupName(value: String): Self = StObject.set(x, "EC2SecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setEC2SecurityGroupOwnerId(value: String): Self = StObject.set(x, "EC2SecurityGroupOwnerId", value.asInstanceOf[js.Any])
  }
}
