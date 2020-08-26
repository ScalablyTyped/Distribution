package typings.avoscloudSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaitOption extends js.Object {
  /**
    * Set to true to wait for the server to confirm success
    * before triggering an event.
    */
  @JSName("wait")
  var wait_FWaitOption: js.UndefOr[Boolean] = js.native
}

object WaitOption {
  @scala.inline
  def apply(): WaitOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitOption]
  }
  @scala.inline
  implicit class WaitOptionOps[Self <: WaitOption] (val x: Self) extends AnyVal {
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
    def setWait(value: Boolean): Self = this.set("wait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
  
}

