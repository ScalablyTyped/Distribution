package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchConfigurationsType extends js.Object {
  /**
    * The launch configurations.
    */
  var LaunchConfigurations: typings.awsSdk.autoscalingMod.LaunchConfigurations = js.native
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
}

object LaunchConfigurationsType {
  @scala.inline
  def apply(LaunchConfigurations: LaunchConfigurations): LaunchConfigurationsType = {
    val __obj = js.Dynamic.literal(LaunchConfigurations = LaunchConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationsType]
  }
  @scala.inline
  implicit class LaunchConfigurationsTypeOps[Self <: LaunchConfigurationsType] (val x: Self) extends AnyVal {
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
    def setLaunchConfigurationsVarargs(value: LaunchConfiguration*): Self = this.set("LaunchConfigurations", js.Array(value :_*))
    @scala.inline
    def setLaunchConfigurations(value: LaunchConfigurations): Self = this.set("LaunchConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: XmlString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

