package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceMinutes extends js.Object {
  /**
    * When specified, represents only the sum of metered minutes used by the resource to run tests.
    */
  var metered: js.UndefOr[Double] = js.undefined
  /**
    * When specified, represents the total minutes used by the resource to run tests.
    */
  var total: js.UndefOr[Double] = js.undefined
  /**
    * When specified, represents only the sum of unmetered minutes used by the resource to run tests.
    */
  var unmetered: js.UndefOr[Double] = js.undefined
}

object DeviceMinutes {
  @scala.inline
  def apply(
    metered: js.UndefOr[Double] = js.undefined,
    total: js.UndefOr[Double] = js.undefined,
    unmetered: js.UndefOr[Double] = js.undefined
  ): DeviceMinutes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(metered)) __obj.updateDynamic("metered")(metered)
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total)
    if (!js.isUndefined(unmetered)) __obj.updateDynamic("unmetered")(unmetered)
    __obj.asInstanceOf[DeviceMinutes]
  }
}

