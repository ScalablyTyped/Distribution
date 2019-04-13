package typings
package awsDashSdkLib.clientsOpsworksMod

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
    Assigning: js.UndefOr[Integer] = js.undefined,
    Booting: js.UndefOr[Integer] = js.undefined,
    ConnectionLost: js.UndefOr[Integer] = js.undefined,
    Deregistering: js.UndefOr[Integer] = js.undefined,
    Online: js.UndefOr[Integer] = js.undefined,
    Pending: js.UndefOr[Integer] = js.undefined,
    Rebooting: js.UndefOr[Integer] = js.undefined,
    Registered: js.UndefOr[Integer] = js.undefined,
    Registering: js.UndefOr[Integer] = js.undefined,
    Requested: js.UndefOr[Integer] = js.undefined,
    RunningSetup: js.UndefOr[Integer] = js.undefined,
    SetupFailed: js.UndefOr[Integer] = js.undefined,
    ShuttingDown: js.UndefOr[Integer] = js.undefined,
    StartFailed: js.UndefOr[Integer] = js.undefined,
    StopFailed: js.UndefOr[Integer] = js.undefined,
    Stopped: js.UndefOr[Integer] = js.undefined,
    Stopping: js.UndefOr[Integer] = js.undefined,
    Terminated: js.UndefOr[Integer] = js.undefined,
    Terminating: js.UndefOr[Integer] = js.undefined,
    Unassigning: js.UndefOr[Integer] = js.undefined
  ): InstancesCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Assigning)) __obj.updateDynamic("Assigning")(Assigning)
    if (!js.isUndefined(Booting)) __obj.updateDynamic("Booting")(Booting)
    if (!js.isUndefined(ConnectionLost)) __obj.updateDynamic("ConnectionLost")(ConnectionLost)
    if (!js.isUndefined(Deregistering)) __obj.updateDynamic("Deregistering")(Deregistering)
    if (!js.isUndefined(Online)) __obj.updateDynamic("Online")(Online)
    if (!js.isUndefined(Pending)) __obj.updateDynamic("Pending")(Pending)
    if (!js.isUndefined(Rebooting)) __obj.updateDynamic("Rebooting")(Rebooting)
    if (!js.isUndefined(Registered)) __obj.updateDynamic("Registered")(Registered)
    if (!js.isUndefined(Registering)) __obj.updateDynamic("Registering")(Registering)
    if (!js.isUndefined(Requested)) __obj.updateDynamic("Requested")(Requested)
    if (!js.isUndefined(RunningSetup)) __obj.updateDynamic("RunningSetup")(RunningSetup)
    if (!js.isUndefined(SetupFailed)) __obj.updateDynamic("SetupFailed")(SetupFailed)
    if (!js.isUndefined(ShuttingDown)) __obj.updateDynamic("ShuttingDown")(ShuttingDown)
    if (!js.isUndefined(StartFailed)) __obj.updateDynamic("StartFailed")(StartFailed)
    if (!js.isUndefined(StopFailed)) __obj.updateDynamic("StopFailed")(StopFailed)
    if (!js.isUndefined(Stopped)) __obj.updateDynamic("Stopped")(Stopped)
    if (!js.isUndefined(Stopping)) __obj.updateDynamic("Stopping")(Stopping)
    if (!js.isUndefined(Terminated)) __obj.updateDynamic("Terminated")(Terminated)
    if (!js.isUndefined(Terminating)) __obj.updateDynamic("Terminating")(Terminating)
    if (!js.isUndefined(Unassigning)) __obj.updateDynamic("Unassigning")(Unassigning)
    __obj.asInstanceOf[InstancesCount]
  }
}

