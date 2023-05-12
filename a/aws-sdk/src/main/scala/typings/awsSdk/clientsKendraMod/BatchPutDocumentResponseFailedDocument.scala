package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutDocumentResponseFailedDocument extends StObject {
  
  /**
    * The type of error that caused the document to fail to be indexed.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.clientsKendraMod.ErrorCode] = js.undefined
  
  /**
    * A description of the reason why the document could not be indexed.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.clientsKendraMod.ErrorMessage] = js.undefined
  
  /**
    * The identifier of the document.
    */
  var Id: js.UndefOr[DocumentId] = js.undefined
}
object BatchPutDocumentResponseFailedDocument {
  
  inline def apply(): BatchPutDocumentResponseFailedDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPutDocumentResponseFailedDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchPutDocumentResponseFailedDocument] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setId(value: DocumentId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
