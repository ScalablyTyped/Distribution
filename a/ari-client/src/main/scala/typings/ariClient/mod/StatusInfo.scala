package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusInfo extends js.Object {
  var last_reload_time: Date
  /* Properties */
  var startup_time: Date
}

object StatusInfo {
  @scala.inline
  def apply(last_reload_time: Date, startup_time: Date): StatusInfo = {
    val __obj = js.Dynamic.literal(last_reload_time = last_reload_time.asInstanceOf[js.Any], startup_time = startup_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusInfo]
  }
}

