package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseHostsRequest extends js.Object {
  /**
    * The IDs of the Dedicated Hosts to release.
    */
  var HostIds: RequestHostIdList
}

object ReleaseHostsRequest {
  @scala.inline
  def apply(HostIds: RequestHostIdList): ReleaseHostsRequest = {
    val __obj = js.Dynamic.literal(HostIds = HostIds)
  
    __obj.asInstanceOf[ReleaseHostsRequest]
  }
}

