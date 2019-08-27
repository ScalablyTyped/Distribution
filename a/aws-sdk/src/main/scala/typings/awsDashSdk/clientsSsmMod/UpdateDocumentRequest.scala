package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDocumentRequest extends js.Object {
  /**
    * A list of key and value pairs that describe attachments to a version of a document.
    */
  var Attachments: js.UndefOr[AttachmentsSourceList] = js.undefined
  /**
    * A valid JSON or YAML string.
    */
  var Content: DocumentContent
  /**
    * Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON is the default format.
    */
  var DocumentFormat: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentFormat] = js.undefined
  /**
    * (Required) The version of the document that you want to update. 
    */
  var DocumentVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentVersion] = js.undefined
  /**
    * The name of the document that you want to update.
    */
  var Name: DocumentName
  /**
    * Specify a new target type for the document.
    */
  var TargetType: js.UndefOr[typings.awsDashSdk.clientsSsmMod.TargetType] = js.undefined
  /**
    * An optional field specifying the version of the artifact you are updating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
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
    val __obj = js.Dynamic.literal(Content = Content, Name = Name)
    if (Attachments != null) __obj.updateDynamic("Attachments")(Attachments)
    if (DocumentFormat != null) __obj.updateDynamic("DocumentFormat")(DocumentFormat.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (TargetType != null) __obj.updateDynamic("TargetType")(TargetType)
    if (VersionName != null) __obj.updateDynamic("VersionName")(VersionName)
    __obj.asInstanceOf[UpdateDocumentRequest]
  }
}

