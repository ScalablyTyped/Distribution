package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttachedIndicesResponse extends StObject {
  
  /**
    * The indices attached to the specified object.
    */
  var IndexAttachments: js.UndefOr[IndexAttachmentList] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
}
object ListAttachedIndicesResponse {
  
  inline def apply(): ListAttachedIndicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttachedIndicesResponse]
  }
  
  extension [Self <: ListAttachedIndicesResponse](x: Self) {
    
    inline def setIndexAttachments(value: IndexAttachmentList): Self = StObject.set(x, "IndexAttachments", value.asInstanceOf[js.Any])
    
    inline def setIndexAttachmentsUndefined: Self = StObject.set(x, "IndexAttachments", js.undefined)
    
    inline def setIndexAttachmentsVarargs(value: IndexAttachment*): Self = StObject.set(x, "IndexAttachments", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
