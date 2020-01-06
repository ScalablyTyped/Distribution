package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLaunchTemplateVersionsResponseErrorItem extends js.Object {
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.native
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[String] = js.native
  /**
    * Information about the error.
    */
  var ResponseError: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.ResponseError] = js.native
  /**
    * The version number of the launch template.
    */
  var VersionNumber: js.UndefOr[Long] = js.native
}

object DeleteLaunchTemplateVersionsResponseErrorItem {
  @scala.inline
  def apply(
    LaunchTemplateId: String = null,
    LaunchTemplateName: String = null,
    ResponseError: ResponseError = null,
    VersionNumber: Int | scala.Double = null
  ): DeleteLaunchTemplateVersionsResponseErrorItem = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId.asInstanceOf[js.Any])
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName.asInstanceOf[js.Any])
    if (ResponseError != null) __obj.updateDynamic("ResponseError")(ResponseError.asInstanceOf[js.Any])
    if (VersionNumber != null) __obj.updateDynamic("VersionNumber")(VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLaunchTemplateVersionsResponseErrorItem]
  }
}

