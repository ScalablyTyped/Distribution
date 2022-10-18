package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttachmentsResponse extends StObject {
  
  /**
    * Describes the list of attachments.
    */
  var Attachments: js.UndefOr[AttachmentList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object ListAttachmentsResponse {
  
  inline def apply(): ListAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttachmentsResponse]
  }
  
  extension [Self <: ListAttachmentsResponse](x: Self) {
    
    inline def setAttachments(value: AttachmentList): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "Attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "Attachments", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
