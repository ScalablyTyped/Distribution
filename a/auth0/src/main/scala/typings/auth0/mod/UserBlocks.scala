package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserBlocks extends js.Object {
  var blocked_for: js.Array[BlockedForEntry] = js.native
}

object UserBlocks {
  @scala.inline
  def apply(blocked_for: js.Array[BlockedForEntry]): UserBlocks = {
    val __obj = js.Dynamic.literal(blocked_for = blocked_for.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserBlocks]
  }
  @scala.inline
  implicit class UserBlocksOps[Self <: UserBlocks] (val x: Self) extends AnyVal {
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
    def setBlocked_forVarargs(value: BlockedForEntry*): Self = this.set("blocked_for", js.Array(value :_*))
    @scala.inline
    def setBlocked_for(value: js.Array[BlockedForEntry]): Self = this.set("blocked_for", value.asInstanceOf[js.Any])
  }
  
}

