package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetLaunchTemplateSpecification extends js.Object {
  /**
    * The ID of the launch template. You must specify either a template ID or a template name.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.undefined
  /**
    * The name of the launch template. You must specify either a template name or a template ID.
    */
  var LaunchTemplateName: js.UndefOr[LaunchTemplateName] = js.undefined
  /**
    * The version number of the launch template. You must specify a version number.
    */
  var Version: js.UndefOr[String] = js.undefined
}

object FleetLaunchTemplateSpecification {
  @scala.inline
  def apply(
    LaunchTemplateId: String = null,
    LaunchTemplateName: LaunchTemplateName = null,
    Version: String = null
  ): FleetLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId)
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[FleetLaunchTemplateSpecification]
  }
}

