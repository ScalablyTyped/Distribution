package typings.activexWord.anon

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handled extends js.Object {
  val Doc: Document
  val Handled: Boolean
}

object Handled {
  @scala.inline
  def apply(Doc: Document, Handled: Boolean): Handled = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], Handled = Handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handled]
  }
}

