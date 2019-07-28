package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateVersion extends js.Object {
  /**
    * The time the version was created.
    */
  var CreateTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The principal that created the version.
    */
  var CreatedBy: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the version is the default version.
    */
  var DefaultVersion: js.UndefOr[Boolean] = js.undefined
  /**
    * Information about the launch template.
    */
  var LaunchTemplateData: js.UndefOr[ResponseLaunchTemplateData] = js.undefined
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.undefined
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.LaunchTemplateName] = js.undefined
  /**
    * The description for the version.
    */
  var VersionDescription: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.VersionDescription] = js.undefined
  /**
    * The version number.
    */
  var VersionNumber: js.UndefOr[Long] = js.undefined
}

object LaunchTemplateVersion {
  @scala.inline
  def apply(
    CreateTime: DateTime = null,
    CreatedBy: String = null,
    DefaultVersion: js.UndefOr[Boolean] = js.undefined,
    LaunchTemplateData: ResponseLaunchTemplateData = null,
    LaunchTemplateId: String = null,
    LaunchTemplateName: LaunchTemplateName = null,
    VersionDescription: VersionDescription = null,
    VersionNumber: js.UndefOr[Long] = js.undefined
  ): LaunchTemplateVersion = {
    val __obj = js.Dynamic.literal()
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime)
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy)
    if (!js.isUndefined(DefaultVersion)) __obj.updateDynamic("DefaultVersion")(DefaultVersion)
    if (LaunchTemplateData != null) __obj.updateDynamic("LaunchTemplateData")(LaunchTemplateData)
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId)
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName)
    if (VersionDescription != null) __obj.updateDynamic("VersionDescription")(VersionDescription)
    if (!js.isUndefined(VersionNumber)) __obj.updateDynamic("VersionNumber")(VersionNumber)
    __obj.asInstanceOf[LaunchTemplateVersion]
  }
}

