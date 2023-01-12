package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsPlaylistSettings extends StObject {
  
  /**
    * The total duration (in seconds) of each manifest. Minimum value: 30 seconds. Maximum value: 3600 seconds.
    */
  var ManifestWindowSeconds: js.UndefOr[_Integer] = js.undefined
}
object HlsPlaylistSettings {
  
  inline def apply(): HlsPlaylistSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsPlaylistSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HlsPlaylistSettings] (val x: Self) extends AnyVal {
    
    inline def setManifestWindowSeconds(value: _Integer): Self = StObject.set(x, "ManifestWindowSeconds", value.asInstanceOf[js.Any])
    
    inline def setManifestWindowSecondsUndefined: Self = StObject.set(x, "ManifestWindowSeconds", js.undefined)
  }
}
