package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentMetadataResponseInfo extends StObject {
  
  /**
    * Details about a reviewer's response to a document review request.
    */
  var ReviewerResponse: js.UndefOr[DocumentReviewerResponseList] = js.undefined
}
object DocumentMetadataResponseInfo {
  
  inline def apply(): DocumentMetadataResponseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentMetadataResponseInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentMetadataResponseInfo] (val x: Self) extends AnyVal {
    
    inline def setReviewerResponse(value: DocumentReviewerResponseList): Self = StObject.set(x, "ReviewerResponse", value.asInstanceOf[js.Any])
    
    inline def setReviewerResponseUndefined: Self = StObject.set(x, "ReviewerResponse", js.undefined)
    
    inline def setReviewerResponseVarargs(value: DocumentReviewerResponseSource*): Self = StObject.set(x, "ReviewerResponse", js.Array(value*))
  }
}
