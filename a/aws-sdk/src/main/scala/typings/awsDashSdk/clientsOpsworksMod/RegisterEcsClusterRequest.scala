package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterEcsClusterRequest extends js.Object {
  /**
    * The cluster's ARN.
    */
  var EcsClusterArn: String = js.native
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}

object RegisterEcsClusterRequest {
  @scala.inline
  def apply(EcsClusterArn: String, StackId: String): RegisterEcsClusterRequest = {
    val __obj = js.Dynamic.literal(EcsClusterArn = EcsClusterArn.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RegisterEcsClusterRequest]
  }
}

