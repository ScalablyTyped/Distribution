package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushCallbacks extends js.Object {
  var admin: PushAdminCallbacks = js.native
}

object PushCallbacks {
  @scala.inline
  def apply(admin: PushAdminCallbacks): PushCallbacks = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushCallbacks]
  }
  @scala.inline
  implicit class PushCallbacksOps[Self <: PushCallbacks] (val x: Self) extends AnyVal {
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
    def setAdmin(value: PushAdminCallbacks): Self = this.set("admin", value.asInstanceOf[js.Any])
  }
  
}

