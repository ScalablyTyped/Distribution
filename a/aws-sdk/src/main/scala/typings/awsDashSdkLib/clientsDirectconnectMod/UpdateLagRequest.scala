package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateLagRequest extends js.Object {
  /**
    * The ID of the LAG.
    */
  var lagId: LagId
  /**
    * The name of the LAG.
    */
  var lagName: js.UndefOr[LagName] = js.undefined
  /**
    * The minimum number of physical connections that must be operational for the LAG itself to be operational.
    */
  var minimumLinks: js.UndefOr[Count] = js.undefined
}

object UpdateLagRequest {
  @scala.inline
  def apply(lagId: LagId, lagName: LagName = null, minimumLinks: js.UndefOr[Count] = js.undefined): UpdateLagRequest = {
    val __obj = js.Dynamic.literal(lagId = lagId)
    if (lagName != null) __obj.updateDynamic("lagName")(lagName)
    if (!js.isUndefined(minimumLinks)) __obj.updateDynamic("minimumLinks")(minimumLinks)
    __obj.asInstanceOf[UpdateLagRequest]
  }
}

