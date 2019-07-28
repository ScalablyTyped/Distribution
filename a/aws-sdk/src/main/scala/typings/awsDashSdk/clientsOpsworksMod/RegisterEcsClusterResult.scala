package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterEcsClusterResult extends js.Object {
  /**
    * The cluster's ARN.
    */
  var EcsClusterArn: js.UndefOr[String] = js.undefined
}

object RegisterEcsClusterResult {
  @scala.inline
  def apply(EcsClusterArn: String = null): RegisterEcsClusterResult = {
    val __obj = js.Dynamic.literal()
    if (EcsClusterArn != null) __obj.updateDynamic("EcsClusterArn")(EcsClusterArn)
    __obj.asInstanceOf[RegisterEcsClusterResult]
  }
}

