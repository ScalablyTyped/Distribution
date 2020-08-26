package typings.angularPermission.mod.permission

import typings.angularPermission.anon.Except
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataWithPermissions extends js.Object {
  var permissions: js.UndefOr[Except] = js.native
}

object DataWithPermissions {
  @scala.inline
  def apply(): DataWithPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataWithPermissions]
  }
  @scala.inline
  implicit class DataWithPermissionsOps[Self <: DataWithPermissions] (val x: Self) extends AnyVal {
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
    def setPermissions(value: Except): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
  }
  
}

