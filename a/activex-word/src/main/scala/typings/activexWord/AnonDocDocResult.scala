package typings.activexWord

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocDocResult extends js.Object {
  val Doc: Document
  val DocResult: Document
}

object AnonDocDocResult {
  @scala.inline
  def apply(Doc: Document, DocResult: Document): AnonDocDocResult = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], DocResult = DocResult.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDocDocResult]
  }
}

