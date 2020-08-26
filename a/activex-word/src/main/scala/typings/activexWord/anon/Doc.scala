package typings.activexWord.anon

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Doc extends js.Object {
  var Cancel: Boolean = js.native
  val Doc: Document = js.native
  val SaveAsUI: Boolean = js.native
}

object Doc {
  @scala.inline
  def apply(Cancel: Boolean, Doc: Document, SaveAsUI: Boolean): Doc = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Doc = Doc.asInstanceOf[js.Any], SaveAsUI = SaveAsUI.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doc]
  }
  @scala.inline
  implicit class DocOps[Self <: Doc] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoc(value: Document): Self = this.set("Doc", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaveAsUI(value: Boolean): Self = this.set("SaveAsUI", value.asInstanceOf[js.Any])
  }
  
}

