package typings.awsSdk.clientsMediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MssPackage extends StObject {
  
  var Encryption: js.UndefOr[MssEncryption] = js.undefined
  
  /**
    * The time window (in seconds) contained in each manifest.
    */
  var ManifestWindowSeconds: js.UndefOr[integer] = js.undefined
  
  /**
    * The duration (in seconds) of each segment.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.undefined
  
  var StreamSelection: js.UndefOr[typings.awsSdk.clientsMediapackageMod.StreamSelection] = js.undefined
}
object MssPackage {
  
  inline def apply(): MssPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MssPackage]
  }
  
  extension [Self <: MssPackage](x: Self) {
    
    inline def setEncryption(value: MssEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setManifestWindowSeconds(value: integer): Self = StObject.set(x, "ManifestWindowSeconds", value.asInstanceOf[js.Any])
    
    inline def setManifestWindowSecondsUndefined: Self = StObject.set(x, "ManifestWindowSeconds", js.undefined)
    
    inline def setSegmentDurationSeconds(value: integer): Self = StObject.set(x, "SegmentDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setSegmentDurationSecondsUndefined: Self = StObject.set(x, "SegmentDurationSeconds", js.undefined)
    
    inline def setStreamSelection(value: StreamSelection): Self = StObject.set(x, "StreamSelection", value.asInstanceOf[js.Any])
    
    inline def setStreamSelectionUndefined: Self = StObject.set(x, "StreamSelection", js.undefined)
  }
}
