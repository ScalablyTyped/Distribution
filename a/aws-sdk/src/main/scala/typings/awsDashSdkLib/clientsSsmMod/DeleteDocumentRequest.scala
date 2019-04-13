package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDocumentRequest extends js.Object {
  /**
    * The name of the document.
    */
  var Name: DocumentName
}

object DeleteDocumentRequest {
  @scala.inline
  def apply(Name: DocumentName): DeleteDocumentRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteDocumentRequest]
  }
}

