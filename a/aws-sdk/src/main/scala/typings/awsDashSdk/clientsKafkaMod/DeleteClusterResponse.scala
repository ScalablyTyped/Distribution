package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteClusterResponse extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster.
    
    */
  var ClusterArn: js.UndefOr[__string] = js.undefined
  /**
    * 
    The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
    
    */
  var State: js.UndefOr[ClusterState] = js.undefined
}

object DeleteClusterResponse {
  @scala.inline
  def apply(ClusterArn: __string = null, State: ClusterState = null): DeleteClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (ClusterArn != null) __obj.updateDynamic("ClusterArn")(ClusterArn)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterResponse]
  }
}

