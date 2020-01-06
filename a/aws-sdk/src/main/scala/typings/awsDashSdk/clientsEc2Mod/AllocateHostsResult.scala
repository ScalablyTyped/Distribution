package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateHostsResult extends js.Object {
  /**
    * The ID of the allocated Dedicated Host. This is used to launch an instance onto a specific host.
    */
  var HostIds: js.UndefOr[ResponseHostIdList] = js.native
}

object AllocateHostsResult {
  @scala.inline
  def apply(HostIds: ResponseHostIdList = null): AllocateHostsResult = {
    val __obj = js.Dynamic.literal()
    if (HostIds != null) __obj.updateDynamic("HostIds")(HostIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateHostsResult]
  }
}

