package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterEcsClusterRequest extends js.Object {
  /**
    * The cluster's ARN.
    */
  var EcsClusterArn: String
  /**
    * The stack ID.
    */
  var StackId: String
}

object RegisterEcsClusterRequest {
  @scala.inline
  def apply(EcsClusterArn: String, StackId: String): RegisterEcsClusterRequest = {
    val __obj = js.Dynamic.literal(EcsClusterArn = EcsClusterArn, StackId = StackId)
  
    __obj.asInstanceOf[RegisterEcsClusterRequest]
  }
}

