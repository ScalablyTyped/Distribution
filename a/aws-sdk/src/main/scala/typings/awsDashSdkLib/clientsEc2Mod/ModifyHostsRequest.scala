package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyHostsRequest extends js.Object {
  /**
    * Specify whether to enable or disable auto-placement.
    */
  var AutoPlacement: awsDashSdkLib.clientsEc2Mod.AutoPlacement
  /**
    * The IDs of the Dedicated Hosts to modify.
    */
  var HostIds: RequestHostIdList
}

object ModifyHostsRequest {
  @scala.inline
  def apply(AutoPlacement: AutoPlacement, HostIds: RequestHostIdList): ModifyHostsRequest = {
    val __obj = js.Dynamic.literal(AutoPlacement = AutoPlacement.asInstanceOf[js.Any], HostIds = HostIds)
  
    __obj.asInstanceOf[ModifyHostsRequest]
  }
}

