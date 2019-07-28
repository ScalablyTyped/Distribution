package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLaunchTemplateVersionResult extends js.Object {
  /**
    * Information about the launch template version.
    */
  var LaunchTemplateVersion: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.LaunchTemplateVersion] = js.undefined
}

object CreateLaunchTemplateVersionResult {
  @scala.inline
  def apply(LaunchTemplateVersion: LaunchTemplateVersion = null): CreateLaunchTemplateVersionResult = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateVersion != null) __obj.updateDynamic("LaunchTemplateVersion")(LaunchTemplateVersion)
    __obj.asInstanceOf[CreateLaunchTemplateVersionResult]
  }
}

