package typings.awsDashSdk.clientsLicensemanagerMod

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
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.ResourceType] = js.undefined
}

object ConsumedLicenseSummary {
  @scala.inline
  def apply(ConsumedLicenses: Int | Double = null, ResourceType: ResourceType = null): ConsumedLicenseSummary = {
    val __obj = js.Dynamic.literal()
    if (ConsumedLicenses != null) __obj.updateDynamic("ConsumedLicenses")(ConsumedLicenses.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumedLicenseSummary]
  }
}

