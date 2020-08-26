package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusInfo extends js.Object {
  /**
    * Time when Asterisk was last reloaded.
    */
  var last_reload_time: Date = js.native
  /**
    * Time when Asterisk was started.
    */
  var startup_time: Date = js.native
}

object StatusInfo {
  @scala.inline
  def apply(last_reload_time: Date, startup_time: Date): StatusInfo = {
    val __obj = js.Dynamic.literal(last_reload_time = last_reload_time.asInstanceOf[js.Any], startup_time = startup_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusInfo]
  }
  @scala.inline
  implicit class StatusInfoOps[Self <: StatusInfo] (val x: Self) extends AnyVal {
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
    def setLast_reload_time(value: Date): Self = this.set("last_reload_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartup_time(value: Date): Self = this.set("startup_time", value.asInstanceOf[js.Any])
  }
  
}

