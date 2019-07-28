package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  /**
    * The date indicating when the group was disabled from Amazon WorkMail use.
    */
  var DisabledDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The email of the group.
    */
  var Email: js.UndefOr[EmailAddress] = js.undefined
  /**
    * The date indicating when the group was enabled for Amazon WorkMail use.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The identifier of the group.
    */
  var Id: js.UndefOr[WorkMailIdentifier] = js.undefined
  /**
    * The name of the group.
    */
  var Name: js.UndefOr[GroupName] = js.undefined
  /**
    * The state of the group, which can be ENABLED, DISABLED, or DELETED.
    */
  var State: js.UndefOr[EntityState] = js.undefined
}

object Group {
  @scala.inline
  def apply(
    DisabledDate: Timestamp = null,
    Email: EmailAddress = null,
    EnabledDate: Timestamp = null,
    Id: WorkMailIdentifier = null,
    Name: GroupName = null,
    State: EntityState = null
  ): Group = {
    val __obj = js.Dynamic.literal()
    if (DisabledDate != null) __obj.updateDynamic("DisabledDate")(DisabledDate)
    if (Email != null) __obj.updateDynamic("Email")(Email)
    if (EnabledDate != null) __obj.updateDynamic("EnabledDate")(EnabledDate)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

