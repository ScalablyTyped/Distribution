package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializeClusterResponse extends js.Object {
  /**
    * The cluster's state.
    */
  var State: js.UndefOr[ClusterState] = js.native
  /**
    * A description of the cluster's state.
    */
  var StateMessage: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.StateMessage] = js.native
}

object InitializeClusterResponse {
  @scala.inline
  def apply(State: ClusterState = null, StateMessage: StateMessage = null): InitializeClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateMessage != null) __obj.updateDynamic("StateMessage")(StateMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeClusterResponse]
  }
}

