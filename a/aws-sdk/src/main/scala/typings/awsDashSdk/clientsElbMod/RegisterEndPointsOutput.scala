package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterEndPointsOutput extends js.Object {
  /**
    * The updated list of instances for the load balancer.
    */
  var Instances: js.UndefOr[typings.awsDashSdk.clientsElbMod.Instances] = js.undefined
}

object RegisterEndPointsOutput {
  @scala.inline
  def apply(Instances: Instances = null): RegisterEndPointsOutput = {
    val __obj = js.Dynamic.literal()
    if (Instances != null) __obj.updateDynamic("Instances")(Instances)
    __obj.asInstanceOf[RegisterEndPointsOutput]
  }
}

