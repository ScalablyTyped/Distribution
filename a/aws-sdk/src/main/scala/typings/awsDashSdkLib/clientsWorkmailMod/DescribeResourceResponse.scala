package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeResourceResponse extends js.Object {
  /**
    * The booking options for the described resource.
    */
  var BookingOptions: js.UndefOr[BookingOptions] = js.undefined
  /**
    * The date and time when a resource was disabled from WorkMail, in UNIX epoch time format.
    */
  var DisabledDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The email of the described resource.
    */
  var Email: js.UndefOr[EmailAddress] = js.undefined
  /**
    * The date and time when a resource was enabled for WorkMail, in UNIX epoch time format.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the described resource.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The identifier of the described resource.
    */
  var ResourceId: js.UndefOr[ResourceId] = js.undefined
  /**
    * The state of the resource: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to WorkMail).
    */
  var State: js.UndefOr[EntityState] = js.undefined
  /**
    * The type of the described resource.
    */
  var Type: js.UndefOr[ResourceType] = js.undefined
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
    if (BookingOptions != null) __obj.updateDynamic("BookingOptions")(BookingOptions)
    if (DisabledDate != null) __obj.updateDynamic("DisabledDate")(DisabledDate)
    if (Email != null) __obj.updateDynamic("Email")(Email)
    if (EnabledDate != null) __obj.updateDynamic("EnabledDate")(EnabledDate)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourceResponse]
  }
}

