package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfig extends StObject {
  
  /**
    * The identifier of the security group attached to the Lambda function.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.SecurityGroups] = js.undefined
  
  /**
    * The identifiers of the subnets that are associated with your Lambda function.
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.SubnetIds] = js.undefined
  
  /**
    * The identifier of the Amazon Virtual Private Cloud.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object VpcConfig {
  
  inline def apply(): VpcConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcConfig] (val x: Self) extends AnyVal {
    
    inline def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: SecurityGroup*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
