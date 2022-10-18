package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectPeersRequest extends StObject {
  
  /**
    * The ID of the attachment.
    */
  var ConnectAttachmentId: js.UndefOr[AttachmentId] = js.undefined
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkId] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object ListConnectPeersRequest {
  
  inline def apply(): ListConnectPeersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectPeersRequest]
  }
  
  extension [Self <: ListConnectPeersRequest](x: Self) {
    
    inline def setConnectAttachmentId(value: AttachmentId): Self = StObject.set(x, "ConnectAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setConnectAttachmentIdUndefined: Self = StObject.set(x, "ConnectAttachmentId", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkIdUndefined: Self = StObject.set(x, "CoreNetworkId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
