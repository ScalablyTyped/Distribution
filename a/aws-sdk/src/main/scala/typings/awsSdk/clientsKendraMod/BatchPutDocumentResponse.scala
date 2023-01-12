package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutDocumentResponse extends StObject {
  
  /**
    * A list of documents that were not added to the index because the document failed a validation check. Each document contains an error message that indicates why the document couldn't be added to the index. If there was an error adding a document to an index the error is reported in your Amazon Web Services CloudWatch log. For more information, see Monitoring Amazon Kendra with Amazon CloudWatch Logs 
    */
  var FailedDocuments: js.UndefOr[BatchPutDocumentResponseFailedDocuments] = js.undefined
}
object BatchPutDocumentResponse {
  
  inline def apply(): BatchPutDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPutDocumentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchPutDocumentResponse] (val x: Self) extends AnyVal {
    
    inline def setFailedDocuments(value: BatchPutDocumentResponseFailedDocuments): Self = StObject.set(x, "FailedDocuments", value.asInstanceOf[js.Any])
    
    inline def setFailedDocumentsUndefined: Self = StObject.set(x, "FailedDocuments", js.undefined)
    
    inline def setFailedDocumentsVarargs(value: BatchPutDocumentResponseFailedDocument*): Self = StObject.set(x, "FailedDocuments", js.Array(value*))
  }
}
