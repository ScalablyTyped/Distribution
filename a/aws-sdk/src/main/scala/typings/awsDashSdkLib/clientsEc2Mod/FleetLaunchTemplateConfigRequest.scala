package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetLaunchTemplateConfigRequest extends js.Object {
  /**
    * The launch template to use. You must specify either the launch template ID or launch template name in the request. 
    */
  var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecificationRequest] = js.undefined
  /**
    * Any parameters that you specify override the same parameters in the launch template.
    */
  var Overrides: js.UndefOr[FleetLaunchTemplateOverridesListRequest] = js.undefined
}

object FleetLaunchTemplateConfigRequest {
  @scala.inline
  def apply(
    LaunchTemplateSpecification: FleetLaunchTemplateSpecificationRequest = null,
    Overrides: FleetLaunchTemplateOverridesListRequest = null
  ): FleetLaunchTemplateConfigRequest = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateSpecification != null) __obj.updateDynamic("LaunchTemplateSpecification")(LaunchTemplateSpecification)
    if (Overrides != null) __obj.updateDynamic("Overrides")(Overrides)
    __obj.asInstanceOf[FleetLaunchTemplateConfigRequest]
  }
}

