package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesCount extends js.Object {
  /**
    * The number of instances in the Assigning state.
    */
  var Assigning: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with booting status.
    */
  var Booting: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with connection_lost status.
    */
  var ConnectionLost: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances in the Deregistering state.
    */
  var Deregistering: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with online status.
    */
  var Online: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with pending status.
    */
  var Pending: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with rebooting status.
    */
  var Rebooting: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances in the Registered state.
    */
  var Registered: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances in the Registering state.
    */
  var Registering: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with requested status.
    */
  var Requested: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with running_setup status.
    */
  var RunningSetup: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with setup_failed status.
    */
  var SetupFailed: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with shutting_down status.
    */
  var ShuttingDown: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with start_failed status.
    */
  var StartFailed: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with stop_failed status.
    */
  var StopFailed: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with stopped status.
    */
  var Stopped: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with stopping status.
    */
  var Stopping: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with terminated status.
    */
  var Terminated: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with terminating status.
    */
  var Terminating: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances in the Unassigning state.
    */
  var Unassigning: js.UndefOr[Integer] = js.undefined
}

object InstancesCount {
  @scala.inline
  def apply(
    Assigning: Int | scala.Double = null,
    Booting: Int | scala.Double = null,
    ConnectionLost: Int | scala.Double = null,
    Deregistering: Int | scala.Double = null,
    Online: Int | scala.Double = null,
    Pending: Int | scala.Double = null,
    Rebooting: Int | scala.Double = null,
    Registered: Int | scala.Double = null,
    Registering: Int | scala.Double = null,
    Requested: Int | scala.Double = null,
    RunningSetup: Int | scala.Double = null,
    SetupFailed: Int | scala.Double = null,
    ShuttingDown: Int | scala.Double = null,
    StartFailed: Int | scala.Double = null,
    StopFailed: Int | scala.Double = null,
    Stopped: Int | scala.Double = null,
    Stopping: Int | scala.Double = null,
    Terminated: Int | scala.Double = null,
    Terminating: Int | scala.Double = null,
    Unassigning: Int | scala.Double = null
  ): InstancesCount = {
    val __obj = js.Dynamic.literal()
    if (Assigning != null) __obj.updateDynamic("Assigning")(Assigning.asInstanceOf[js.Any])
    if (Booting != null) __obj.updateDynamic("Booting")(Booting.asInstanceOf[js.Any])
    if (ConnectionLost != null) __obj.updateDynamic("ConnectionLost")(ConnectionLost.asInstanceOf[js.Any])
    if (Deregistering != null) __obj.updateDynamic("Deregistering")(Deregistering.asInstanceOf[js.Any])
    if (Online != null) __obj.updateDynamic("Online")(Online.asInstanceOf[js.Any])
    if (Pending != null) __obj.updateDynamic("Pending")(Pending.asInstanceOf[js.Any])
    if (Rebooting != null) __obj.updateDynamic("Rebooting")(Rebooting.asInstanceOf[js.Any])
    if (Registered != null) __obj.updateDynamic("Registered")(Registered.asInstanceOf[js.Any])
    if (Registering != null) __obj.updateDynamic("Registering")(Registering.asInstanceOf[js.Any])
    if (Requested != null) __obj.updateDynamic("Requested")(Requested.asInstanceOf[js.Any])
    if (RunningSetup != null) __obj.updateDynamic("RunningSetup")(RunningSetup.asInstanceOf[js.Any])
    if (SetupFailed != null) __obj.updateDynamic("SetupFailed")(SetupFailed.asInstanceOf[js.Any])
    if (ShuttingDown != null) __obj.updateDynamic("ShuttingDown")(ShuttingDown.asInstanceOf[js.Any])
    if (StartFailed != null) __obj.updateDynamic("StartFailed")(StartFailed.asInstanceOf[js.Any])
    if (StopFailed != null) __obj.updateDynamic("StopFailed")(StopFailed.asInstanceOf[js.Any])
    if (Stopped != null) __obj.updateDynamic("Stopped")(Stopped.asInstanceOf[js.Any])
    if (Stopping != null) __obj.updateDynamic("Stopping")(Stopping.asInstanceOf[js.Any])
    if (Terminated != null) __obj.updateDynamic("Terminated")(Terminated.asInstanceOf[js.Any])
    if (Terminating != null) __obj.updateDynamic("Terminating")(Terminating.asInstanceOf[js.Any])
    if (Unassigning != null) __obj.updateDynamic("Unassigning")(Unassigning.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancesCount]
  }
}

