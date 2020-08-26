package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportUsersFromFileOptions
  extends BaseImportUsersOptions
     with ImportUsersOptions {
  var users: String = js.native
}

object ImportUsersFromFileOptions {
  @scala.inline
  def apply(connection_id: String, users: String): ImportUsersFromFileOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportUsersFromFileOptions]
  }
  @scala.inline
  implicit class ImportUsersFromFileOptionsOps[Self <: ImportUsersFromFileOptions] (val x: Self) extends AnyVal {
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
    def setUsers(value: String): Self = this.set("users", value.asInstanceOf[js.Any])
  }
  
}

