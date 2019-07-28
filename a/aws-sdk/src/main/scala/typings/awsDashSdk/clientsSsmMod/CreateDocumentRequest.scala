package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDocumentRequest extends js.Object {
  /**
    * A list of key and value pairs that describe attachments to a version of a document.
    */
  var Attachments: js.UndefOr[AttachmentsSourceList] = js.undefined
  /**
    * A valid JSON or YAML string.
    */
  var Content: DocumentContent
  /**
    * Specify the document format for the request. The document format can be either JSON or YAML. JSON is the default format.
    */
  var DocumentFormat: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentFormat] = js.undefined
  /**
    * The type of document to create. Valid document types include: Command, Policy, Automation, Session, and Package.
    */
  var DocumentType: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentType] = js.undefined
  /**
    * A name for the Systems Manager document.  Do not use the following to begin the names of documents you create. They are reserved by AWS for use as document prefixes:    aws     amazon     amzn    
    */
  var Name: DocumentName
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag an SSM document to identify the types of targets or the environment where it will run. In this case, you could specify the following key name/value pairs:    Key=OS,Value=Windows     Key=Environment,Value=Production     To add tags to an existing SSM document, use the AddTagsToResource action. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * Specify a target type to define the kinds of resources the document can run on. For example, to run a document on EC2 instances, specify the following value: /AWS::EC2::Instance. If you specify a value of '/' the document can run on all types of resources. If you don't specify a value, the document can't run on any resources. For a list of valid resource types, see AWS Resource Types Reference in the AWS CloudFormation User Guide. 
    */
  var TargetType: js.UndefOr[typings.awsDashSdk.clientsSsmMod.TargetType] = js.undefined
  /**
    * An optional field specifying the version of the artifact you are creating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
}

object CreateDocumentRequest {
  @scala.inline
  def apply(
    Content: DocumentContent,
    Name: DocumentName,
    Attachments: AttachmentsSourceList = null,
    DocumentFormat: DocumentFormat = null,
    DocumentType: DocumentType = null,
    Tags: TagList = null,
    TargetType: TargetType = null,
    VersionName: DocumentVersionName = null
  ): CreateDocumentRequest = {
    val __obj = js.Dynamic.literal(Content = Content, Name = Name)
    if (Attachments != null) __obj.updateDynamic("Attachments")(Attachments)
    if (DocumentFormat != null) __obj.updateDynamic("DocumentFormat")(DocumentFormat.asInstanceOf[js.Any])
    if (DocumentType != null) __obj.updateDynamic("DocumentType")(DocumentType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TargetType != null) __obj.updateDynamic("TargetType")(TargetType)
    if (VersionName != null) __obj.updateDynamic("VersionName")(VersionName)
    __obj.asInstanceOf[CreateDocumentRequest]
  }
}

