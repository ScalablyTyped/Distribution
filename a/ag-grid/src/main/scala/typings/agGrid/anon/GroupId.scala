package typings.agGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupId extends js.Object {
  var groupId: String = js.native
  var open: Boolean = js.native
}

object GroupId {
  @scala.inline
  def apply(groupId: String, open: Boolean): GroupId = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupId]
  }
  @scala.inline
  implicit class GroupIdOps[Self <: GroupId] (val x: Self) extends AnyVal {
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
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
  }
  
}

