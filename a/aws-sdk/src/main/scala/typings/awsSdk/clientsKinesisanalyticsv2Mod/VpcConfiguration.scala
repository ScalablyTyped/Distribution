package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfiguration extends StObject {
  
  /**
    * The array of SecurityGroup IDs used by the VPC configuration.
    */
  var SecurityGroupIds: typings.awsSdk.clientsKinesisanalyticsv2Mod.SecurityGroupIds
  
  /**
    * The array of Subnet IDs used by the VPC configuration.
    */
  var SubnetIds: typings.awsSdk.clientsKinesisanalyticsv2Mod.SubnetIds
}
object VpcConfiguration {
  
  inline def apply(SecurityGroupIds: SecurityGroupIds, SubnetIds: SubnetIds): VpcConfiguration = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfiguration]
  }
  
  extension [Self <: VpcConfiguration](x: Self) {
    
    inline def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
