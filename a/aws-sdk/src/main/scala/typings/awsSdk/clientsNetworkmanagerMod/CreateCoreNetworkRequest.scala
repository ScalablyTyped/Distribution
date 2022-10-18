package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCoreNetworkRequest extends StObject {
  
  /**
    * The client token associated with a core network request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ClientToken] = js.undefined
  
  /**
    * The description of a core network.
    */
  var Description: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ID of the global network that a core network will be a part of. 
    */
  var GlobalNetworkId: typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The policy document for creating a core network.
    */
  var PolicyDocument: js.UndefOr[CoreNetworkPolicyDocument] = js.undefined
  
  /**
    * Key-value tags associated with a core network request.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateCoreNetworkRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId): CreateCoreNetworkRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCoreNetworkRequest]
  }
  
  extension [Self <: CreateCoreNetworkRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: ConstrainedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocument(value: CoreNetworkPolicyDocument): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocumentUndefined: Self = StObject.set(x, "PolicyDocument", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
