package typings
package awsDashSdkLib.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedResourceSummary extends js.Object {
  /**
    * Number of resources associated with licenses.
    */
  var AssociationCount: js.UndefOr[BoxLong] = js.undefined
  /**
    * Type of resource associated with a license (instance, host, or AMI).
    */
  var ResourceType: js.UndefOr[ResourceType] = js.undefined
}

object ManagedResourceSummary {
  @scala.inline
  def apply(AssociationCount: js.UndefOr[BoxLong] = js.undefined, ResourceType: ResourceType = null): ManagedResourceSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AssociationCount)) __obj.updateDynamic("AssociationCount")(AssociationCount)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedResourceSummary]
  }
}

