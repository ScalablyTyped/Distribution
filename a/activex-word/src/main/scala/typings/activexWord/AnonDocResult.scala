package typings.activexWord

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocResult extends js.Object {
  val Doc: Document
  val DocResult: Document
}

object AnonDocResult {
  @scala.inline
  def apply(Doc: Document, DocResult: Document): AnonDocResult = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], DocResult = DocResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocResult]
  }
}

