package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutCoreNetworkPolicyRequest extends StObject {
  
  /**
    * The client token associated with the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ClientToken] = js.undefined
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkId
  
  /**
    * a core network policy description.
    */
  var Description: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ID of a core network policy. 
    */
  var LatestVersionId: js.UndefOr[Integer] = js.undefined
  
  /**
    * The policy document.
    */
  var PolicyDocument: CoreNetworkPolicyDocument
}
object PutCoreNetworkPolicyRequest {
  
  inline def apply(CoreNetworkId: CoreNetworkId, PolicyDocument: CoreNetworkPolicyDocument): PutCoreNetworkPolicyRequest = {
    val __obj = js.Dynamic.literal(CoreNetworkId = CoreNetworkId.asInstanceOf[js.Any], PolicyDocument = PolicyDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutCoreNetworkPolicyRequest]
  }
  
  extension [Self <: PutCoreNetworkPolicyRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ConstrainedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLatestVersionId(value: Integer): Self = StObject.set(x, "LatestVersionId", value.asInstanceOf[js.Any])
    
    inline def setLatestVersionIdUndefined: Self = StObject.set(x, "LatestVersionId", js.undefined)
    
    inline def setPolicyDocument(value: CoreNetworkPolicyDocument): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
  }
}
