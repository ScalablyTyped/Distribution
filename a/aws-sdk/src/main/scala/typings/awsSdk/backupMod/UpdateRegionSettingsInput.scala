package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRegionSettingsInput extends js.Object {
  /**
    * Updates the list of services along with the opt-in preferences for the region.
    */
  var ResourceTypeOptInPreference: js.UndefOr[typings.awsSdk.backupMod.ResourceTypeOptInPreference] = js.native
}

object UpdateRegionSettingsInput {
  @scala.inline
  def apply(ResourceTypeOptInPreference: ResourceTypeOptInPreference = null): UpdateRegionSettingsInput = {
    val __obj = js.Dynamic.literal()
    if (ResourceTypeOptInPreference != null) __obj.updateDynamic("ResourceTypeOptInPreference")(ResourceTypeOptInPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRegionSettingsInput]
  }
}

