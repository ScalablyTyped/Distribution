package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDocumentRequest extends StObject {
  
  /**
    * A list of key-value pairs that describe attachments to a version of a document.
    */
  var Attachments: js.UndefOr[AttachmentsSourceList] = js.undefined
  
  /**
    * The content for the new SSM document in JSON or YAML format. The content of the document must not exceed 64KB. This quota also includes the content specified for input parameters at runtime. We recommend storing the contents for your new document in an external JSON or YAML file and referencing the file in a command. For examples, see the following topics in the Amazon Web Services Systems Manager User Guide.    Create an SSM document (Amazon Web Services API)     Create an SSM document (Amazon Web Services CLI)     Create an SSM document (API)   
    */
  var Content: DocumentContent
  
  /**
    * An optional field where you can specify a friendly name for the SSM document. This value can differ for each version of the document. You can update this value at a later time using the UpdateDocument operation.
    */
  var DisplayName: js.UndefOr[DocumentDisplayName] = js.undefined
  
  /**
    * Specify the document format for the request. The document format can be JSON, YAML, or TEXT. JSON is the default format.
    */
  var DocumentFormat: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentFormat] = js.undefined
  
  /**
    * The type of document to create.  The DeploymentStrategy document type is an internal-use-only document type reserved for AppConfig. 
    */
  var DocumentType: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentType] = js.undefined
  
  /**
    * A name for the SSM document.  You can't use the following strings as document name prefixes. These are reserved by Amazon Web Services for use as document name prefixes:    aws     amazon     amzn    
    */
  var Name: DocumentName
  
  /**
    * A list of SSM documents required by a document. This parameter is used exclusively by AppConfig. When a user creates an AppConfig configuration in an SSM document, the user must also specify a required document for validation purposes. In this case, an ApplicationConfiguration document requires an ApplicationConfigurationSchema document for validation purposes. For more information, see What is AppConfig? in the AppConfig User Guide.
    */
  var Requires: js.UndefOr[DocumentRequiresList] = js.undefined
  
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag an SSM document to identify the types of targets or the environment where it will run. In this case, you could specify the following key-value pairs:    Key=OS,Value=Windows     Key=Environment,Value=Production     To add tags to an existing SSM document, use the AddTagsToResource operation. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Specify a target type to define the kinds of resources the document can run on. For example, to run a document on EC2 instances, specify the following value: /AWS::EC2::Instance. If you specify a value of '/' the document can run on all types of resources. If you don't specify a value, the document can't run on any resources. For a list of valid resource types, see Amazon Web Services resource and property types reference in the CloudFormation User Guide. 
    */
  var TargetType: js.UndefOr[typings.awsSdk.clientsSsmMod.TargetType] = js.undefined
  
  /**
    * An optional field specifying the version of the artifact you are creating with the document. For example, Release12.1. This value is unique across all versions of a document, and can't be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
}
object CreateDocumentRequest {
  
  inline def apply(Content: DocumentContent, Name: DocumentName): CreateDocumentRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDocumentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDocumentRequest] (val x: Self) extends AnyVal {
    
    inline def setAttachments(value: AttachmentsSourceList): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "Attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: AttachmentsSource*): Self = StObject.set(x, "Attachments", js.Array(value*))
    
    inline def setContent(value: DocumentContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: DocumentDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setDocumentFormat(value: DocumentFormat): Self = StObject.set(x, "DocumentFormat", value.asInstanceOf[js.Any])
    
    inline def setDocumentFormatUndefined: Self = StObject.set(x, "DocumentFormat", js.undefined)
    
    inline def setDocumentType(value: DocumentType): Self = StObject.set(x, "DocumentType", value.asInstanceOf[js.Any])
    
    inline def setDocumentTypeUndefined: Self = StObject.set(x, "DocumentType", js.undefined)
    
    inline def setName(value: DocumentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRequires(value: DocumentRequiresList): Self = StObject.set(x, "Requires", value.asInstanceOf[js.Any])
    
    inline def setRequiresUndefined: Self = StObject.set(x, "Requires", js.undefined)
    
    inline def setRequiresVarargs(value: DocumentRequires*): Self = StObject.set(x, "Requires", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetType(value: TargetType): Self = StObject.set(x, "TargetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "TargetType", js.undefined)
    
    inline def setVersionName(value: DocumentVersionName): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "VersionName", js.undefined)
  }
}
