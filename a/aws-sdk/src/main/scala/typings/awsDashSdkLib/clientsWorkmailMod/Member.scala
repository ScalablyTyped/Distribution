package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends js.Object {
  /**
    * The date indicating when the member was disabled from Amazon WorkMail use.
    */
  var DisabledDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The date indicating when the member was enabled for Amazon WorkMail use.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The identifier of the member.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * The name of the member.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The state of the member, which can be ENABLED, DISABLED, or DELETED.
    */
  var State: js.UndefOr[EntityState] = js.undefined
  /**
    * A member can be a user or group.
    */
  var Type: js.UndefOr[MemberType] = js.undefined
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
    if (DisabledDate != null) __obj.updateDynamic("DisabledDate")(DisabledDate)
    if (EnabledDate != null) __obj.updateDynamic("EnabledDate")(EnabledDate)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
}

