package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the cluster.
    */
  var ClusterArn: js.UndefOr[__string] = js.undefined
  /**
    * The name of the MSK cluster.
    */
  var ClusterName: js.UndefOr[__string] = js.undefined
  /**
    * The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
    */
  var State: js.UndefOr[ClusterState] = js.undefined
}

object CreateClusterResponse {
  @scala.inline
  def apply(ClusterArn: __string = null, ClusterName: __string = null, State: ClusterState = null): CreateClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (ClusterArn != null) __obj.updateDynamic("ClusterArn")(ClusterArn)
    if (ClusterName != null) __obj.updateDynamic("ClusterName")(ClusterName)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterResponse]
  }
}

