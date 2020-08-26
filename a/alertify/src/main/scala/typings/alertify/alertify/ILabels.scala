package typings.alertify.alertify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Labels for altertify.set function */
@js.native
trait ILabels extends js.Object {
  var cancel: js.UndefOr[String] = js.native
  var ok: js.UndefOr[String] = js.native
}

object ILabels {
  @scala.inline
  def apply(): ILabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILabels]
  }
  @scala.inline
  implicit class ILabelsOps[Self <: ILabels] (val x: Self) extends AnyVal {
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
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setOk(value: String): Self = this.set("ok", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOk: Self = this.set("ok", js.undefined)
  }
  
}

