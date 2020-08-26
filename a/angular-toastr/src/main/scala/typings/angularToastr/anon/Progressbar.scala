package typings.angularToastr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progressbar extends js.Object {
  var progressbar: js.UndefOr[String] = js.native
  var toast: js.UndefOr[String] = js.native
}

object Progressbar {
  @scala.inline
  def apply(): Progressbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Progressbar]
  }
  @scala.inline
  implicit class ProgressbarOps[Self <: Progressbar] (val x: Self) extends AnyVal {
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
    def setProgressbar(value: String): Self = this.set("progressbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressbar: Self = this.set("progressbar", js.undefined)
    @scala.inline
    def setToast(value: String): Self = this.set("toast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToast: Self = this.set("toast", js.undefined)
  }
  
}

