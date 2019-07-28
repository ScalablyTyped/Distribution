package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetLaunchTemplateSpecificationRequest extends js.Object {
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.undefined
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.LaunchTemplateName] = js.undefined
  /**
    * The version number of the launch template. Note: This is a required parameter and will be updated soon. 
    */
  var Version: js.UndefOr[String] = js.undefined
}

object FleetLaunchTemplateSpecificationRequest {
  @scala.inline
  def apply(
    LaunchTemplateId: String = null,
    LaunchTemplateName: LaunchTemplateName = null,
    Version: String = null
  ): FleetLaunchTemplateSpecificationRequest = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId)
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[FleetLaunchTemplateSpecificationRequest]
  }
}

