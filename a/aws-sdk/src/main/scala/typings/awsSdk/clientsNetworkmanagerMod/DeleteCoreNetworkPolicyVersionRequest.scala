package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCoreNetworkPolicyVersionRequest extends StObject {
  
  /**
    * The ID of a core network for the deleted policy.
    */
  var CoreNetworkId: typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkId
  
  /**
    * The version ID of the deleted policy.
    */
  var PolicyVersionId: Integer
}
object DeleteCoreNetworkPolicyVersionRequest {
  
  inline def apply(CoreNetworkId: CoreNetworkId, PolicyVersionId: Integer): DeleteCoreNetworkPolicyVersionRequest = {
    val __obj = js.Dynamic.literal(CoreNetworkId = CoreNetworkId.asInstanceOf[js.Any], PolicyVersionId = PolicyVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCoreNetworkPolicyVersionRequest]
  }
  
  extension [Self <: DeleteCoreNetworkPolicyVersionRequest](x: Self) {
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionId(value: Integer): Self = StObject.set(x, "PolicyVersionId", value.asInstanceOf[js.Any])
  }
}
