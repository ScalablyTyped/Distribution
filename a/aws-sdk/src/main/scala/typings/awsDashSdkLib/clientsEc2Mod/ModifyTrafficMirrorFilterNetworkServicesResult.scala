package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyTrafficMirrorFilterNetworkServicesResult extends js.Object {
  /**
    * The Traffic Mirror filter that the network service is associated with.
    */
  var TrafficMirrorFilter: js.UndefOr[TrafficMirrorFilter] = js.undefined
}

object ModifyTrafficMirrorFilterNetworkServicesResult {
  @scala.inline
  def apply(TrafficMirrorFilter: TrafficMirrorFilter = null): ModifyTrafficMirrorFilterNetworkServicesResult = {
    val __obj = js.Dynamic.literal()
    if (TrafficMirrorFilter != null) __obj.updateDynamic("TrafficMirrorFilter")(TrafficMirrorFilter)
    __obj.asInstanceOf[ModifyTrafficMirrorFilterNetworkServicesResult]
  }
}

