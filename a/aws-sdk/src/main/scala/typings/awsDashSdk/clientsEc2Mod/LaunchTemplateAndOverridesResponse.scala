package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateAndOverridesResponse extends js.Object {
  /**
    * The launch template.
    */
  var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecification] = js.native
  /**
    * Any parameters that you specify override the same parameters in the launch template.
    */
  var Overrides: js.UndefOr[FleetLaunchTemplateOverrides] = js.native
}

object LaunchTemplateAndOverridesResponse {
  @scala.inline
  def apply(
    LaunchTemplateSpecification: FleetLaunchTemplateSpecification = null,
    Overrides: FleetLaunchTemplateOverrides = null
  ): LaunchTemplateAndOverridesResponse = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateSpecification != null) __obj.updateDynamic("LaunchTemplateSpecification")(LaunchTemplateSpecification.asInstanceOf[js.Any])
    if (Overrides != null) __obj.updateDynamic("Overrides")(Overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateAndOverridesResponse]
  }
}

