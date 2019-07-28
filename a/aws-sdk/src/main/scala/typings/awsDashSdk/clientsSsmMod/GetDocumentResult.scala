package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDocumentResult extends js.Object {
  /**
    * A description of the document attachments, including names, locations, sizes, etc.
    */
  var AttachmentsContent: js.UndefOr[AttachmentContentList] = js.undefined
  /**
    * The contents of the Systems Manager document.
    */
  var Content: js.UndefOr[DocumentContent] = js.undefined
  /**
    * The document format, either JSON or YAML.
    */
  var DocumentFormat: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentFormat] = js.undefined
  /**
    * The document type.
    */
  var DocumentType: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentType] = js.undefined
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentVersion] = js.undefined
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
  /**
    * The status of the Systems Manager document, such as Creating, Active, Updating, Failed, and Deleting.
    */
  var Status: js.UndefOr[DocumentStatus] = js.undefined
  /**
    * A message returned by AWS Systems Manager that explains the Status value. For example, a Failed status might be explained by the StatusInformation message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
    */
  var StatusInformation: js.UndefOr[DocumentStatusInformation] = js.undefined
  /**
    * The version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
}

object GetDocumentResult {
  @scala.inline
  def apply(
    AttachmentsContent: AttachmentContentList = null,
    Content: DocumentContent = null,
    DocumentFormat: DocumentFormat = null,
    DocumentType: DocumentType = null,
    DocumentVersion: DocumentVersion = null,
    Name: DocumentARN = null,
    Status: DocumentStatus = null,
    StatusInformation: DocumentStatusInformation = null,
    VersionName: DocumentVersionName = null
  ): GetDocumentResult = {
    val __obj = js.Dynamic.literal()
    if (AttachmentsContent != null) __obj.updateDynamic("AttachmentsContent")(AttachmentsContent)
    if (Content != null) __obj.updateDynamic("Content")(Content)
    if (DocumentFormat != null) __obj.updateDynamic("DocumentFormat")(DocumentFormat.asInstanceOf[js.Any])
    if (DocumentType != null) __obj.updateDynamic("DocumentType")(DocumentType.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusInformation != null) __obj.updateDynamic("StatusInformation")(StatusInformation)
    if (VersionName != null) __obj.updateDynamic("VersionName")(VersionName)
    __obj.asInstanceOf[GetDocumentResult]
  }
}

