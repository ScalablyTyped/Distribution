package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeClusterSecurityGroupIngressMessage extends StObject {
  
  /**
    * The IP range to be added the Amazon Redshift security group.
    */
  var CIDRIP: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the security group to which the ingress rule is added.
    */
  var ClusterSecurityGroupName: String
  
  /**
    * The EC2 security group to be added the Amazon Redshift security group.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services account number of the owner of the security group specified by the EC2SecurityGroupName parameter. The Amazon Web Services Access Key ID is not an acceptable value.  Example: 111122223333 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
}
object AuthorizeClusterSecurityGroupIngressMessage {
  
  inline def apply(ClusterSecurityGroupName: String): AuthorizeClusterSecurityGroupIngressMessage = {
    val __obj = js.Dynamic.literal(ClusterSecurityGroupName = ClusterSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeClusterSecurityGroupIngressMessage]
  }
  
  extension [Self <: AuthorizeClusterSecurityGroupIngressMessage](x: Self) {
    
    inline def setCIDRIP(value: String): Self = StObject.set(x, "CIDRIP", value.asInstanceOf[js.Any])
    
    inline def setCIDRIPUndefined: Self = StObject.set(x, "CIDRIP", js.undefined)
    
    inline def setClusterSecurityGroupName(value: String): Self = StObject.set(x, "ClusterSecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setEC2SecurityGroupName(value: String): Self = StObject.set(x, "EC2SecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setEC2SecurityGroupNameUndefined: Self = StObject.set(x, "EC2SecurityGroupName", js.undefined)
    
    inline def setEC2SecurityGroupOwnerId(value: String): Self = StObject.set(x, "EC2SecurityGroupOwnerId", value.asInstanceOf[js.Any])
    
    inline def setEC2SecurityGroupOwnerIdUndefined: Self = StObject.set(x, "EC2SecurityGroupOwnerId", js.undefined)
  }
}
