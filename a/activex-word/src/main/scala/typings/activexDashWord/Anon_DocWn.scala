package typings.activexDashWord

import typings.activexDashWord.Word.Document
import typings.activexDashWord.Word.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocWn extends js.Object {
  val Doc: Document
  val Wn: Window
}

object Anon_DocWn {
  @scala.inline
  def apply(Doc: Document, Wn: Window): Anon_DocWn = {
    val __obj = js.Dynamic.literal(Doc = Doc, Wn = Wn)
  
    __obj.asInstanceOf[Anon_DocWn]
  }
}

