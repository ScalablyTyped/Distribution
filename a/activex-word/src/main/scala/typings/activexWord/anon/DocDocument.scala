package typings.activexWord.anon

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocDocument extends js.Object {
  val Doc: Document
}

object DocDocument {
  @scala.inline
  def apply(Doc: Document): DocDocument = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocDocument]
  }
}

