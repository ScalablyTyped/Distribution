package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreCoreNetworkPolicyVersionRequest extends StObject {
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkId
  
  /**
    * The ID of the policy version to restore.
    */
  var PolicyVersionId: Integer
}
object RestoreCoreNetworkPolicyVersionRequest {
  
  inline def apply(CoreNetworkId: CoreNetworkId, PolicyVersionId: Integer): RestoreCoreNetworkPolicyVersionRequest = {
    val __obj = js.Dynamic.literal(CoreNetworkId = CoreNetworkId.asInstanceOf[js.Any], PolicyVersionId = PolicyVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreCoreNetworkPolicyVersionRequest]
  }
  
  extension [Self <: RestoreCoreNetworkPolicyVersionRequest](x: Self) {
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionId(value: Integer): Self = StObject.set(x, "PolicyVersionId", value.asInstanceOf[js.Any])
  }
}
