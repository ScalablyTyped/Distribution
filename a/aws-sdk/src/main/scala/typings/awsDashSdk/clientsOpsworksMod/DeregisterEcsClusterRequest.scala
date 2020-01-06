package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterEcsClusterRequest extends js.Object {
  /**
    * The cluster's Amazon Resource Number (ARN).
    */
  var EcsClusterArn: String = js.native
}

object DeregisterEcsClusterRequest {
  @scala.inline
  def apply(EcsClusterArn: String): DeregisterEcsClusterRequest = {
    val __obj = js.Dynamic.literal(EcsClusterArn = EcsClusterArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeregisterEcsClusterRequest]
  }
}

