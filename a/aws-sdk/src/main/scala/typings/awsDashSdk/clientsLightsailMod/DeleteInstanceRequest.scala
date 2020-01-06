package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInstanceRequest extends js.Object {
  /**
    * A Boolean value to indicate whether to delete the enabled add-ons for the disk.
    */
  var forceDeleteAddOns: js.UndefOr[Boolean] = js.native
  /**
    * The name of the instance to delete.
    */
  var instanceName: ResourceName = js.native
}

object DeleteInstanceRequest {
  @scala.inline
  def apply(instanceName: ResourceName, forceDeleteAddOns: js.UndefOr[Boolean] = js.undefined): DeleteInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    if (!js.isUndefined(forceDeleteAddOns)) __obj.updateDynamic("forceDeleteAddOns")(forceDeleteAddOns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstanceRequest]
  }
}

