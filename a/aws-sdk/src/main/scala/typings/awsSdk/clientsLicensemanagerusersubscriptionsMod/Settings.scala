package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  /**
    * A security group ID that allows inbound TCP port 1688 communication between resources in your VPC and the VPC endpoint for activation servers.
    */
  var SecurityGroupId: SecurityGroup
  
  /**
    * The subnets defined for the registered identity provider.
    */
  var Subnets: SettingsSubnetsList
}
object Settings {
  
  inline def apply(SecurityGroupId: SecurityGroup, Subnets: SettingsSubnetsList): Settings = {
    val __obj = js.Dynamic.literal(SecurityGroupId = SecurityGroupId.asInstanceOf[js.Any], Subnets = Subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    inline def setSecurityGroupId(value: SecurityGroup): Self = StObject.set(x, "SecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setSubnets(value: SettingsSubnetsList): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsVarargs(value: Subnet*): Self = StObject.set(x, "Subnets", js.Array(value*))
  }
}
