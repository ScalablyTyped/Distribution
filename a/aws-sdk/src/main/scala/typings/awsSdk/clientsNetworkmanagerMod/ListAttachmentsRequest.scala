package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttachmentsRequest extends StObject {
  
  /**
    * The type of attachment.
    */
  var AttachmentType: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.AttachmentType] = js.undefined
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkId] = js.undefined
  
  /**
    * The Region where the edge is located.
    */
  var EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
  
  /**
    * The state of the attachment.
    */
  var State: js.UndefOr[AttachmentState] = js.undefined
}
object ListAttachmentsRequest {
  
  inline def apply(): ListAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttachmentsRequest]
  }
  
  extension [Self <: ListAttachmentsRequest](x: Self) {
    
    inline def setAttachmentType(value: AttachmentType): Self = StObject.set(x, "AttachmentType", value.asInstanceOf[js.Any])
    
    inline def setAttachmentTypeUndefined: Self = StObject.set(x, "AttachmentType", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkIdUndefined: Self = StObject.set(x, "CoreNetworkId", js.undefined)
    
    inline def setEdgeLocation(value: ExternalRegionCode): Self = StObject.set(x, "EdgeLocation", value.asInstanceOf[js.Any])
    
    inline def setEdgeLocationUndefined: Self = StObject.set(x, "EdgeLocation", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setState(value: AttachmentState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
