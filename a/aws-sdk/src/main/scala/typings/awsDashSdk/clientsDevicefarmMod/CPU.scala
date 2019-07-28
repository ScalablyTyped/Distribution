package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPU extends js.Object {
  /**
    * The CPU's architecture, for example x86 or ARM.
    */
  var architecture: js.UndefOr[String] = js.undefined
  /**
    * The clock speed of the device's CPU, expressed in hertz (Hz). For example, a 1.2 GHz CPU is expressed as 1200000000.
    */
  var clock: js.UndefOr[Double] = js.undefined
  /**
    * The CPU's frequency.
    */
  var frequency: js.UndefOr[String] = js.undefined
}

object CPU {
  @scala.inline
  def apply(architecture: String = null, clock: js.UndefOr[Double] = js.undefined, frequency: String = null): CPU = {
    val __obj = js.Dynamic.literal()
    if (architecture != null) __obj.updateDynamic("architecture")(architecture)
    if (!js.isUndefined(clock)) __obj.updateDynamic("clock")(clock)
    if (frequency != null) __obj.updateDynamic("frequency")(frequency)
    __obj.asInstanceOf[CPU]
  }
}

