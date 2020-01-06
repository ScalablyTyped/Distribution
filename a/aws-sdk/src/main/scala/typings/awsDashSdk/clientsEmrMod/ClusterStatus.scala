package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterStatus extends js.Object {
  /**
    * The current state of the cluster.
    */
  var State: js.UndefOr[ClusterState] = js.native
  /**
    * The reason for the cluster status change.
    */
  var StateChangeReason: js.UndefOr[ClusterStateChangeReason] = js.native
  /**
    * A timeline that represents the status of a cluster over the lifetime of the cluster.
    */
  var Timeline: js.UndefOr[ClusterTimeline] = js.native
}

object ClusterStatus {
  @scala.inline
  def apply(
    State: ClusterState = null,
    StateChangeReason: ClusterStateChangeReason = null,
    Timeline: ClusterTimeline = null
  ): ClusterStatus = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateChangeReason != null) __obj.updateDynamic("StateChangeReason")(StateChangeReason.asInstanceOf[js.Any])
    if (Timeline != null) __obj.updateDynamic("Timeline")(Timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatus]
  }
}

