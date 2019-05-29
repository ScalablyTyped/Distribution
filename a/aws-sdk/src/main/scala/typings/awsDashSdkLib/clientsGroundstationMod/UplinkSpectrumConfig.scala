package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UplinkSpectrumConfig extends js.Object {
  /**
    * Center frequency of an uplink spectral Config.
    */
  var centerFrequency: Frequency
  /**
    * Polarization of an uplink spectral Config.
    */
  var polarization: js.UndefOr[Polarization] = js.undefined
}

object UplinkSpectrumConfig {
  @scala.inline
  def apply(centerFrequency: Frequency, polarization: Polarization = null): UplinkSpectrumConfig = {
    val __obj = js.Dynamic.literal(centerFrequency = centerFrequency)
    if (polarization != null) __obj.updateDynamic("polarization")(polarization.asInstanceOf[js.Any])
    __obj.asInstanceOf[UplinkSpectrumConfig]
  }
}

