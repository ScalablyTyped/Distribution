package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  /**
    * The date indicating when the resource was disabled from Amazon WorkMail use.
    */
  var DisabledDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The email of the resource.
    */
  var Email: js.UndefOr[EmailAddress] = js.undefined
  /**
    * The date indicating when the resource was enabled for Amazon WorkMail use.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The identifier of the resource.
    */
  var Id: js.UndefOr[WorkMailIdentifier] = js.undefined
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The state of the resource, which can be ENABLED, DISABLED, or DELETED.
    */
  var State: js.UndefOr[EntityState] = js.undefined
  /**
    * The type of the resource: equipment or room.
    */
  var Type: js.UndefOr[ResourceType] = js.undefined
}

object Resource {
  @scala.inline
  def apply(
    DisabledDate: Timestamp = null,
    Email: EmailAddress = null,
    EnabledDate: Timestamp = null,
    Id: WorkMailIdentifier = null,
    Name: ResourceName = null,
    State: EntityState = null,
    Type: ResourceType = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (DisabledDate != null) __obj.updateDynamic("DisabledDate")(DisabledDate)
    if (Email != null) __obj.updateDynamic("Email")(Email)
    if (EnabledDate != null) __obj.updateDynamic("EnabledDate")(EnabledDate)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
}

