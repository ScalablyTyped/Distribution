package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICallOptions extends js.Object {
  var disclose_me: js.UndefOr[Boolean] = js.native
  var receive_progress: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object ICallOptions {
  @scala.inline
  def apply(): ICallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICallOptions]
  }
  @scala.inline
  implicit class ICallOptionsOps[Self <: ICallOptions] (val x: Self) extends AnyVal {
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
    def setDisclose_me(value: Boolean): Self = this.set("disclose_me", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisclose_me: Self = this.set("disclose_me", js.undefined)
    @scala.inline
    def setReceive_progress(value: Boolean): Self = this.set("receive_progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceive_progress: Self = this.set("receive_progress", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

