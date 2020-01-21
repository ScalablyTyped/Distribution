package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateSpecification extends js.Object {
  /**
    * The ID of the launch template. You must specify either a template ID or a template name.
    */
  var LaunchTemplateId: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The name of the launch template. You must specify either a template name or a template ID.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.autoscalingMod.LaunchTemplateName] = js.native
  /**
    * The version number, $Latest, or $Default. If the value is $Latest, Amazon EC2 Auto Scaling selects the latest version of the launch template when launching instances. If the value is $Default, Amazon EC2 Auto Scaling selects the default version of the launch template when launching instances. The default value is $Default.
    */
  var Version: js.UndefOr[XmlStringMaxLen255] = js.native
}

object LaunchTemplateSpecification {
  @scala.inline
  def apply(
    LaunchTemplateId: XmlStringMaxLen255 = null,
    LaunchTemplateName: LaunchTemplateName = null,
    Version: XmlStringMaxLen255 = null
  ): LaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId.asInstanceOf[js.Any])
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateSpecification]
  }
}

