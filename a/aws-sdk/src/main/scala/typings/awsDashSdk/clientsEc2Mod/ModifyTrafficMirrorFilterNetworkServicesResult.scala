package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyTrafficMirrorFilterNetworkServicesResult extends js.Object {
  /**
    * The Traffic Mirror filter that the network service is associated with.
    */
  var TrafficMirrorFilter: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TrafficMirrorFilter] = js.native
}

object ModifyTrafficMirrorFilterNetworkServicesResult {
  @scala.inline
  def apply(TrafficMirrorFilter: TrafficMirrorFilter = null): ModifyTrafficMirrorFilterNetworkServicesResult = {
    val __obj = js.Dynamic.literal()
    if (TrafficMirrorFilter != null) __obj.updateDynamic("TrafficMirrorFilter")(TrafficMirrorFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTrafficMirrorFilterNetworkServicesResult]
  }
}

