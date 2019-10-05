package typings.activexDashWord

import typings.activexDashWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocHandled extends js.Object {
  val Doc: Document
  val Handled: Boolean
}

object Anon_DocHandled {
  @scala.inline
  def apply(Doc: Document, Handled: Boolean): Anon_DocHandled = {
    val __obj = js.Dynamic.literal(Doc = Doc, Handled = Handled)
  
    __obj.asInstanceOf[Anon_DocHandled]
  }
}

