package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDocumentRequest extends js.Object {
  /**
    * A list of key and value pairs that describe attachments to a version of a document.
    */
  var Attachments: js.UndefOr[AttachmentsSourceList] = js.native
  /**
    * A valid JSON or YAML string.
    */
  var Content: DocumentContent = js.native
  /**
    * Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON is the default format.
    */
  var DocumentFormat: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentFormat] = js.native
  /**
    * (Required) The version of the document that you want to update. 
    */
  var DocumentVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentVersion] = js.native
  /**
    * The name of the document that you want to update.
    */
  var Name: DocumentName = js.native
  /**
    * Specify a new target type for the document.
    */
  var TargetType: js.UndefOr[typings.awsDashSdk.clientsSsmMod.TargetType] = js.native
  /**
    * An optional field specifying the version of the artifact you are updating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.native
}

object UpdateDocumentRequest {
  @scala.inline
  def apply(
    Content: DocumentContent,
    Name: DocumentName,
    Attachments: AttachmentsSourceList = null,
    DocumentFormat: DocumentFormat = null,
    DocumentVersion: DocumentVersion = null,
    TargetType: TargetType = null,
    VersionName: DocumentVersionName = null
  ): UpdateDocumentRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Attachments != null) __obj.updateDynamic("Attachments")(Attachments.asInstanceOf[js.Any])
    if (DocumentFormat != null) __obj.updateDynamic("DocumentFormat")(DocumentFormat.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion.asInstanceOf[js.Any])
    if (TargetType != null) __obj.updateDynamic("TargetType")(TargetType.asInstanceOf[js.Any])
    if (VersionName != null) __obj.updateDynamic("VersionName")(VersionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentRequest]
  }
}

