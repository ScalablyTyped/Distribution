package typings.awsSdk.clientsMediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CmafPackageCreateOrUpdateParameters extends StObject {
  
  var Encryption: js.UndefOr[CmafEncryption] = js.undefined
  
  /**
    * A list of HLS manifest configurations
    */
  var HlsManifests: js.UndefOr[listOfHlsManifestCreateOrUpdateParameters] = js.undefined
  
  /**
    * Duration (in seconds) of each segment. Actual segments will be
  rounded to the nearest multiple of the source segment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.undefined
  
  /**
    * An optional custom string that is prepended to the name of each segment. If not specified, it defaults to the ChannelId.
    */
  var SegmentPrefix: js.UndefOr[string] = js.undefined
  
  var StreamSelection: js.UndefOr[typings.awsSdk.clientsMediapackageMod.StreamSelection] = js.undefined
}
object CmafPackageCreateOrUpdateParameters {
  
  inline def apply(): CmafPackageCreateOrUpdateParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CmafPackageCreateOrUpdateParameters]
  }
  
  extension [Self <: CmafPackageCreateOrUpdateParameters](x: Self) {
    
    inline def setEncryption(value: CmafEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setHlsManifests(value: listOfHlsManifestCreateOrUpdateParameters): Self = StObject.set(x, "HlsManifests", value.asInstanceOf[js.Any])
    
    inline def setHlsManifestsUndefined: Self = StObject.set(x, "HlsManifests", js.undefined)
    
    inline def setHlsManifestsVarargs(value: HlsManifestCreateOrUpdateParameters*): Self = StObject.set(x, "HlsManifests", js.Array(value*))
    
    inline def setSegmentDurationSeconds(value: integer): Self = StObject.set(x, "SegmentDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setSegmentDurationSecondsUndefined: Self = StObject.set(x, "SegmentDurationSeconds", js.undefined)
    
    inline def setSegmentPrefix(value: string): Self = StObject.set(x, "SegmentPrefix", value.asInstanceOf[js.Any])
    
    inline def setSegmentPrefixUndefined: Self = StObject.set(x, "SegmentPrefix", js.undefined)
    
    inline def setStreamSelection(value: StreamSelection): Self = StObject.set(x, "StreamSelection", value.asInstanceOf[js.Any])
    
    inline def setStreamSelectionUndefined: Self = StObject.set(x, "StreamSelection", js.undefined)
  }
}
