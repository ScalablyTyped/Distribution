package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartInstanceRefreshType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255 = js.native
  /**
    * Set of preferences associated with the instance refresh request. If not provided, the default values are used. For MinHealthyPercentage, the default value is 90. For InstanceWarmup, the default is to use the value specified for the health check grace period for the Auto Scaling group. For more information, see RefreshPreferences in the Amazon EC2 Auto Scaling API Reference.
    */
  var Preferences: js.UndefOr[RefreshPreferences] = js.native
  /**
    * The strategy to use for the instance refresh. The only valid value is Rolling. A rolling update is an update that is applied to all instances in an Auto Scaling group until all instances have been updated. A rolling update can fail due to failed health checks or if instances are on standby or are protected from scale in. If the rolling update process fails, any instances that were already replaced are not rolled back to their previous configuration. 
    */
  var Strategy: js.UndefOr[RefreshStrategy] = js.native
}

object StartInstanceRefreshType {
  @scala.inline
  def apply(AutoScalingGroupName: XmlStringMaxLen255): StartInstanceRefreshType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartInstanceRefreshType]
  }
  @scala.inline
  implicit class StartInstanceRefreshTypeOps[Self <: StartInstanceRefreshType] (val x: Self) extends AnyVal {
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
    def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = this.set("AutoScalingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreferences(value: RefreshPreferences): Self = this.set("Preferences", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferences: Self = this.set("Preferences", js.undefined)
    @scala.inline
    def setStrategy(value: RefreshStrategy): Self = this.set("Strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("Strategy", js.undefined)
  }
  
}

