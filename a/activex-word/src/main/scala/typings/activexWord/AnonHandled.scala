package typings.activexWord

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandled extends js.Object {
  val Doc: Document
  val Handled: Boolean
}

object AnonHandled {
  @scala.inline
  def apply(Doc: Document, Handled: Boolean): AnonHandled = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], Handled = Handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandled]
  }
}

