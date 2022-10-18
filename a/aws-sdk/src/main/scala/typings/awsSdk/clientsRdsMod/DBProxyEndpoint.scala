package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBProxyEndpoint extends StObject {
  
  /**
    * The date and time when the DB proxy endpoint was first created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the DB proxy endpoint.
    */
  var DBProxyEndpointArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name for the DB proxy endpoint. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
    */
  var DBProxyEndpointName: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the DB proxy that is associated with this DB proxy endpoint.
    */
  var DBProxyName: js.UndefOr[String] = js.undefined
  
  /**
    * The endpoint that you can use to connect to the DB proxy. You include the endpoint value in the connection string for a database client application.
    */
  var Endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether this endpoint is the default endpoint for the associated DB proxy. Default DB proxy endpoints always have read/write capability. Other endpoints that you associate with the DB proxy can be either read/write or read-only.
    */
  var IsDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current status of this DB proxy endpoint. A status of available means the endpoint is ready to handle requests. Other values indicate that you must wait for the endpoint to be ready, or take some action to resolve an issue.
    */
  var Status: js.UndefOr[DBProxyEndpointStatus] = js.undefined
  
  /**
    * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
    */
  var TargetRole: js.UndefOr[DBProxyEndpointTargetRole] = js.undefined
  
  /**
    * Provides the VPC ID of the DB proxy endpoint.
    */
  var VpcId: js.UndefOr[String] = js.undefined
  
  /**
    * Provides a list of VPC security groups that the DB proxy endpoint belongs to.
    */
  var VpcSecurityGroupIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * The EC2 subnet IDs for the DB proxy endpoint.
    */
  var VpcSubnetIds: js.UndefOr[StringList] = js.undefined
}
object DBProxyEndpoint {
  
  inline def apply(): DBProxyEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBProxyEndpoint]
  }
  
  extension [Self <: DBProxyEndpoint](x: Self) {
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setDBProxyEndpointArn(value: String): Self = StObject.set(x, "DBProxyEndpointArn", value.asInstanceOf[js.Any])
    
    inline def setDBProxyEndpointArnUndefined: Self = StObject.set(x, "DBProxyEndpointArn", js.undefined)
    
    inline def setDBProxyEndpointName(value: String): Self = StObject.set(x, "DBProxyEndpointName", value.asInstanceOf[js.Any])
    
    inline def setDBProxyEndpointNameUndefined: Self = StObject.set(x, "DBProxyEndpointName", js.undefined)
    
    inline def setDBProxyName(value: String): Self = StObject.set(x, "DBProxyName", value.asInstanceOf[js.Any])
    
    inline def setDBProxyNameUndefined: Self = StObject.set(x, "DBProxyName", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "IsDefault", js.undefined)
    
    inline def setStatus(value: DBProxyEndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTargetRole(value: DBProxyEndpointTargetRole): Self = StObject.set(x, "TargetRole", value.asInstanceOf[js.Any])
    
    inline def setTargetRoleUndefined: Self = StObject.set(x, "TargetRole", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    inline def setVpcSecurityGroupIds(value: StringList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value*))
    
    inline def setVpcSubnetIds(value: StringList): Self = StObject.set(x, "VpcSubnetIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSubnetIdsUndefined: Self = StObject.set(x, "VpcSubnetIds", js.undefined)
    
    inline def setVpcSubnetIdsVarargs(value: String*): Self = StObject.set(x, "VpcSubnetIds", js.Array(value*))
  }
}
