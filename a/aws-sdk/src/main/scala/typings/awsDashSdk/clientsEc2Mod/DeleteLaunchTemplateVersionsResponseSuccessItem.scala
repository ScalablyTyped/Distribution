package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLaunchTemplateVersionsResponseSuccessItem extends js.Object {
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.undefined
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[String] = js.undefined
  /**
    * The version number of the launch template.
    */
  var VersionNumber: js.UndefOr[Long] = js.undefined
}

object DeleteLaunchTemplateVersionsResponseSuccessItem {
  @scala.inline
  def apply(
    LaunchTemplateId: String = null,
    LaunchTemplateName: String = null,
    VersionNumber: js.UndefOr[Long] = js.undefined
  ): DeleteLaunchTemplateVersionsResponseSuccessItem = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId)
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName)
    if (!js.isUndefined(VersionNumber)) __obj.updateDynamic("VersionNumber")(VersionNumber)
    __obj.asInstanceOf[DeleteLaunchTemplateVersionsResponseSuccessItem]
  }
}

