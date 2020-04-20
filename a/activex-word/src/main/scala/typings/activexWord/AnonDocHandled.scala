package typings.activexWord

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocHandled extends js.Object {
  val Doc: Document
  var Handled: Boolean
}

object AnonDocHandled {
  @scala.inline
  def apply(Doc: Document, Handled: Boolean): AnonDocHandled = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], Handled = Handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocHandled]
  }
}

