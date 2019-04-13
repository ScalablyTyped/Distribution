package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDocumentDefaultVersionRequest extends js.Object {
  /**
    * The version of a custom document that you want to set as the default version.
    */
  var DocumentVersion: DocumentVersionNumber
  /**
    * The name of a custom document that you want to set as the default version.
    */
  var Name: DocumentName
}

object UpdateDocumentDefaultVersionRequest {
  @scala.inline
  def apply(DocumentVersion: DocumentVersionNumber, Name: DocumentName): UpdateDocumentDefaultVersionRequest = {
    val __obj = js.Dynamic.literal(DocumentVersion = DocumentVersion, Name = Name)
  
    __obj.asInstanceOf[UpdateDocumentDefaultVersionRequest]
  }
}

