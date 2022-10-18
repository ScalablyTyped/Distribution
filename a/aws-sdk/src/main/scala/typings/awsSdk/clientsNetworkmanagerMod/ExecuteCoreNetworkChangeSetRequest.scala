package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteCoreNetworkChangeSetRequest extends StObject {
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkId
  
  /**
    * The ID of the policy version.
    */
  var PolicyVersionId: Integer
}
object ExecuteCoreNetworkChangeSetRequest {
  
  inline def apply(CoreNetworkId: CoreNetworkId, PolicyVersionId: Integer): ExecuteCoreNetworkChangeSetRequest = {
    val __obj = js.Dynamic.literal(CoreNetworkId = CoreNetworkId.asInstanceOf[js.Any], PolicyVersionId = PolicyVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteCoreNetworkChangeSetRequest]
  }
  
  extension [Self <: ExecuteCoreNetworkChangeSetRequest](x: Self) {
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionId(value: Integer): Self = StObject.set(x, "PolicyVersionId", value.asInstanceOf[js.Any])
  }
}
