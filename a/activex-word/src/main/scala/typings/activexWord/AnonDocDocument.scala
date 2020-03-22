package typings.activexWord

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocDocument extends js.Object {
  val Doc: Document
}

object AnonDocDocument {
  @scala.inline
  def apply(Doc: Document): AnonDocDocument = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDocDocument]
  }
}

