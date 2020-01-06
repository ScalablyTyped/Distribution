package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLaunchTemplateResult extends js.Object {
  /**
    * Information about the launch template.
    */
  var LaunchTemplate: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.LaunchTemplate] = js.native
}

object CreateLaunchTemplateResult {
  @scala.inline
  def apply(LaunchTemplate: LaunchTemplate = null): CreateLaunchTemplateResult = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplate != null) __obj.updateDynamic("LaunchTemplate")(LaunchTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLaunchTemplateResult]
  }
}

