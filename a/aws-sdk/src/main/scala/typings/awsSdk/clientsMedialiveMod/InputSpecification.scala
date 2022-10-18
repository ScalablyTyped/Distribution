package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputSpecification extends StObject {
  
  /**
    * Input codec
    */
  var Codec: js.UndefOr[InputCodec] = js.undefined
  
  /**
    * Maximum input bitrate, categorized coarsely
    */
  var MaximumBitrate: js.UndefOr[InputMaximumBitrate] = js.undefined
  
  /**
    * Input resolution, categorized coarsely
    */
  var Resolution: js.UndefOr[InputResolution] = js.undefined
}
object InputSpecification {
  
  inline def apply(): InputSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSpecification]
  }
  
  extension [Self <: InputSpecification](x: Self) {
    
    inline def setCodec(value: InputCodec): Self = StObject.set(x, "Codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "Codec", js.undefined)
    
    inline def setMaximumBitrate(value: InputMaximumBitrate): Self = StObject.set(x, "MaximumBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaximumBitrateUndefined: Self = StObject.set(x, "MaximumBitrate", js.undefined)
    
    inline def setResolution(value: InputResolution): Self = StObject.set(x, "Resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "Resolution", js.undefined)
  }
}
