package typings.activexWord

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDoc extends js.Object {
  val Doc: Document
}

object AnonDoc {
  @scala.inline
  def apply(Doc: Document): AnonDoc = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDoc]
  }
}

