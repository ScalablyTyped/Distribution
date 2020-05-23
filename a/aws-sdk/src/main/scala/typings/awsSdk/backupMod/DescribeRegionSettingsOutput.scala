package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRegionSettingsOutput extends js.Object {
  /**
    * Returns a list of all services along with the opt-in preferences in the region.
    */
  var ResourceTypeOptInPreference: js.UndefOr[typings.awsSdk.backupMod.ResourceTypeOptInPreference] = js.native
}

object DescribeRegionSettingsOutput {
  @scala.inline
  def apply(ResourceTypeOptInPreference: ResourceTypeOptInPreference = null): DescribeRegionSettingsOutput = {
    val __obj = js.Dynamic.literal()
    if (ResourceTypeOptInPreference != null) __obj.updateDynamic("ResourceTypeOptInPreference")(ResourceTypeOptInPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRegionSettingsOutput]
  }
}

