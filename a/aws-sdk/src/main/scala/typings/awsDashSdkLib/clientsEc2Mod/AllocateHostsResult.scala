package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllocateHostsResult extends js.Object {
  /**
    * The ID of the allocated Dedicated Host. This is used to launch an instance onto a specific host.
    */
  var HostIds: js.UndefOr[ResponseHostIdList] = js.undefined
}

object AllocateHostsResult {
  @scala.inline
  def apply(HostIds: ResponseHostIdList = null): AllocateHostsResult = {
    val __obj = js.Dynamic.literal()
    if (HostIds != null) __obj.updateDynamic("HostIds")(HostIds)
    __obj.asInstanceOf[AllocateHostsResult]
  }
}

