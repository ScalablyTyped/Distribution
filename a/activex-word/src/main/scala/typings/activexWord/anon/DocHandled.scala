package typings.activexWord.anon

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocHandled extends js.Object {
  val Doc: Document
  var Handled: Boolean
}

object DocHandled {
  @scala.inline
  def apply(Doc: Document, Handled: Boolean): DocHandled = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], Handled = Handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocHandled]
  }
}

