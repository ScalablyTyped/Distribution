package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConnector extends StObject {
  
  /**
    * The time when the VPC connector was created. It's in Unix time stamp format.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when the VPC connector was deleted. It's in Unix time stamp format.
    */
  var DeletedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of IDs of security groups that App Runner uses for access to Amazon Web Services resources under the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default security group allows all outbound traffic.
    */
  var SecurityGroups: js.UndefOr[StringList] = js.undefined
  
  /**
    * The current state of the VPC connector. If the status of a connector revision is INACTIVE, it was deleted and can't be used. Inactive connector revisions are permanently removed some time after they are deleted.
    */
  var Status: js.UndefOr[VpcConnectorStatus] = js.undefined
  
  /**
    * A list of IDs of subnets that App Runner uses for your service. All IDs are of subnets of a single Amazon VPC.
    */
  var Subnets: js.UndefOr[StringList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of this VPC connector.
    */
  var VpcConnectorArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
  
  /**
    * The customer-provided VPC connector name.
    */
  var VpcConnectorName: js.UndefOr[typings.awsSdk.apprunnerMod.VpcConnectorName] = js.undefined
  
  /**
    * The revision of this VPC connector. It's unique among all the active connectors ("Status": "ACTIVE") that share the same Name.  At this time, App Runner supports only one revision per name. 
    */
  var VpcConnectorRevision: js.UndefOr[Integer] = js.undefined
}
object VpcConnector {
  
  inline def apply(): VpcConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConnector]
  }
  
  extension [Self <: VpcConnector](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDeletedAt(value: js.Date): Self = StObject.set(x, "DeletedAt", value.asInstanceOf[js.Any])
    
    inline def setDeletedAtUndefined: Self = StObject.set(x, "DeletedAt", js.undefined)
    
    inline def setSecurityGroups(value: StringList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setStatus(value: VpcConnectorStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubnets(value: StringList): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: String*): Self = StObject.set(x, "Subnets", js.Array(value*))
    
    inline def setVpcConnectorArn(value: AppRunnerResourceArn): Self = StObject.set(x, "VpcConnectorArn", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectorArnUndefined: Self = StObject.set(x, "VpcConnectorArn", js.undefined)
    
    inline def setVpcConnectorName(value: VpcConnectorName): Self = StObject.set(x, "VpcConnectorName", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectorNameUndefined: Self = StObject.set(x, "VpcConnectorName", js.undefined)
    
    inline def setVpcConnectorRevision(value: Integer): Self = StObject.set(x, "VpcConnectorRevision", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectorRevisionUndefined: Self = StObject.set(x, "VpcConnectorRevision", js.undefined)
  }
}
