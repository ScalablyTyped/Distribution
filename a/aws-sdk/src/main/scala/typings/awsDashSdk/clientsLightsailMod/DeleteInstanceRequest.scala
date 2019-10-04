package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteInstanceRequest extends js.Object {
  /**
    * A Boolean value to indicate whether to delete the enabled add-ons for the disk.
    */
  var forceDeleteAddOns: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the instance to delete.
    */
  var instanceName: ResourceName
}

object DeleteInstanceRequest {
  @scala.inline
  def apply(instanceName: ResourceName, forceDeleteAddOns: js.UndefOr[Boolean] = js.undefined): DeleteInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName)
    if (!js.isUndefined(forceDeleteAddOns)) __obj.updateDynamic("forceDeleteAddOns")(forceDeleteAddOns)
    __obj.asInstanceOf[DeleteInstanceRequest]
  }
}

