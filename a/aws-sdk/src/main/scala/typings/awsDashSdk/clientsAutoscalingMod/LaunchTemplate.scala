package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplate extends js.Object {
  /**
    * The launch template to use. You must specify either the launch template ID or launch template name in the request. 
    */
  var LaunchTemplateSpecification: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.LaunchTemplateSpecification] = js.undefined
  /**
    * Any parameters that you specify override the same parameters in the launch template. Currently, the only supported override is instance type. You must specify between 2 and 20 overrides.
    */
  var Overrides: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.Overrides] = js.undefined
}

object LaunchTemplate {
  @scala.inline
  def apply(LaunchTemplateSpecification: LaunchTemplateSpecification = null, Overrides: Overrides = null): LaunchTemplate = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateSpecification != null) __obj.updateDynamic("LaunchTemplateSpecification")(LaunchTemplateSpecification)
    if (Overrides != null) __obj.updateDynamic("Overrides")(Overrides)
    __obj.asInstanceOf[LaunchTemplate]
  }
}

