package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDocumentStatusResponseError extends StObject {
  
  /**
    * The identifier of the document whose status could not be retrieved.
    */
  var DocumentId: js.UndefOr[typings.awsSdk.clientsKendraMod.DocumentId] = js.undefined
  
  /**
    * Indicates the source of the error.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.clientsKendraMod.ErrorCode] = js.undefined
  
  /**
    * States that the API could not get the status of a document. This could be because the request is not valid or there is a system error.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.clientsKendraMod.ErrorMessage] = js.undefined
}
object BatchGetDocumentStatusResponseError {
  
  inline def apply(): BatchGetDocumentStatusResponseError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDocumentStatusResponseError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetDocumentStatusResponseError] (val x: Self) extends AnyVal {
    
    inline def setDocumentId(value: DocumentId): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "DocumentId", js.undefined)
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
  }
}
