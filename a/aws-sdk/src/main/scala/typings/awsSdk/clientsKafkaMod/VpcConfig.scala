package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfig extends StObject {
  
  /**
    * 
    The IDs of the security groups associated with the cluster.
    
    */
  var SecurityGroupIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * 
    The IDs of the subnets associated with the cluster.
    
    */
  var SubnetIds: listOfString
}
object VpcConfig {
  
  inline def apply(SubnetIds: listOfString): VpcConfig = {
    val __obj = js.Dynamic.literal(SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfig]
  }
  
  extension [Self <: VpcConfig](x: Self) {
    
    inline def setSecurityGroupIds(value: listOfString): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: string*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: listOfString): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: string*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
