package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Member extends js.Object {
  /**
    * The date indicating when the member was disabled from Amazon WorkMail use.
    */
  var DisabledDate: js.UndefOr[Timestamp] = js.native
  /**
    * The date indicating when the member was enabled for Amazon WorkMail use.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.native
  /**
    * The identifier of the member.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * The name of the member.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The state of the member, which can be ENABLED, DISABLED, or DELETED.
    */
  var State: js.UndefOr[EntityState] = js.native
  /**
    * A member can be a user or group.
    */
  var Type: js.UndefOr[MemberType] = js.native
}

object Member {
  @scala.inline
  def apply(
    DisabledDate: Timestamp = null,
    EnabledDate: Timestamp = null,
    Id: String = null,
    Name: String = null,
    State: EntityState = null,
    Type: MemberType = null
  ): Member = {
    val __obj = js.Dynamic.literal()
    if (DisabledDate != null) __obj.updateDynamic("DisabledDate")(DisabledDate.asInstanceOf[js.Any])
    if (EnabledDate != null) __obj.updateDynamic("EnabledDate")(EnabledDate.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
}

