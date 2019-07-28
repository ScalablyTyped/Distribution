package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntennaUplinkConfig extends js.Object {
  /**
    * Information about the uplink spectral Config.
    */
  var spectrumConfig: UplinkSpectrumConfig
  /**
    * EIRP of the target.
    */
  var targetEirp: Eirp
}

object AntennaUplinkConfig {
  @scala.inline
  def apply(spectrumConfig: UplinkSpectrumConfig, targetEirp: Eirp): AntennaUplinkConfig = {
    val __obj = js.Dynamic.literal(spectrumConfig = spectrumConfig, targetEirp = targetEirp)
  
    __obj.asInstanceOf[AntennaUplinkConfig]
  }
}

