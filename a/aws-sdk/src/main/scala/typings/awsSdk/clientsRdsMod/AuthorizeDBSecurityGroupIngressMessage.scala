package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeDBSecurityGroupIngressMessage extends StObject {
  
  /**
    * The IP range to authorize.
    */
  var CIDRIP: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the DB security group to add authorization to.
    */
  var DBSecurityGroupName: String
  
  /**
    * Id of the EC2 security group to authorize. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided.
    */
  var EC2SecurityGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the EC2 security group to authorize. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon Web Services account number of the owner of the EC2 security group specified in the EC2SecurityGroupName parameter. The Amazon Web Services access key ID isn't an acceptable value. For VPC DB security groups, EC2SecurityGroupId must be provided. Otherwise, EC2SecurityGroupOwnerId and either EC2SecurityGroupName or EC2SecurityGroupId must be provided.
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
}
object AuthorizeDBSecurityGroupIngressMessage {
  
  inline def apply(DBSecurityGroupName: String): AuthorizeDBSecurityGroupIngressMessage = {
    val __obj = js.Dynamic.literal(DBSecurityGroupName = DBSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeDBSecurityGroupIngressMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizeDBSecurityGroupIngressMessage] (val x: Self) extends AnyVal {
    
    inline def setCIDRIP(value: String): Self = StObject.set(x, "CIDRIP", value.asInstanceOf[js.Any])
    
    inline def setCIDRIPUndefined: Self = StObject.set(x, "CIDRIP", js.undefined)
    
    inline def setDBSecurityGroupName(value: String): Self = StObject.set(x, "DBSecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setEC2SecurityGroupId(value: String): Self = StObject.set(x, "EC2SecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setEC2SecurityGroupIdUndefined: Self = StObject.set(x, "EC2SecurityGroupId", js.undefined)
    
    inline def setEC2SecurityGroupName(value: String): Self = StObject.set(x, "EC2SecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setEC2SecurityGroupNameUndefined: Self = StObject.set(x, "EC2SecurityGroupName", js.undefined)
    
    inline def setEC2SecurityGroupOwnerId(value: String): Self = StObject.set(x, "EC2SecurityGroupOwnerId", value.asInstanceOf[js.Any])
    
    inline def setEC2SecurityGroupOwnerIdUndefined: Self = StObject.set(x, "EC2SecurityGroupOwnerId", js.undefined)
  }
}
