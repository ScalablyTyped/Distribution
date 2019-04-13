package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /**
    * The date indicating when the user was disabled from Amazon WorkMail use.
    */
  var DisabledDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The display name of the user.
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  /**
    * The email of the user.
    */
  var Email: js.UndefOr[EmailAddress] = js.undefined
  /**
    * The date indicating when the user was enabled for Amazon WorkMail use.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The identifier of the user.
    */
  var Id: js.UndefOr[WorkMailIdentifier] = js.undefined
  /**
    * The name of the user.
    */
  var Name: js.UndefOr[UserName] = js.undefined
  /**
    * The state of the user, which can be ENABLED, DISABLED, or DELETED.
    */
  var State: js.UndefOr[EntityState] = js.undefined
  /**
    * The role of the user.
    */
  var UserRole: js.UndefOr[UserRole] = js.undefined
}

object User {
  @scala.inline
  def apply(
    DisabledDate: Timestamp = null,
    DisplayName: String = null,
    Email: EmailAddress = null,
    EnabledDate: Timestamp = null,
    Id: WorkMailIdentifier = null,
    Name: UserName = null,
    State: EntityState = null,
    UserRole: UserRole = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (DisabledDate != null) __obj.updateDynamic("DisabledDate")(DisabledDate)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (Email != null) __obj.updateDynamic("Email")(Email)
    if (EnabledDate != null) __obj.updateDynamic("EnabledDate")(EnabledDate)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (UserRole != null) __obj.updateDynamic("UserRole")(UserRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

