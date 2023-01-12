package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CmafPackage extends StObject {
  
  var Encryption: js.UndefOr[CmafEncryption] = js.undefined
  
  /**
    * A list of HLS manifest configurations.
    */
  var HlsManifests: listOfHlsManifest
  
  /**
    * When includeEncoderConfigurationInSegments is set to true, MediaPackage places your encoder's Sequence Parameter Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment instead of in the init fragment. This lets you use different SPS/PPS/VPS settings for your assets during content playback.
    */
  var IncludeEncoderConfigurationInSegments: js.UndefOr[boolean] = js.undefined
  
  /**
    * Duration (in seconds) of each fragment. Actual fragments will be
  rounded to the nearest multiple of the source fragment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.undefined
}
object CmafPackage {
  
  inline def apply(HlsManifests: listOfHlsManifest): CmafPackage = {
    val __obj = js.Dynamic.literal(HlsManifests = HlsManifests.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmafPackage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CmafPackage] (val x: Self) extends AnyVal {
    
    inline def setEncryption(value: CmafEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setHlsManifests(value: listOfHlsManifest): Self = StObject.set(x, "HlsManifests", value.asInstanceOf[js.Any])
    
    inline def setHlsManifestsVarargs(value: HlsManifest*): Self = StObject.set(x, "HlsManifests", js.Array(value*))
    
    inline def setIncludeEncoderConfigurationInSegments(value: boolean): Self = StObject.set(x, "IncludeEncoderConfigurationInSegments", value.asInstanceOf[js.Any])
    
    inline def setIncludeEncoderConfigurationInSegmentsUndefined: Self = StObject.set(x, "IncludeEncoderConfigurationInSegments", js.undefined)
    
    inline def setSegmentDurationSeconds(value: integer): Self = StObject.set(x, "SegmentDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setSegmentDurationSecondsUndefined: Self = StObject.set(x, "SegmentDurationSeconds", js.undefined)
  }
}
