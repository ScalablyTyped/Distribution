package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDocumentStatusResponse extends StObject {
  
  /**
    * The status of documents. The status indicates if the document is waiting to be indexed, is in the process of indexing, has completed indexing, or failed indexing. If a document failed indexing, the status provides the reason why.
    */
  var DocumentStatusList: js.UndefOr[typings.awsSdk.clientsKendraMod.DocumentStatusList] = js.undefined
  
  /**
    * A list of documents that Amazon Kendra couldn't get the status for. The list includes the ID of the document and the reason that the status couldn't be found.
    */
  var Errors: js.UndefOr[BatchGetDocumentStatusResponseErrors] = js.undefined
}
object BatchGetDocumentStatusResponse {
  
  inline def apply(): BatchGetDocumentStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDocumentStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetDocumentStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setDocumentStatusList(value: DocumentStatusList): Self = StObject.set(x, "DocumentStatusList", value.asInstanceOf[js.Any])
    
    inline def setDocumentStatusListUndefined: Self = StObject.set(x, "DocumentStatusList", js.undefined)
    
    inline def setDocumentStatusListVarargs(value: Status*): Self = StObject.set(x, "DocumentStatusList", js.Array(value*))
    
    inline def setErrors(value: BatchGetDocumentStatusResponseErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: BatchGetDocumentStatusResponseError*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
