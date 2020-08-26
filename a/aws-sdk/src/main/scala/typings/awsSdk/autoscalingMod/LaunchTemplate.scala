package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplate extends js.Object {
  /**
    * The launch template to use. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateSpecification: js.UndefOr[typings.awsSdk.autoscalingMod.LaunchTemplateSpecification] = js.native
  /**
    * Any parameters that you specify override the same parameters in the launch template. Currently, the only supported override is instance type. You can specify between 1 and 20 instance types. If not provided, Amazon EC2 Auto Scaling will use the instance type specified in the launch template to launch instances. 
    */
  var Overrides: js.UndefOr[typings.awsSdk.autoscalingMod.Overrides] = js.native
}

object LaunchTemplate {
  @scala.inline
  def apply(): LaunchTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplate]
  }
  @scala.inline
  implicit class LaunchTemplateOps[Self <: LaunchTemplate] (val x: Self) extends AnyVal {
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
    def setLaunchTemplateSpecification(value: LaunchTemplateSpecification): Self = this.set("LaunchTemplateSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplateSpecification: Self = this.set("LaunchTemplateSpecification", js.undefined)
    @scala.inline
    def setOverridesVarargs(value: LaunchTemplateOverrides*): Self = this.set("Overrides", js.Array(value :_*))
    @scala.inline
    def setOverrides(value: Overrides): Self = this.set("Overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("Overrides", js.undefined)
  }
  
}

