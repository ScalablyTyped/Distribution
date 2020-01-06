package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserInfo extends js.Object {
  /**
    * The date when the specified commit was commited, in timestamp format with GMT offset.
    */
  var date: js.UndefOr[_Date] = js.native
  /**
    * The email address associated with the user who made the commit, if any.
    */
  var email: js.UndefOr[Email] = js.native
  /**
    * The name of the user who made the specified commit.
    */
  var name: js.UndefOr[Name] = js.native
}

object UserInfo {
  @scala.inline
  def apply(date: _Date = null, email: Email = null, name: Name = null): UserInfo = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
}

