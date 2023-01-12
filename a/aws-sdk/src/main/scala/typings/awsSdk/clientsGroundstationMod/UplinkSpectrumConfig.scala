package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UplinkSpectrumConfig extends StObject {
  
  /**
    * Center frequency of an uplink spectral Config. Valid values are between 2025 to 2120 MHz.
    */
  var centerFrequency: Frequency
  
  /**
    * Polarization of an uplink spectral Config. Capturing both "RIGHT_HAND" and "LEFT_HAND" polarization requires two separate configs.
    */
  var polarization: js.UndefOr[Polarization] = js.undefined
}
object UplinkSpectrumConfig {
  
  inline def apply(centerFrequency: Frequency): UplinkSpectrumConfig = {
    val __obj = js.Dynamic.literal(centerFrequency = centerFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[UplinkSpectrumConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UplinkSpectrumConfig] (val x: Self) extends AnyVal {
    
    inline def setCenterFrequency(value: Frequency): Self = StObject.set(x, "centerFrequency", value.asInstanceOf[js.Any])
    
    inline def setPolarization(value: Polarization): Self = StObject.set(x, "polarization", value.asInstanceOf[js.Any])
    
    inline def setPolarizationUndefined: Self = StObject.set(x, "polarization", js.undefined)
  }
}
