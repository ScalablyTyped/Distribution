package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterEndPointsOutput extends js.Object {
  /**
    * The remaining instances registered with the load balancer.
    */
  var Instances: js.UndefOr[typings.awsDashSdk.clientsElbMod.Instances] = js.undefined
}

object DeregisterEndPointsOutput {
  @scala.inline
  def apply(Instances: Instances = null): DeregisterEndPointsOutput = {
    val __obj = js.Dynamic.literal()
    if (Instances != null) __obj.updateDynamic("Instances")(Instances)
    __obj.asInstanceOf[DeregisterEndPointsOutput]
  }
}

