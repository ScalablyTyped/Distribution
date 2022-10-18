package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkAclEntryRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the rule is an egress rule.
    */
  var Egress: Boolean
  
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: typings.awsSdk.clientsEc2Mod.NetworkAclId
  
  /**
    * The rule number of the entry to delete.
    */
  var RuleNumber: Integer
}
object DeleteNetworkAclEntryRequest {
  
  inline def apply(Egress: Boolean, NetworkAclId: NetworkAclId, RuleNumber: Integer): DeleteNetworkAclEntryRequest = {
    val __obj = js.Dynamic.literal(Egress = Egress.asInstanceOf[js.Any], NetworkAclId = NetworkAclId.asInstanceOf[js.Any], RuleNumber = RuleNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkAclEntryRequest]
  }
  
  extension [Self <: DeleteNetworkAclEntryRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEgress(value: Boolean): Self = StObject.set(x, "Egress", value.asInstanceOf[js.Any])
    
    inline def setNetworkAclId(value: NetworkAclId): Self = StObject.set(x, "NetworkAclId", value.asInstanceOf[js.Any])
    
    inline def setRuleNumber(value: Integer): Self = StObject.set(x, "RuleNumber", value.asInstanceOf[js.Any])
  }
}
