package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfiguration extends StObject {
  
  /**
    * An array of strings containing the list of security groups.
    */
  var SecurityGroupIdList: typings.awsSdk.clientsLookoutmetricsMod.SecurityGroupIdList
  
  /**
    * An array of strings containing the Amazon VPC subnet IDs (e.g., subnet-0bb1c79de3EXAMPLE.
    */
  var SubnetIdList: typings.awsSdk.clientsLookoutmetricsMod.SubnetIdList
}
object VpcConfiguration {
  
  inline def apply(SecurityGroupIdList: SecurityGroupIdList, SubnetIdList: SubnetIdList): VpcConfiguration = {
    val __obj = js.Dynamic.literal(SecurityGroupIdList = SecurityGroupIdList.asInstanceOf[js.Any], SubnetIdList = SubnetIdList.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfiguration]
  }
  
  extension [Self <: VpcConfiguration](x: Self) {
    
    inline def setSecurityGroupIdList(value: SecurityGroupIdList): Self = StObject.set(x, "SecurityGroupIdList", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdListVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIdList", js.Array(value*))
    
    inline def setSubnetIdList(value: SubnetIdList): Self = StObject.set(x, "SubnetIdList", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdListVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIdList", js.Array(value*))
  }
}
