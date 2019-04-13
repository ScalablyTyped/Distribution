package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterEcsClusterRequest extends js.Object {
  /**
    * The cluster's Amazon Resource Number (ARN).
    */
  var EcsClusterArn: String
}

object DeregisterEcsClusterRequest {
  @scala.inline
  def apply(EcsClusterArn: String): DeregisterEcsClusterRequest = {
    val __obj = js.Dynamic.literal(EcsClusterArn = EcsClusterArn)
  
    __obj.asInstanceOf[DeregisterEcsClusterRequest]
  }
}

