package typings.activexWord.anon

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocResult extends js.Object {
  val Doc: Document = js.native
  val DocResult: Document = js.native
}

object DocResult {
  @scala.inline
  def apply(Doc: Document, DocResult: Document): DocResult = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], DocResult = DocResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocResult]
  }
  @scala.inline
  implicit class DocResultOps[Self <: DocResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDoc(value: Document): Self = this.set("Doc", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocResult(value: Document): Self = this.set("DocResult", value.asInstanceOf[js.Any])
  }
  
}

