package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateSpecification extends js.Object {
  /**
    * The ID of the launch template. To get the template ID, use the Amazon EC2 DescribeLaunchTemplates API operation. New launch templates can be created using the Amazon EC2 CreateLaunchTemplate API. You must specify either a template ID or a template name.
    */
  var LaunchTemplateId: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The name of the launch template. To get the template name, use the Amazon EC2 DescribeLaunchTemplates API operation. New launch templates can be created using the Amazon EC2 CreateLaunchTemplate API. You must specify either a template ID or a template name.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.autoscalingMod.LaunchTemplateName] = js.native
  /**
    * The version number, $Latest, or $Default. To get the version number, use the Amazon EC2 DescribeLaunchTemplateVersions API operation. New launch template versions can be created using the Amazon EC2 CreateLaunchTemplateVersion API. If the value is $Latest, Amazon EC2 Auto Scaling selects the latest version of the launch template when launching instances. If the value is $Default, Amazon EC2 Auto Scaling selects the default version of the launch template when launching instances. The default value is $Default.
    */
  var Version: js.UndefOr[XmlStringMaxLen255] = js.native
}

object LaunchTemplateSpecification {
  @scala.inline
  def apply(): LaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateSpecification]
  }
  @scala.inline
  implicit class LaunchTemplateSpecificationOps[Self <: LaunchTemplateSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLaunchTemplateId(value: XmlStringMaxLen255): Self = this.set("LaunchTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplateId: Self = this.set("LaunchTemplateId", js.undefined)
    @scala.inline
    def setLaunchTemplateName(value: LaunchTemplateName): Self = this.set("LaunchTemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplateName: Self = this.set("LaunchTemplateName", js.undefined)
    @scala.inline
    def setVersion(value: XmlStringMaxLen255): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

