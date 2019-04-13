package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDocumentRequest extends js.Object {
  /**
    * The document version for which you want information. Can be a specific version or the default version.
    */
  var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
  /**
    * The name of the Systems Manager document.
    */
  var Name: DocumentARN
  /**
    * An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
}

object DescribeDocumentRequest {
  @scala.inline
  def apply(
    Name: DocumentARN,
    DocumentVersion: DocumentVersion = null,
    VersionName: DocumentVersionName = null
  ): DescribeDocumentRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (VersionName != null) __obj.updateDynamic("VersionName")(VersionName)
    __obj.asInstanceOf[DescribeDocumentRequest]
  }
}

