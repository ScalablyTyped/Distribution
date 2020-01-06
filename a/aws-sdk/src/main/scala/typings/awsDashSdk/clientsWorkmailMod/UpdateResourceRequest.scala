package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResourceRequest extends js.Object {
  /**
    * The resource's booking options to be updated.
    */
  var BookingOptions: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.BookingOptions] = js.native
  /**
    * The name of the resource to be updated.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * The identifier associated with the organization for which the resource is updated.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId = js.native
  /**
    * The identifier of the resource to be updated.
    */
  var ResourceId: typings.awsDashSdk.clientsWorkmailMod.ResourceId = js.native
}

object UpdateResourceRequest {
  @scala.inline
  def apply(
    OrganizationId: OrganizationId,
    ResourceId: ResourceId,
    BookingOptions: BookingOptions = null,
    Name: ResourceName = null
  ): UpdateResourceRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    if (BookingOptions != null) __obj.updateDynamic("BookingOptions")(BookingOptions.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceRequest]
  }
}

