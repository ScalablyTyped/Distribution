package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentIdentifier extends StObject {
  
  /**
    * The user in your organization who created the document.
    */
  var Author: js.UndefOr[DocumentAuthor] = js.undefined
  
  /**
    * The date the SSM document was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An optional field where you can specify a friendly name for the SSM document. This value can differ for each version of the document. If you want to update this value, see UpdateDocument.
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
    * The Amazon Web Services user account that created the document.
    */
  var Owner: js.UndefOr[DocumentOwner] = js.undefined
  
  /**
    * The operating system platform. 
    */
  var PlatformTypes: js.UndefOr[PlatformTypeList] = js.undefined
  
  /**
    * A list of SSM documents required by a document. For example, an ApplicationConfiguration document requires an ApplicationConfigurationSchema document.
    */
  var Requires: js.UndefOr[DocumentRequiresList] = js.undefined
  
  /**
    * The current status of a document review.
    */
  var ReviewStatus: js.UndefOr[typings.awsSdk.clientsSsmMod.ReviewStatus] = js.undefined
  
  /**
    * The schema version.
    */
  var SchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.undefined
  
  /**
    * The tags, or metadata, that have been applied to the document.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see Amazon Web Services resource and property types reference in the CloudFormation User Guide. 
    */
  var TargetType: js.UndefOr[typings.awsSdk.clientsSsmMod.TargetType] = js.undefined
  
  /**
    * An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and can't be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
}
object DocumentIdentifier {
  
  inline def apply(): DocumentIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentIdentifier]
  }
  
  extension [Self <: DocumentIdentifier](x: Self) {
    
    inline def setAuthor(value: DocumentAuthor): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "Author", js.undefined)
    
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
    
    inline def setOwner(value: DocumentOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setPlatformTypes(value: PlatformTypeList): Self = StObject.set(x, "PlatformTypes", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypesUndefined: Self = StObject.set(x, "PlatformTypes", js.undefined)
    
    inline def setPlatformTypesVarargs(value: PlatformType*): Self = StObject.set(x, "PlatformTypes", js.Array(value*))
    
    inline def setRequires(value: DocumentRequiresList): Self = StObject.set(x, "Requires", value.asInstanceOf[js.Any])
    
    inline def setRequiresUndefined: Self = StObject.set(x, "Requires", js.undefined)
    
    inline def setRequiresVarargs(value: DocumentRequires*): Self = StObject.set(x, "Requires", js.Array(value*))
    
    inline def setReviewStatus(value: ReviewStatus): Self = StObject.set(x, "ReviewStatus", value.asInstanceOf[js.Any])
    
    inline def setReviewStatusUndefined: Self = StObject.set(x, "ReviewStatus", js.undefined)
    
    inline def setSchemaVersion(value: DocumentSchemaVersion): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionUndefined: Self = StObject.set(x, "SchemaVersion", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetType(value: TargetType): Self = StObject.set(x, "TargetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "TargetType", js.undefined)
    
    inline def setVersionName(value: DocumentVersionName): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "VersionName", js.undefined)
  }
}
