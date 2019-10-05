package typings.activexDashWord

import typings.activexDashWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelDoc extends js.Object {
  var Cancel: Boolean
  val Doc: Document
  val SaveAsUI: Boolean
}

object Anon_CancelDoc {
  @scala.inline
  def apply(Cancel: Boolean, Doc: Document, SaveAsUI: Boolean): Anon_CancelDoc = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Doc = Doc, SaveAsUI = SaveAsUI)
  
    __obj.asInstanceOf[Anon_CancelDoc]
  }
}

