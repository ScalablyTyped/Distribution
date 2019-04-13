package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLaunchTemplateResult extends js.Object {
  /**
    * Information about the launch template.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplate] = js.undefined
}

object DeleteLaunchTemplateResult {
  @scala.inline
  def apply(LaunchTemplate: LaunchTemplate = null): DeleteLaunchTemplateResult = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplate != null) __obj.updateDynamic("LaunchTemplate")(LaunchTemplate)
    __obj.asInstanceOf[DeleteLaunchTemplateResult]
  }
}

