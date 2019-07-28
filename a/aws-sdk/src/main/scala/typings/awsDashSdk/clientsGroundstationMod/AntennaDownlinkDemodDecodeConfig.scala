package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntennaDownlinkDemodDecodeConfig extends js.Object {
  /**
    * Information about the decode Config.
    */
  var decodeConfig: DecodeConfig
  /**
    * Information about the demodulation Config.
    */
  var demodulationConfig: DemodulationConfig
  /**
    * Information about the spectral Config.
    */
  var spectrumConfig: SpectrumConfig
}

object AntennaDownlinkDemodDecodeConfig {
  @scala.inline
  def apply(decodeConfig: DecodeConfig, demodulationConfig: DemodulationConfig, spectrumConfig: SpectrumConfig): AntennaDownlinkDemodDecodeConfig = {
    val __obj = js.Dynamic.literal(decodeConfig = decodeConfig, demodulationConfig = demodulationConfig, spectrumConfig = spectrumConfig)
  
    __obj.asInstanceOf[AntennaDownlinkDemodDecodeConfig]
  }
}

