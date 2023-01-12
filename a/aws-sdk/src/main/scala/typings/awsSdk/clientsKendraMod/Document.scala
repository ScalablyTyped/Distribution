package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  /**
    * The identifier of the access control configuration that you want to apply to the document.
    */
  var AccessControlConfigurationId: js.UndefOr[typings.awsSdk.clientsKendraMod.AccessControlConfigurationId] = js.undefined
  
  /**
    * Information on principals (users and/or groups) and which documents they should have access to. This is useful for user context filtering, where search results are filtered based on the user or their group access to documents.
    */
  var AccessControlList: js.UndefOr[PrincipalList] = js.undefined
  
  /**
    * Custom attributes to apply to the document. Use the custom attributes to provide additional information for searching, to provide facets for refining searches, and to provide additional information in the query response. For example, 'DataSourceId' and 'DataSourceSyncJobId' are custom attributes that provide information on the synchronization of documents running on a data source. Note, 'DataSourceSyncJobId' could be an optional custom attribute as Amazon Kendra will use the ID of a running sync job.
    */
  var Attributes: js.UndefOr[DocumentAttributeList] = js.undefined
  
  /**
    * The contents of the document.  Documents passed to the Blob parameter must be base64 encoded. Your code might not need to encode the document file bytes if you're using an Amazon Web Services SDK to call Amazon Kendra APIs. If you are calling the Amazon Kendra endpoint directly using REST, you must base64 encode the contents before sending.
    */
  var Blob: js.UndefOr[_Blob] = js.undefined
  
  /**
    * The file type of the document in the Blob field.
    */
  var ContentType: js.UndefOr[typings.awsSdk.clientsKendraMod.ContentType] = js.undefined
  
  /**
    * The list of principal lists that define the hierarchy for which documents users should have access to.
    */
  var HierarchicalAccessControlList: js.UndefOr[HierarchicalPrincipalList] = js.undefined
  
  /**
    * A unique identifier of the document in the index. Note, each document ID must be unique per index. You cannot create a data source to index your documents with their unique IDs and then use the BatchPutDocument API to index the same documents, or vice versa. You can delete a data source and then use the BatchPutDocument API to index the same documents, or vice versa.
    */
  var Id: DocumentId
  
  var S3Path: js.UndefOr[typings.awsSdk.clientsKendraMod.S3Path] = js.undefined
  
  /**
    * The title of the document.
    */
  var Title: js.UndefOr[typings.awsSdk.clientsKendraMod.Title] = js.undefined
}
object Document {
  
  inline def apply(Id: DocumentId): Document = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    inline def setAccessControlConfigurationId(value: AccessControlConfigurationId): Self = StObject.set(x, "AccessControlConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setAccessControlConfigurationIdUndefined: Self = StObject.set(x, "AccessControlConfigurationId", js.undefined)
    
    inline def setAccessControlList(value: PrincipalList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    inline def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
    
    inline def setAccessControlListVarargs(value: Principal*): Self = StObject.set(x, "AccessControlList", js.Array(value*))
    
    inline def setAttributes(value: DocumentAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: DocumentAttribute*): Self = StObject.set(x, "Attributes", js.Array(value*))
    
    inline def setBlob(value: _Blob): Self = StObject.set(x, "Blob", value.asInstanceOf[js.Any])
    
    inline def setBlobUndefined: Self = StObject.set(x, "Blob", js.undefined)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setHierarchicalAccessControlList(value: HierarchicalPrincipalList): Self = StObject.set(x, "HierarchicalAccessControlList", value.asInstanceOf[js.Any])
    
    inline def setHierarchicalAccessControlListUndefined: Self = StObject.set(x, "HierarchicalAccessControlList", js.undefined)
    
    inline def setHierarchicalAccessControlListVarargs(value: HierarchicalPrincipal*): Self = StObject.set(x, "HierarchicalAccessControlList", js.Array(value*))
    
    inline def setId(value: DocumentId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setS3Path(value: S3Path): Self = StObject.set(x, "S3Path", value.asInstanceOf[js.Any])
    
    inline def setS3PathUndefined: Self = StObject.set(x, "S3Path", js.undefined)
    
    inline def setTitle(value: Title): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
