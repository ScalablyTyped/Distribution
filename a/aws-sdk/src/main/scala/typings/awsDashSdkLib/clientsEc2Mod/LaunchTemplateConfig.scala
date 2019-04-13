package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateConfig extends js.Object {
  /**
    * The launch template.
    */
  var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecification] = js.undefined
  /**
    * Any parameters that you specify override the same parameters in the launch template.
    */
  var Overrides: js.UndefOr[LaunchTemplateOverridesList] = js.undefined
}

object LaunchTemplateConfig {
  @scala.inline
  def apply(
    LaunchTemplateSpecification: FleetLaunchTemplateSpecification = null,
    Overrides: LaunchTemplateOverridesList = null
  ): LaunchTemplateConfig = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateSpecification != null) __obj.updateDynamic("LaunchTemplateSpecification")(LaunchTemplateSpecification)
    if (Overrides != null) __obj.updateDynamic("Overrides")(Overrides)
    __obj.asInstanceOf[LaunchTemplateConfig]
  }
}

