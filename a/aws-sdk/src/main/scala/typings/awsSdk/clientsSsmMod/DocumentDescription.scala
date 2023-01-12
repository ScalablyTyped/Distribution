package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentDescription extends StObject {
  
  /**
    * The version of the document currently approved for use in the organization.
    */
  var ApprovedVersion: js.UndefOr[DocumentVersion] = js.undefined
  
  /**
    * Details about the document attachments, including names, locations, sizes, and so on.
    */
  var AttachmentsInformation: js.UndefOr[AttachmentInformationList] = js.undefined
  
  /**
    * The user in your organization who created the document.
    */
  var Author: js.UndefOr[DocumentAuthor] = js.undefined
  
  /**
    * The classification of a document to help you identify and categorize its use.
    */
  var Category: js.UndefOr[CategoryList] = js.undefined
  
  /**
    * The value that identifies a document's category.
    */
  var CategoryEnum: js.UndefOr[CategoryEnumList] = js.undefined
  
  /**
    * The date when the document was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The default version.
    */
  var DefaultVersion: js.UndefOr[DocumentVersion] = js.undefined
  
  /**
    * A description of the document. 
    */
  var Description: js.UndefOr[DescriptionInDocument] = js.undefined
  
  /**
    * The friendly name of the SSM document. This value can differ for each version of the document. If you want to update this value, see UpdateDocument.
    */
  var DisplayName: js.UndefOr[DocumentDisplayName] = js.undefined
  
  /**
    * The document format, either JSON or YAML.
    */
  var DocumentFormat: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentFormat] = js.undefined
  
  /**
    * The type of document.
    */
  var DocumentType: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentType] = js.undefined
  
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentVersion] = js.undefined
  
  /**
    * The Sha256 or Sha1 hash created by the system when the document was created.   Sha1 hashes have been deprecated. 
    */
  var Hash: js.UndefOr[DocumentHash] = js.undefined
  
  /**
    * The hash type of the document. Valid values include Sha256 or Sha1.  Sha1 hashes have been deprecated. 
    */
  var HashType: js.UndefOr[DocumentHashType] = js.undefined
  
  /**
    * The latest version of the document.
    */
  var LatestVersion: js.UndefOr[DocumentVersion] = js.undefined
  
  /**
    * The name of the SSM document.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
  
  /**
    * The Amazon Web Services user account that created the document.
    */
  var Owner: js.UndefOr[DocumentOwner] = js.undefined
  
  /**
    * A description of the parameters for a document.
    */
  var Parameters: js.UndefOr[DocumentParameterList] = js.undefined
  
  /**
    * The version of the document that is currently under review.
    */
  var PendingReviewVersion: js.UndefOr[DocumentVersion] = js.undefined
  
  /**
    * The list of operating system (OS) platforms compatible with this SSM document. 
    */
  var PlatformTypes: js.UndefOr[PlatformTypeList] = js.undefined
  
  /**
    * A list of SSM documents required by a document. For example, an ApplicationConfiguration document requires an ApplicationConfigurationSchema document.
    */
  var Requires: js.UndefOr[DocumentRequiresList] = js.undefined
  
  /**
    * Details about the review of a document.
    */
  var ReviewInformation: js.UndefOr[ReviewInformationList] = js.undefined
  
  /**
    * The current status of the review.
    */
  var ReviewStatus: js.UndefOr[typings.awsSdk.clientsSsmMod.ReviewStatus] = js.undefined
  
  /**
    * The schema version.
    */
  var SchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.undefined
  
  /**
    * The SHA1 hash of the document, which you can use for verification.
    */
  var Sha1: js.UndefOr[DocumentSha1] = js.undefined
  
  /**
    * The status of the SSM document.
    */
  var Status: js.UndefOr[DocumentStatus] = js.undefined
  
  /**
    * A message returned by Amazon Web Services Systems Manager that explains the Status value. For example, a Failed status might be explained by the StatusInformation message, "The specified S3 bucket doesn't exist. Verify that the URL of the S3 bucket is correct."
    */
  var StatusInformation: js.UndefOr[DocumentStatusInformation] = js.undefined
  
  /**
    * The tags, or metadata, that have been applied to the document.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see Amazon Web Services resource and property types reference in the CloudFormation User Guide. 
    */
  var TargetType: js.UndefOr[typings.awsSdk.clientsSsmMod.TargetType] = js.undefined
  
  /**
    * The version of the artifact associated with the document.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
}
object DocumentDescription {
  
  inline def apply(): DocumentDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentDescription] (val x: Self) extends AnyVal {
    
    inline def setApprovedVersion(value: DocumentVersion): Self = StObject.set(x, "ApprovedVersion", value.asInstanceOf[js.Any])
    
    inline def setApprovedVersionUndefined: Self = StObject.set(x, "ApprovedVersion", js.undefined)
    
    inline def setAttachmentsInformation(value: AttachmentInformationList): Self = StObject.set(x, "AttachmentsInformation", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsInformationUndefined: Self = StObject.set(x, "AttachmentsInformation", js.undefined)
    
    inline def setAttachmentsInformationVarargs(value: AttachmentInformation*): Self = StObject.set(x, "AttachmentsInformation", js.Array(value*))
    
    inline def setAuthor(value: DocumentAuthor): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "Author", js.undefined)
    
    inline def setCategory(value: CategoryList): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryEnum(value: CategoryEnumList): Self = StObject.set(x, "CategoryEnum", value.asInstanceOf[js.Any])
    
    inline def setCategoryEnumUndefined: Self = StObject.set(x, "CategoryEnum", js.undefined)
    
    inline def setCategoryEnumVarargs(value: Category*): Self = StObject.set(x, "CategoryEnum", js.Array(value*))
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setCategoryVarargs(value: Category*): Self = StObject.set(x, "Category", js.Array(value*))
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setDefaultVersion(value: DocumentVersion): Self = StObject.set(x, "DefaultVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionUndefined: Self = StObject.set(x, "DefaultVersion", js.undefined)
    
    inline def setDescription(value: DescriptionInDocument): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: DocumentDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setDocumentFormat(value: DocumentFormat): Self = StObject.set(x, "DocumentFormat", value.asInstanceOf[js.Any])
    
    inline def setDocumentFormatUndefined: Self = StObject.set(x, "DocumentFormat", js.undefined)
    
    inline def setDocumentType(value: DocumentType): Self = StObject.set(x, "DocumentType", value.asInstanceOf[js.Any])
    
    inline def setDocumentTypeUndefined: Self = StObject.set(x, "DocumentType", js.undefined)
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setHash(value: DocumentHash): Self = StObject.set(x, "Hash", value.asInstanceOf[js.Any])
    
    inline def setHashType(value: DocumentHashType): Self = StObject.set(x, "HashType", value.asInstanceOf[js.Any])
    
    inline def setHashTypeUndefined: Self = StObject.set(x, "HashType", js.undefined)
    
    inline def setHashUndefined: Self = StObject.set(x, "Hash", js.undefined)
    
    inline def setLatestVersion(value: DocumentVersion): Self = StObject.set(x, "LatestVersion", value.asInstanceOf[js.Any])
    
    inline def setLatestVersionUndefined: Self = StObject.set(x, "LatestVersion", js.undefined)
    
    inline def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwner(value: DocumentOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setParameters(value: DocumentParameterList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: DocumentParameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setPendingReviewVersion(value: DocumentVersion): Self = StObject.set(x, "PendingReviewVersion", value.asInstanceOf[js.Any])
    
    inline def setPendingReviewVersionUndefined: Self = StObject.set(x, "PendingReviewVersion", js.undefined)
    
    inline def setPlatformTypes(value: PlatformTypeList): Self = StObject.set(x, "PlatformTypes", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypesUndefined: Self = StObject.set(x, "PlatformTypes", js.undefined)
    
    inline def setPlatformTypesVarargs(value: PlatformType*): Self = StObject.set(x, "PlatformTypes", js.Array(value*))
    
    inline def setRequires(value: DocumentRequiresList): Self = StObject.set(x, "Requires", value.asInstanceOf[js.Any])
    
    inline def setRequiresUndefined: Self = StObject.set(x, "Requires", js.undefined)
    
    inline def setRequiresVarargs(value: DocumentRequires*): Self = StObject.set(x, "Requires", js.Array(value*))
    
    inline def setReviewInformation(value: ReviewInformationList): Self = StObject.set(x, "ReviewInformation", value.asInstanceOf[js.Any])
    
    inline def setReviewInformationUndefined: Self = StObject.set(x, "ReviewInformation", js.undefined)
    
    inline def setReviewInformationVarargs(value: ReviewInformation*): Self = StObject.set(x, "ReviewInformation", js.Array(value*))
    
    inline def setReviewStatus(value: ReviewStatus): Self = StObject.set(x, "ReviewStatus", value.asInstanceOf[js.Any])
    
    inline def setReviewStatusUndefined: Self = StObject.set(x, "ReviewStatus", js.undefined)
    
    inline def setSchemaVersion(value: DocumentSchemaVersion): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionUndefined: Self = StObject.set(x, "SchemaVersion", js.undefined)
    
    inline def setSha1(value: DocumentSha1): Self = StObject.set(x, "Sha1", value.asInstanceOf[js.Any])
    
    inline def setSha1Undefined: Self = StObject.set(x, "Sha1", js.undefined)
    
    inline def setStatus(value: DocumentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusInformation(value: DocumentStatusInformation): Self = StObject.set(x, "StatusInformation", value.asInstanceOf[js.Any])
    
    inline def setStatusInformationUndefined: Self = StObject.set(x, "StatusInformation", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetType(value: TargetType): Self = StObject.set(x, "TargetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "TargetType", js.undefined)
    
    inline def setVersionName(value: DocumentVersionName): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "VersionName", js.undefined)
  }
}
