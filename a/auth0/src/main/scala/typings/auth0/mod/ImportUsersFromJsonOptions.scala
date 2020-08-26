package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportUsersFromJsonOptions
  extends BaseImportUsersOptions
     with ImportUsersOptions {
  var users_json: String = js.native
}

object ImportUsersFromJsonOptions {
  @scala.inline
  def apply(connection_id: String, users_json: String): ImportUsersFromJsonOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any], users_json = users_json.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportUsersFromJsonOptions]
  }
  @scala.inline
  implicit class ImportUsersFromJsonOptionsOps[Self <: ImportUsersFromJsonOptions] (val x: Self) extends AnyVal {
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
    def setUsers_json(value: String): Self = this.set("users_json", value.asInstanceOf[js.Any])
  }
  
}

