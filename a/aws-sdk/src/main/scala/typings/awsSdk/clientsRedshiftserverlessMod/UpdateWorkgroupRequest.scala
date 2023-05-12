package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkgroupRequest extends StObject {
  
  /**
    * The new base data warehouse capacity in Redshift Processing Units (RPUs).
    */
  var baseCapacity: js.UndefOr[Integer] = js.undefined
  
  /**
    * An array of parameters to set for advanced control over a database. The options are auto_mv, datestyle, enable_case_sensitivity_identifier, enable_user_activity_logging, query_group, search_path, and query monitoring metrics that let you define performance boundaries. For more information about query monitoring rules and available metrics, see  Query monitoring metrics for Amazon Redshift Serverless.
    */
  var configParameters: js.UndefOr[ConfigParameterList] = js.undefined
  
  /**
    * The value that specifies whether to turn on enhanced virtual private cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC.
    */
  var enhancedVpcRouting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The custom port to use when connecting to a workgroup. Valid port ranges are 5431-5455 and 8191-8215. The default is 5439.
    */
  var port: js.UndefOr[Integer] = js.undefined
  
  /**
    * A value that specifies whether the workgroup can be accessible from a public network.
    */
  var publiclyAccessible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of security group IDs to associate with the workgroup.
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined
  
  /**
    * An array of VPC subnet IDs to associate with the workgroup.
    */
  var subnetIds: js.UndefOr[SubnetIdList] = js.undefined
  
  /**
    * The name of the workgroup to update. You can't update the name of a workgroup once it is created.
    */
  var workgroupName: WorkgroupName
}
object UpdateWorkgroupRequest {
  
  inline def apply(workgroupName: WorkgroupName): UpdateWorkgroupRequest = {
    val __obj = js.Dynamic.literal(workgroupName = workgroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkgroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorkgroupRequest] (val x: Self) extends AnyVal {
    
    inline def setBaseCapacity(value: Integer): Self = StObject.set(x, "baseCapacity", value.asInstanceOf[js.Any])
    
    inline def setBaseCapacityUndefined: Self = StObject.set(x, "baseCapacity", js.undefined)
    
    inline def setConfigParameters(value: ConfigParameterList): Self = StObject.set(x, "configParameters", value.asInstanceOf[js.Any])
    
    inline def setConfigParametersUndefined: Self = StObject.set(x, "configParameters", js.undefined)
    
    inline def setConfigParametersVarargs(value: ConfigParameter*): Self = StObject.set(x, "configParameters", js.Array(value*))
    
    inline def setEnhancedVpcRouting(value: Boolean): Self = StObject.set(x, "enhancedVpcRouting", value.asInstanceOf[js.Any])
    
    inline def setEnhancedVpcRoutingUndefined: Self = StObject.set(x, "enhancedVpcRouting", js.undefined)
    
    inline def setPort(value: Integer): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setWorkgroupName(value: WorkgroupName): Self = StObject.set(x, "workgroupName", value.asInstanceOf[js.Any])
  }
}
