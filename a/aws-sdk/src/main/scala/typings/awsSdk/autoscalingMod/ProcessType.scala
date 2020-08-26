package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessType extends js.Object {
  /**
    * One of the following processes:    Launch     Terminate     AddToLoadBalancer     AlarmNotification     AZRebalance     HealthCheck     InstanceRefresh     ReplaceUnhealthy     ScheduledActions   
    */
  var ProcessName: XmlStringMaxLen255 = js.native
}

object ProcessType {
  @scala.inline
  def apply(ProcessName: XmlStringMaxLen255): ProcessType = {
    val __obj = js.Dynamic.literal(ProcessName = ProcessName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessType]
  }
  @scala.inline
  implicit class ProcessTypeOps[Self <: ProcessType] (val x: Self) extends AnyVal {
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
    def setProcessName(value: XmlStringMaxLen255): Self = this.set("ProcessName", value.asInstanceOf[js.Any])
  }
  
}

