package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveDocument extends js.Object {
  val ActiveDocument: Boolean
  var Cancel: Boolean
}

object ActiveDocument {
  @scala.inline
  def apply(ActiveDocument: Boolean, Cancel: Boolean): ActiveDocument = {
    val __obj = js.Dynamic.literal(ActiveDocument = ActiveDocument.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveDocument]
  }
}

