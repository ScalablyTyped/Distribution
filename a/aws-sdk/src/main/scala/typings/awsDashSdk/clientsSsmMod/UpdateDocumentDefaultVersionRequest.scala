package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDocumentDefaultVersionRequest extends js.Object {
  /**
    * The version of a custom document that you want to set as the default version.
    */
  var DocumentVersion: DocumentVersionNumber = js.native
  /**
    * The name of a custom document that you want to set as the default version.
    */
  var Name: DocumentName = js.native
}

object UpdateDocumentDefaultVersionRequest {
  @scala.inline
  def apply(DocumentVersion: DocumentVersionNumber, Name: DocumentName): UpdateDocumentDefaultVersionRequest = {
    val __obj = js.Dynamic.literal(DocumentVersion = DocumentVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateDocumentDefaultVersionRequest]
  }
}

