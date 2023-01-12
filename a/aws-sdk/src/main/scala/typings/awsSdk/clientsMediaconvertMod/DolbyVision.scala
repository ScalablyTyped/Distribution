package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DolbyVision extends StObject {
  
  /**
    * Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to override the MaxCLL and MaxFALL values in your input with new values.
    */
  var L6Metadata: js.UndefOr[DolbyVisionLevel6Metadata] = js.undefined
  
  /**
    * Use Dolby Vision Mode to choose how the service will handle Dolby Vision MaxCLL and MaxFALL properies.
    */
  var L6Mode: js.UndefOr[DolbyVisionLevel6Mode] = js.undefined
  
  /**
    * Required when you set Dolby Vision Profile to Profile 8.1. When you set Content mapping to None, content mapping is not applied to the HDR10-compatible signal. Depending on the source peak nit level, clipping might occur on HDR devices without Dolby Vision. When you set Content mapping to HDR10 1000, the transcoder creates a 1,000 nits peak HDR10-compatible signal by applying static content mapping to the source. This mode is speed-optimized for PQ10 sources with metadata that is created from analysis. For graded Dolby Vision content, be aware that creative intent might not be guaranteed with extreme 1,000 nits trims.
    */
  var Mapping: js.UndefOr[DolbyVisionMapping] = js.undefined
  
  /**
    * Required when you enable Dolby Vision. Use Profile 5 to include frame-interleaved Dolby Vision metadata in your output. Your input must include Dolby Vision metadata or an HDR10 YUV color space. Use Profile 8.1 to include frame-interleaved Dolby Vision metadata and HDR10 metadata in your output. Your input must include Dolby Vision metadata.
    */
  var Profile: js.UndefOr[DolbyVisionProfile] = js.undefined
}
object DolbyVision {
  
  inline def apply(): DolbyVision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DolbyVision]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DolbyVision] (val x: Self) extends AnyVal {
    
    inline def setL6Metadata(value: DolbyVisionLevel6Metadata): Self = StObject.set(x, "L6Metadata", value.asInstanceOf[js.Any])
    
    inline def setL6MetadataUndefined: Self = StObject.set(x, "L6Metadata", js.undefined)
    
    inline def setL6Mode(value: DolbyVisionLevel6Mode): Self = StObject.set(x, "L6Mode", value.asInstanceOf[js.Any])
    
    inline def setL6ModeUndefined: Self = StObject.set(x, "L6Mode", js.undefined)
    
    inline def setMapping(value: DolbyVisionMapping): Self = StObject.set(x, "Mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "Mapping", js.undefined)
    
    inline def setProfile(value: DolbyVisionProfile): Self = StObject.set(x, "Profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "Profile", js.undefined)
  }
}
