package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyTrafficMirrorFilterNetworkServicesRequest extends js.Object {
  /**
    * The network service, for example Amazon DNS, that you want to mirror.
    */
  var AddNetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The network service, for example Amazon DNS, that you no longer want to mirror.
    */
  var RemoveNetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList] = js.undefined
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: String
}

object ModifyTrafficMirrorFilterNetworkServicesRequest {
  @scala.inline
  def apply(
    TrafficMirrorFilterId: String,
    AddNetworkServices: TrafficMirrorNetworkServiceList = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    RemoveNetworkServices: TrafficMirrorNetworkServiceList = null
  ): ModifyTrafficMirrorFilterNetworkServicesRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorFilterId = TrafficMirrorFilterId)
    if (AddNetworkServices != null) __obj.updateDynamic("AddNetworkServices")(AddNetworkServices)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (RemoveNetworkServices != null) __obj.updateDynamic("RemoveNetworkServices")(RemoveNetworkServices)
    __obj.asInstanceOf[ModifyTrafficMirrorFilterNetworkServicesRequest]
  }
}

