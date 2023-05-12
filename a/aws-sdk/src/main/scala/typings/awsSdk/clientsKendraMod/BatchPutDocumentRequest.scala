package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutDocumentRequest extends StObject {
  
  /**
    * Configuration information for altering your document metadata and content during the document ingestion process when you use the BatchPutDocument API. For more information on how to create, modify and delete document metadata, or make other content alterations when you ingest documents into Amazon Kendra, see Customizing document metadata during the ingestion process.
    */
  var CustomDocumentEnrichmentConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.CustomDocumentEnrichmentConfiguration] = js.undefined
  
  /**
    * One or more documents to add to the index. Documents have the following file size limits.   50 MB total size for any file   5 MB extracted text for any file   For more information, see Quotas.
    */
  var Documents: DocumentList
  
  /**
    * The identifier of the index to add the documents to. You need to create the index first using the CreateIndex API.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role with permission to access your S3 bucket. For more information, see IAM access roles for Amazon Kendra.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsKendraMod.RoleArn] = js.undefined
}
object BatchPutDocumentRequest {
  
  inline def apply(Documents: DocumentList, IndexId: IndexId): BatchPutDocumentRequest = {
    val __obj = js.Dynamic.literal(Documents = Documents.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutDocumentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchPutDocumentRequest] (val x: Self) extends AnyVal {
    
    inline def setCustomDocumentEnrichmentConfiguration(value: CustomDocumentEnrichmentConfiguration): Self = StObject.set(x, "CustomDocumentEnrichmentConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCustomDocumentEnrichmentConfigurationUndefined: Self = StObject.set(x, "CustomDocumentEnrichmentConfiguration", js.undefined)
    
    inline def setDocuments(value: DocumentList): Self = StObject.set(x, "Documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsVarargs(value: Document*): Self = StObject.set(x, "Documents", js.Array(value*))
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
