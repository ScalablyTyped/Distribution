package typings.activedirectory2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindResult extends js.Object {
  var groups: js.Array[js.Object] = js.native
  var other: js.Array[js.Object] = js.native
  var users: js.Array[js.Object] = js.native
}

object FindResult {
  @scala.inline
  def apply(groups: js.Array[js.Object], other: js.Array[js.Object], users: js.Array[js.Object]): FindResult = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindResult]
  }
  @scala.inline
  implicit class FindResultOps[Self <: FindResult] (val x: Self) extends AnyVal {
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
    def setGroupsVarargs(value: js.Object*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[js.Object]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setOtherVarargs(value: js.Object*): Self = this.set("other", js.Array(value :_*))
    @scala.inline
    def setOther(value: js.Array[js.Object]): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsersVarargs(value: js.Object*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[js.Object]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
  
}

