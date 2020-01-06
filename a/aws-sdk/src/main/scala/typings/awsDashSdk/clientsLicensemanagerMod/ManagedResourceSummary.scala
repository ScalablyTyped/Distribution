package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedResourceSummary extends js.Object {
  /**
    * Number of resources associated with licenses.
    */
  var AssociationCount: js.UndefOr[BoxLong] = js.native
  /**
    * Type of resource associated with a license.
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.ResourceType] = js.native
}

object ManagedResourceSummary {
  @scala.inline
  def apply(AssociationCount: Int | Double = null, ResourceType: ResourceType = null): ManagedResourceSummary = {
    val __obj = js.Dynamic.literal()
    if (AssociationCount != null) __obj.updateDynamic("AssociationCount")(AssociationCount.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedResourceSummary]
  }
}

