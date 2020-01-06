package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterInput extends js.Object {
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: String = js.native
  /**
    * The number of steps that can be executed concurrently. You can specify a maximum of 256 steps. 
    */
  var StepConcurrencyLevel: js.UndefOr[Integer] = js.native
}

object ModifyClusterInput {
  @scala.inline
  def apply(ClusterId: String, StepConcurrencyLevel: Int | Double = null): ModifyClusterInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    if (StepConcurrencyLevel != null) __obj.updateDynamic("StepConcurrencyLevel")(StepConcurrencyLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterInput]
  }
}

