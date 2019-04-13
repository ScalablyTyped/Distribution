package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateSpecification extends js.Object {
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.undefined
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[String] = js.undefined
  /**
    * The version number of the launch template. Default: The default version for the launch template.
    */
  var Version: js.UndefOr[String] = js.undefined
}

object LaunchTemplateSpecification {
  @scala.inline
  def apply(LaunchTemplateId: String = null, LaunchTemplateName: String = null, Version: String = null): LaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId)
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[LaunchTemplateSpecification]
  }
}

