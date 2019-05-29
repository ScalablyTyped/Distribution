package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpectrumConfig extends js.Object {
  /**
    * Bandwidth of a spectral Config.
    */
  var bandwidth: FrequencyBandwidth
  /**
    * Center frequency of a spectral Config.
    */
  var centerFrequency: Frequency
  /**
    * Polarization of a spectral Config.
    */
  var polarization: js.UndefOr[Polarization] = js.undefined
}

object SpectrumConfig {
  @scala.inline
  def apply(bandwidth: FrequencyBandwidth, centerFrequency: Frequency, polarization: Polarization = null): SpectrumConfig = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth, centerFrequency = centerFrequency)
    if (polarization != null) __obj.updateDynamic("polarization")(polarization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpectrumConfig]
  }
}

