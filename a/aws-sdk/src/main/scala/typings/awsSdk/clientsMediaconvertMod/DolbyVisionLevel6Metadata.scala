package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DolbyVisionLevel6Metadata extends StObject {
  
  /**
    * Maximum Content Light Level. Static HDR metadata that corresponds to the brightest pixel in the entire stream. Measured in nits.
    */
  var MaxCll: js.UndefOr[integerMin0Max65535] = js.undefined
  
  /**
    * Maximum Frame-Average Light Level. Static HDR metadata that corresponds to the highest frame-average brightness in the entire stream. Measured in nits.
    */
  var MaxFall: js.UndefOr[integerMin0Max65535] = js.undefined
}
object DolbyVisionLevel6Metadata {
  
  inline def apply(): DolbyVisionLevel6Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DolbyVisionLevel6Metadata]
  }
  
  extension [Self <: DolbyVisionLevel6Metadata](x: Self) {
    
    inline def setMaxCll(value: integerMin0Max65535): Self = StObject.set(x, "MaxCll", value.asInstanceOf[js.Any])
    
    inline def setMaxCllUndefined: Self = StObject.set(x, "MaxCll", js.undefined)
    
    inline def setMaxFall(value: integerMin0Max65535): Self = StObject.set(x, "MaxFall", value.asInstanceOf[js.Any])
    
    inline def setMaxFallUndefined: Self = StObject.set(x, "MaxFall", js.undefined)
  }
}
