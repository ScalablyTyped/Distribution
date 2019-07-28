package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLaunchTemplateVersionsResponseErrorItem extends js.Object {
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.undefined
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[String] = js.undefined
  /**
    * Information about the error.
    */
  var ResponseError: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.ResponseError] = js.undefined
  /**
    * The version number of the launch template.
    */
  var VersionNumber: js.UndefOr[Long] = js.undefined
}

object DeleteLaunchTemplateVersionsResponseErrorItem {
  @scala.inline
  def apply(
    LaunchTemplateId: String = null,
    LaunchTemplateName: String = null,
    ResponseError: ResponseError = null,
    VersionNumber: js.UndefOr[Long] = js.undefined
  ): DeleteLaunchTemplateVersionsResponseErrorItem = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId)
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName)
    if (ResponseError != null) __obj.updateDynamic("ResponseError")(ResponseError)
    if (!js.isUndefined(VersionNumber)) __obj.updateDynamic("VersionNumber")(VersionNumber)
    __obj.asInstanceOf[DeleteLaunchTemplateVersionsResponseErrorItem]
  }
}

