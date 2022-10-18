package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDocumentStatusRequest extends StObject {
  
  /**
    * A list of DocumentInfo objects that identify the documents for which to get the status. You identify the documents by their document ID and optional attributes.
    */
  var DocumentInfoList: typings.awsSdk.clientsKendraMod.DocumentInfoList
  
  /**
    * The identifier of the index to add documents to. The index ID is returned by the CreateIndex  API.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
}
object BatchGetDocumentStatusRequest {
  
  inline def apply(DocumentInfoList: DocumentInfoList, IndexId: IndexId): BatchGetDocumentStatusRequest = {
    val __obj = js.Dynamic.literal(DocumentInfoList = DocumentInfoList.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDocumentStatusRequest]
  }
  
  extension [Self <: BatchGetDocumentStatusRequest](x: Self) {
    
    inline def setDocumentInfoList(value: DocumentInfoList): Self = StObject.set(x, "DocumentInfoList", value.asInstanceOf[js.Any])
    
    inline def setDocumentInfoListVarargs(value: DocumentInfo*): Self = StObject.set(x, "DocumentInfoList", js.Array(value*))
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
