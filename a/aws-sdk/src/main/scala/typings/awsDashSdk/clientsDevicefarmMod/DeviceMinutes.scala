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
    metered: Int | scala.Double = null,
    total: Int | scala.Double = null,
    unmetered: Int | scala.Double = null
  ): DeviceMinutes = {
    val __obj = js.Dynamic.literal()
    if (metered != null) __obj.updateDynamic("metered")(metered.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (unmetered != null) __obj.updateDynamic("unmetered")(unmetered.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMinutes]
  }
}

