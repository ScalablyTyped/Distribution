package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLaunchTemplateResult extends js.Object {
  /**
    * Information about the launch template.
    */
  var LaunchTemplate: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.LaunchTemplate] = js.native
}

object DeleteLaunchTemplateResult {
  @scala.inline
  def apply(LaunchTemplate: LaunchTemplate = null): DeleteLaunchTemplateResult = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplate != null) __obj.updateDynamic("LaunchTemplate")(LaunchTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLaunchTemplateResult]
  }
}

