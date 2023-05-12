package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSettings extends StObject {
  
  /**
    * The ID of one or more subnets in which License Manager will create a VPC endpoint for products that require connectivity to activation servers.
    */
  var AddSubnets: Subnets
  
  /**
    * The ID of one or more subnets to remove.
    */
  var RemoveSubnets: Subnets
  
  /**
    * A security group ID that allows inbound TCP port 1688 communication between resources in your VPC and the VPC endpoints for activation servers.
    */
  var SecurityGroupId: js.UndefOr[SecurityGroup] = js.undefined
}
object UpdateSettings {
  
  inline def apply(AddSubnets: Subnets, RemoveSubnets: Subnets): UpdateSettings = {
    val __obj = js.Dynamic.literal(AddSubnets = AddSubnets.asInstanceOf[js.Any], RemoveSubnets = RemoveSubnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSettings] (val x: Self) extends AnyVal {
    
    inline def setAddSubnets(value: Subnets): Self = StObject.set(x, "AddSubnets", value.asInstanceOf[js.Any])
    
    inline def setAddSubnetsVarargs(value: Subnet*): Self = StObject.set(x, "AddSubnets", js.Array(value*))
    
    inline def setRemoveSubnets(value: Subnets): Self = StObject.set(x, "RemoveSubnets", value.asInstanceOf[js.Any])
    
    inline def setRemoveSubnetsVarargs(value: Subnet*): Self = StObject.set(x, "RemoveSubnets", js.Array(value*))
    
    inline def setSecurityGroupId(value: SecurityGroup): Self = StObject.set(x, "SecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdUndefined: Self = StObject.set(x, "SecurityGroupId", js.undefined)
  }
}
