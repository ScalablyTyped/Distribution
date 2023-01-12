package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBProxyEndpointRequest extends StObject {
  
  /**
    * The name of the DB proxy endpoint to create.
    */
  var DBProxyEndpointName: typings.awsSdk.clientsRdsMod.DBProxyEndpointName
  
  /**
    * The name of the DB proxy associated with the DB proxy endpoint that you create.
    */
  var DBProxyName: typings.awsSdk.clientsRdsMod.DBProxyName
  
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations. The default is READ_WRITE. The only role that proxies for RDS for Microsoft SQL Server support is READ_WRITE.
    */
  var TargetRole: js.UndefOr[DBProxyEndpointTargetRole] = js.undefined
  
  /**
    * The VPC security group IDs for the DB proxy endpoint that you create. You can specify a different set of security group IDs than for the original DB proxy. The default is the default security group for the VPC.
    */
  var VpcSecurityGroupIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * The VPC subnet IDs for the DB proxy endpoint that you create. You can specify a different set of subnet IDs than for the original DB proxy.
    */
  var VpcSubnetIds: StringList
}
object CreateDBProxyEndpointRequest {
  
  inline def apply(DBProxyEndpointName: DBProxyEndpointName, DBProxyName: DBProxyName, VpcSubnetIds: StringList): CreateDBProxyEndpointRequest = {
    val __obj = js.Dynamic.literal(DBProxyEndpointName = DBProxyEndpointName.asInstanceOf[js.Any], DBProxyName = DBProxyName.asInstanceOf[js.Any], VpcSubnetIds = VpcSubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBProxyEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDBProxyEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setDBProxyEndpointName(value: DBProxyEndpointName): Self = StObject.set(x, "DBProxyEndpointName", value.asInstanceOf[js.Any])
    
    inline def setDBProxyName(value: DBProxyName): Self = StObject.set(x, "DBProxyName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetRole(value: DBProxyEndpointTargetRole): Self = StObject.set(x, "TargetRole", value.asInstanceOf[js.Any])
    
    inline def setTargetRoleUndefined: Self = StObject.set(x, "TargetRole", js.undefined)
    
    inline def setVpcSecurityGroupIds(value: StringList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value*))
    
    inline def setVpcSubnetIds(value: StringList): Self = StObject.set(x, "VpcSubnetIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSubnetIdsVarargs(value: String*): Self = StObject.set(x, "VpcSubnetIds", js.Array(value*))
  }
}
