package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelInstanceRefreshType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255 = js.native
}

object CancelInstanceRefreshType {
  @scala.inline
  def apply(AutoScalingGroupName: XmlStringMaxLen255): CancelInstanceRefreshType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelInstanceRefreshType]
  }
}

