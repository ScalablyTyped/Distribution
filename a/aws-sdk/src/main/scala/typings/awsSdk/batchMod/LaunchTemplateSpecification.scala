package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateSpecification extends js.Object {
  /**
    * The ID of the launch template.
    */
  var launchTemplateId: js.UndefOr[String] = js.native
  /**
    * The name of the launch template.
    */
  var launchTemplateName: js.UndefOr[String] = js.native
  /**
    * The version number of the launch template. Default: The default version of the launch template.
    */
  var version: js.UndefOr[String] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLaunchTemplateId(value: String): Self = this.set("launchTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplateId: Self = this.set("launchTemplateId", js.undefined)
    @scala.inline
    def setLaunchTemplateName(value: String): Self = this.set("launchTemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplateName: Self = this.set("launchTemplateName", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

