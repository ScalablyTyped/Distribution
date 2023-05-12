package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcOptions extends StObject {
  
  /**
    * A list of security groups associated with the VPC endpoint.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsSdk.clientsOsisMod.SecurityGroupIds] = js.undefined
  
  /**
    * A list of subnet IDs associated with the VPC endpoint.
    */
  var SubnetIds: typings.awsSdk.clientsOsisMod.SubnetIds
}
object VpcOptions {
  
  inline def apply(SubnetIds: SubnetIds): VpcOptions = {
    val __obj = js.Dynamic.literal(SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcOptions] (val x: Self) extends AnyVal {
    
    inline def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
