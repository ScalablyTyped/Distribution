package typings
package awsDashSdkLib.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumedLicenseSummary extends js.Object {
  /**
    * Number of licenses consumed by a resource.
    */
  var ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined
  /**
    * Resource type of the resource consuming a license (instance, host, or AMI).
    */
  var ResourceType: js.UndefOr[ResourceType] = js.undefined
}

object ConsumedLicenseSummary {
  @scala.inline
  def apply(ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined, ResourceType: ResourceType = null): ConsumedLicenseSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ConsumedLicenses)) __obj.updateDynamic("ConsumedLicenses")(ConsumedLicenses)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumedLicenseSummary]
  }
}

