package typings.activexWord.anon

import typings.activexWord.Word.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelSelection extends js.Object {
  val Sel: Selection = js.native
}

object SelSelection {
  @scala.inline
  def apply(Sel: Selection): SelSelection = {
    val __obj = js.Dynamic.literal(Sel = Sel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelSelection]
  }
  @scala.inline
  implicit class SelSelectionOps[Self <: SelSelection] (val x: Self) extends AnyVal {
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
    def setSel(value: Selection): Self = this.set("Sel", value.asInstanceOf[js.Any])
  }
  
}

