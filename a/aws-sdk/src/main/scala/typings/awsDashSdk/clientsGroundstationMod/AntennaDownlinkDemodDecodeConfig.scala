package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntennaDownlinkDemodDecodeConfig extends js.Object {
  /**
    * Information about the decode Config.
    */
  var decodeConfig: DecodeConfig = js.native
  /**
    * Information about the demodulation Config.
    */
  var demodulationConfig: DemodulationConfig = js.native
  /**
    * Information about the spectral Config.
    */
  var spectrumConfig: SpectrumConfig = js.native
}

object AntennaDownlinkDemodDecodeConfig {
  @scala.inline
  def apply(decodeConfig: DecodeConfig, demodulationConfig: DemodulationConfig, spectrumConfig: SpectrumConfig): AntennaDownlinkDemodDecodeConfig = {
    val __obj = js.Dynamic.literal(decodeConfig = decodeConfig.asInstanceOf[js.Any], demodulationConfig = demodulationConfig.asInstanceOf[js.Any], spectrumConfig = spectrumConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AntennaDownlinkDemodDecodeConfig]
  }
}

