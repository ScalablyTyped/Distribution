package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyHostsRequest extends js.Object {
  /**
    * Specify whether to enable or disable auto-placement.
    */
  var AutoPlacement: js.UndefOr[AutoPlacement] = js.undefined
  /**
    * The IDs of the Dedicated Hosts to modify.
    */
  var HostIds: RequestHostIdList
  /**
    * Indicates whether to enable or disable host recovery for the Dedicated Host. For more information, see  Host Recovery in the Amazon Elastic Compute Cloud User Guide.
    */
  var HostRecovery: js.UndefOr[HostRecovery] = js.undefined
}

object ModifyHostsRequest {
  @scala.inline
  def apply(HostIds: RequestHostIdList, AutoPlacement: AutoPlacement = null, HostRecovery: HostRecovery = null): ModifyHostsRequest = {
    val __obj = js.Dynamic.literal(HostIds = HostIds)
    if (AutoPlacement != null) __obj.updateDynamic("AutoPlacement")(AutoPlacement.asInstanceOf[js.Any])
    if (HostRecovery != null) __obj.updateDynamic("HostRecovery")(HostRecovery.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyHostsRequest]
  }
}

