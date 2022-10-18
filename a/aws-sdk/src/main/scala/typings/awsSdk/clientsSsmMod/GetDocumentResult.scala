package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDocumentResult extends StObject {
  
  /**
    * A description of the document attachments, including names, locations, sizes, and so on.
    */
  var AttachmentsContent: js.UndefOr[AttachmentContentList] = js.undefined
  
  /**
    * The contents of the SSM document.
    */
  var Content: js.UndefOr[DocumentContent] = js.undefined
  
  /**
    * The date the SSM document was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The friendly name of the SSM document. This value can differ for each version of the document. If you want to update this value, see UpdateDocument.
    */
  var DisplayName: js.UndefOr[DocumentDisplayName] = js.undefined
  
  /**
    * The document format, either JSON or YAML.
    */
  var DocumentFormat: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentFormat] = js.undefined
  
  /**
    * The document type.
    */
  var DocumentType: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentType] = js.undefined
  
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentVersion] = js.undefined
  
  /**
    * The name of the SSM document.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
  
  /**
    * A list of SSM documents required by a document. For example, an ApplicationConfiguration document requires an ApplicationConfigurationSchema document.
    */
  var Requires: js.UndefOr[DocumentRequiresList] = js.undefined
  
  /**
    * The current review status of a new custom Systems Manager document (SSM document) created by a member of your organization, or of the latest version of an existing SSM document. Only one version of an SSM document can be in the APPROVED state at a time. When a new version is approved, the status of the previous version changes to REJECTED. Only one version of an SSM document can be in review, or PENDING, at a time.
    */
  var ReviewStatus: js.UndefOr[typings.awsSdk.clientsSsmMod.ReviewStatus] = js.undefined
  
  /**
    * The status of the SSM document, such as Creating, Active, Updating, Failed, and Deleting.
    */
  var Status: js.UndefOr[DocumentStatus] = js.undefined
  
  /**
    * A message returned by Amazon Web Services Systems Manager that explains the Status value. For example, a Failed status might be explained by the StatusInformation message, "The specified S3 bucket doesn't exist. Verify that the URL of the S3 bucket is correct."
    */
  var StatusInformation: js.UndefOr[DocumentStatusInformation] = js.undefined
  
  /**
    * The version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and can't be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
}
object GetDocumentResult {
  
  inline def apply(): GetDocumentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDocumentResult]
  }
  
  extension [Self <: GetDocumentResult](x: Self) {
    
    inline def setAttachmentsContent(value: AttachmentContentList): Self = StObject.set(x, "AttachmentsContent", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsContentUndefined: Self = StObject.set(x, "AttachmentsContent", js.undefined)
    
    inline def setAttachmentsContentVarargs(value: AttachmentContent*): Self = StObject.set(x, "AttachmentsContent", js.Array(value*))
    
    inline def setContent(value: DocumentContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setDisplayName(value: DocumentDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setDocumentFormat(value: DocumentFormat): Self = StObject.set(x, "DocumentFormat", value.asInstanceOf[js.Any])
    
    inline def setDocumentFormatUndefined: Self = StObject.set(x, "DocumentFormat", js.undefined)
    
    inline def setDocumentType(value: DocumentType): Self = StObject.set(x, "DocumentType", value.asInstanceOf[js.Any])
    
    inline def setDocumentTypeUndefined: Self = StObject.set(x, "DocumentType", js.undefined)
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRequires(value: DocumentRequiresList): Self = StObject.set(x, "Requires", value.asInstanceOf[js.Any])
    
    inline def setRequiresUndefined: Self = StObject.set(x, "Requires", js.undefined)
    
    inline def setRequiresVarargs(value: DocumentRequires*): Self = StObject.set(x, "Requires", js.Array(value*))
    
    inline def setReviewStatus(value: ReviewStatus): Self = StObject.set(x, "ReviewStatus", value.asInstanceOf[js.Any])
    
    inline def setReviewStatusUndefined: Self = StObject.set(x, "ReviewStatus", js.undefined)
    
    inline def setStatus(value: DocumentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusInformation(value: DocumentStatusInformation): Self = StObject.set(x, "StatusInformation", value.asInstanceOf[js.Any])
    
    inline def setStatusInformationUndefined: Self = StObject.set(x, "StatusInformation", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVersionName(value: DocumentVersionName): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "VersionName", js.undefined)
  }
}
