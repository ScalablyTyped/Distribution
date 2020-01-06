package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeResourceResponse extends js.Object {
  /**
    * The booking options for the described resource.
    */
  var BookingOptions: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.BookingOptions] = js.native
  /**
    * The date and time when a resource was disabled from WorkMail, in UNIX epoch time format.
    */
  var DisabledDate: js.UndefOr[Timestamp] = js.native
  /**
    * The email of the described resource.
    */
  var Email: js.UndefOr[EmailAddress] = js.native
  /**
    * The date and time when a resource was enabled for WorkMail, in UNIX epoch time format.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the described resource.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * The identifier of the described resource.
    */
  var ResourceId: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.ResourceId] = js.native
  /**
    * The state of the resource: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to WorkMail).
    */
  var State: js.UndefOr[EntityState] = js.native
  /**
    * The type of the described resource.
    */
  var Type: js.UndefOr[ResourceType] = js.native
}

object DescribeResourceResponse {
  @scala.inline
  def apply(
    BookingOptions: BookingOptions = null,
    DisabledDate: Timestamp = null,
    Email: EmailAddress = null,
    EnabledDate: Timestamp = null,
    Name: ResourceName = null,
    ResourceId: ResourceId = null,
    State: EntityState = null,
    Type: ResourceType = null
  ): DescribeResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (BookingOptions != null) __obj.updateDynamic("BookingOptions")(BookingOptions.asInstanceOf[js.Any])
    if (DisabledDate != null) __obj.updateDynamic("DisabledDate")(DisabledDate.asInstanceOf[js.Any])
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (EnabledDate != null) __obj.updateDynamic("EnabledDate")(EnabledDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourceResponse]
  }
}

