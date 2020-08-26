package typings.activexMsforms.anon

import typings.activexMsforms.MSForms.ReturnBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelIndex extends js.Object {
  val Cancel: ReturnBoolean = js.native
  val Index: Double = js.native
}

object CancelIndex {
  @scala.inline
  def apply(Cancel: ReturnBoolean, Index: Double): CancelIndex = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelIndex]
  }
  @scala.inline
  implicit class CancelIndexOps[Self <: CancelIndex] (val x: Self) extends AnyVal {
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
    def setCancel(value: ReturnBoolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
  }
  
}

