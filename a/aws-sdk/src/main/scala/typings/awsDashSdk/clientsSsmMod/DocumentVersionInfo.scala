package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentVersionInfo extends js.Object {
  /**
    * The date the document was created.
    */
  var CreatedDate: js.UndefOr[DateTime] = js.native
  /**
    * The document format, either JSON or YAML.
    */
  var DocumentFormat: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentFormat] = js.native
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentVersion] = js.native
  /**
    * An identifier for the default version of the document.
    */
  var IsDefaultVersion: js.UndefOr[Boolean] = js.native
  /**
    * The document name.
    */
  var Name: js.UndefOr[DocumentName] = js.native
  /**
    * The status of the Systems Manager document, such as Creating, Active, Failed, and Deleting.
    */
  var Status: js.UndefOr[DocumentStatus] = js.native
  /**
    * A message returned by AWS Systems Manager that explains the Status value. For example, a Failed status might be explained by the StatusInformation message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
    */
  var StatusInformation: js.UndefOr[DocumentStatusInformation] = js.native
  /**
    * The version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.native
}

object DocumentVersionInfo {
  @scala.inline
  def apply(
    CreatedDate: DateTime = null,
    DocumentFormat: DocumentFormat = null,
    DocumentVersion: DocumentVersion = null,
    IsDefaultVersion: js.UndefOr[scala.Boolean] = js.undefined,
    Name: DocumentName = null,
    Status: DocumentStatus = null,
    StatusInformation: DocumentStatusInformation = null,
    VersionName: DocumentVersionName = null
  ): DocumentVersionInfo = {
    val __obj = js.Dynamic.literal()
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (DocumentFormat != null) __obj.updateDynamic("DocumentFormat")(DocumentFormat.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(IsDefaultVersion)) __obj.updateDynamic("IsDefaultVersion")(IsDefaultVersion.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusInformation != null) __obj.updateDynamic("StatusInformation")(StatusInformation.asInstanceOf[js.Any])
    if (VersionName != null) __obj.updateDynamic("VersionName")(VersionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentVersionInfo]
  }
}

