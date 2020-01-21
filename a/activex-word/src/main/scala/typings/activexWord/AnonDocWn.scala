package typings.activexWord

import typings.activexWord.Word.Document
import typings.activexWord.Word.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocWn extends js.Object {
  val Doc: Document
  val Wn: Window
}

object AnonDocWn {
  @scala.inline
  def apply(Doc: Document, Wn: Window): AnonDocWn = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], Wn = Wn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDocWn]
  }
}

