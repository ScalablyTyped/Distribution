package typings.awsDashSdk.clientsMigrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHomeRegionControlResult extends js.Object {
  /**
    * This object is the HomeRegionControl object that's returned by a successful call to CreateHomeRegionControl.
    */
  var HomeRegionControl: js.UndefOr[typings.awsDashSdk.clientsMigrationhubconfigMod.HomeRegionControl] = js.native
}

object CreateHomeRegionControlResult {
  @scala.inline
  def apply(HomeRegionControl: HomeRegionControl = null): CreateHomeRegionControlResult = {
    val __obj = js.Dynamic.literal()
    if (HomeRegionControl != null) __obj.updateDynamic("HomeRegionControl")(HomeRegionControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHomeRegionControlResult]
  }
}

