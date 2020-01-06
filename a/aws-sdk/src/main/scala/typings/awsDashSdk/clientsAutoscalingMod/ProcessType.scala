package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessType extends js.Object {
  /**
    * One of the following processes:    Launch     Terminate     AddToLoadBalancer     AlarmNotification     AZRebalance     HealthCheck     ReplaceUnhealthy     ScheduledActions   
    */
  var ProcessName: XmlStringMaxLen255 = js.native
}

object ProcessType {
  @scala.inline
  def apply(ProcessName: XmlStringMaxLen255): ProcessType = {
    val __obj = js.Dynamic.literal(ProcessName = ProcessName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProcessType]
  }
}

