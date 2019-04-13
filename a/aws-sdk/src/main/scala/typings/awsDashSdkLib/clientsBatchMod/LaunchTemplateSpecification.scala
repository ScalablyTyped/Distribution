package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateSpecification extends js.Object {
  /**
    * The ID of the launch template.
    */
  var launchTemplateId: js.UndefOr[String] = js.undefined
  /**
    * The name of the launch template.
    */
  var launchTemplateName: js.UndefOr[String] = js.undefined
  /**
    * The version number of the launch template. Default: The default version of the launch template.
    */
  var version: js.UndefOr[String] = js.undefined
}

object LaunchTemplateSpecification {
  @scala.inline
  def apply(launchTemplateId: String = null, launchTemplateName: String = null, version: String = null): LaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    if (launchTemplateId != null) __obj.updateDynamic("launchTemplateId")(launchTemplateId)
    if (launchTemplateName != null) __obj.updateDynamic("launchTemplateName")(launchTemplateName)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[LaunchTemplateSpecification]
  }
}

