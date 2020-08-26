package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveDocument extends js.Object {
  val ActiveDocument: Boolean = js.native
  var Cancel: Boolean = js.native
}

object ActiveDocument {
  @scala.inline
  def apply(ActiveDocument: Boolean, Cancel: Boolean): ActiveDocument = {
    val __obj = js.Dynamic.literal(ActiveDocument = ActiveDocument.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveDocument]
  }
  @scala.inline
  implicit class ActiveDocumentOps[Self <: ActiveDocument] (val x: Self) extends AnyVal {
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
    def setActiveDocument(value: Boolean): Self = this.set("ActiveDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
  }
  
}

