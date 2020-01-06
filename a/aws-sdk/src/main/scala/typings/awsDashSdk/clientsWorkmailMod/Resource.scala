package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  /**
    * The date indicating when the resource was disabled from Amazon WorkMail use.
    */
  var DisabledDate: js.UndefOr[Timestamp] = js.native
  /**
    * The email of the resource.
    */
  var Email: js.UndefOr[EmailAddress] = js.native
  /**
    * The date indicating when the resource was enabled for Amazon WorkMail use.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.native
  /**
    * The identifier of the resource.
    */
  var Id: js.UndefOr[WorkMailIdentifier] = js.native
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * The state of the resource, which can be ENABLED, DISABLED, or DELETED.
    */
  var State: js.UndefOr[EntityState] = js.native
  /**
    * The type of the resource: equipment or room.
    */
  var Type: js.UndefOr[ResourceType] = js.native
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
    if (DisabledDate != null) __obj.updateDynamic("DisabledDate")(DisabledDate.asInstanceOf[js.Any])
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (EnabledDate != null) __obj.updateDynamic("EnabledDate")(EnabledDate.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
}

