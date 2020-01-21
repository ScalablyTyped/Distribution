package typings.angularCore

import typings.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerDocument extends js.Object {
  var ownerDocument: Document_
}

object AnonOwnerDocument {
  @scala.inline
  def apply(ownerDocument: Document_): AnonOwnerDocument = {
    val __obj = js.Dynamic.literal(ownerDocument = ownerDocument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerDocument]
  }
}

