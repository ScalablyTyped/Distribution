package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntennaDownlinkConfig extends js.Object {
  /**
    * Object that describes a spectral Config.
    */
  var spectrumConfig: SpectrumConfig
}

object AntennaDownlinkConfig {
  @scala.inline
  def apply(spectrumConfig: SpectrumConfig): AntennaDownlinkConfig = {
    val __obj = js.Dynamic.literal(spectrumConfig = spectrumConfig)
  
    __obj.asInstanceOf[AntennaDownlinkConfig]
  }
}

