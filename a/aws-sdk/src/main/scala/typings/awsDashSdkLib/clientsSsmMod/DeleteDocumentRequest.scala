package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDocumentRequest extends js.Object {
  /**
    * (Optional) The version of the document that you want to delete. If not provided, all versions of the document are deleted.
    */
  var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
  /**
    * The name of the document.
    */
  var Name: DocumentName
  /**
    * (Optional) The version name of the document that you want to delete. If not provided, all versions of the document are deleted.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
}

object DeleteDocumentRequest {
  @scala.inline
  def apply(
    Name: DocumentName,
    DocumentVersion: DocumentVersion = null,
    VersionName: DocumentVersionName = null
  ): DeleteDocumentRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (VersionName != null) __obj.updateDynamic("VersionName")(VersionName)
    __obj.asInstanceOf[DeleteDocumentRequest]
  }
}

