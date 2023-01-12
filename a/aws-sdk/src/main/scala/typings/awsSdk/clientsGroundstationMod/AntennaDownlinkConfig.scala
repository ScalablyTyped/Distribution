package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AntennaDownlinkConfig extends StObject {
  
  /**
    * Object that describes a spectral Config.
    */
  var spectrumConfig: SpectrumConfig
}
object AntennaDownlinkConfig {
  
  inline def apply(spectrumConfig: SpectrumConfig): AntennaDownlinkConfig = {
    val __obj = js.Dynamic.literal(spectrumConfig = spectrumConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntennaDownlinkConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AntennaDownlinkConfig] (val x: Self) extends AnyVal {
    
    inline def setSpectrumConfig(value: SpectrumConfig): Self = StObject.set(x, "spectrumConfig", value.asInstanceOf[js.Any])
  }
}
