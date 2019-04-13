package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateResourceRequest extends js.Object {
  /**
    * The resource's booking options to be updated.
    */
  var BookingOptions: js.UndefOr[BookingOptions] = js.undefined
  /**
    * The name of the resource to be updated.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The identifier associated with the organization for which the resource is updated.
    */
  var OrganizationId: awsDashSdkLib.clientsWorkmailMod.OrganizationId
  /**
    * The identifier of the resource to be updated.
    */
  var ResourceId: awsDashSdkLib.clientsWorkmailMod.ResourceId
}

object UpdateResourceRequest {
  @scala.inline
  def apply(
    OrganizationId: OrganizationId,
    ResourceId: ResourceId,
    BookingOptions: BookingOptions = null,
    Name: ResourceName = null
  ): UpdateResourceRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId, ResourceId = ResourceId)
    if (BookingOptions != null) __obj.updateDynamic("BookingOptions")(BookingOptions)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateResourceRequest]
  }
}

