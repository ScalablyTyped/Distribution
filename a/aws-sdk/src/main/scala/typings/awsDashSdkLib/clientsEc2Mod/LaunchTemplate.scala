package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplate extends js.Object {
  /**
    * The time launch template was created.
    */
  var CreateTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The principal that created the launch template. 
    */
  var CreatedBy: js.UndefOr[String] = js.undefined
  /**
    * The version number of the default version of the launch template.
    */
  var DefaultVersionNumber: js.UndefOr[Long] = js.undefined
  /**
    * The version number of the latest version of the launch template.
    */
  var LatestVersionNumber: js.UndefOr[Long] = js.undefined
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.undefined
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[LaunchTemplateName] = js.undefined
  /**
    * The tags for the launch template.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object LaunchTemplate {
  @scala.inline
  def apply(
    CreateTime: DateTime = null,
    CreatedBy: String = null,
    DefaultVersionNumber: js.UndefOr[Long] = js.undefined,
    LatestVersionNumber: js.UndefOr[Long] = js.undefined,
    LaunchTemplateId: String = null,
    LaunchTemplateName: LaunchTemplateName = null,
    Tags: TagList = null
  ): LaunchTemplate = {
    val __obj = js.Dynamic.literal()
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime)
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy)
    if (!js.isUndefined(DefaultVersionNumber)) __obj.updateDynamic("DefaultVersionNumber")(DefaultVersionNumber)
    if (!js.isUndefined(LatestVersionNumber)) __obj.updateDynamic("LatestVersionNumber")(LatestVersionNumber)
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId)
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[LaunchTemplate]
  }
}

