package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashPlaylistSettings extends StObject {
  
  /**
    * The total duration (in seconds) of each manifest. Minimum value: 30 seconds. Maximum value: 3600 seconds.
    */
  var ManifestWindowSeconds: js.UndefOr[_Integer] = js.undefined
  
  /**
    * Minimum amount of content (measured in seconds) that a player must keep available in the buffer. Minimum value: 2 seconds. Maximum value: 60 seconds.
    */
  var MinBufferTimeSeconds: js.UndefOr[_Integer] = js.undefined
  
  /**
    * Minimum amount of time (in seconds) that the player should wait before requesting updates to the manifest. Minimum value: 2 seconds. Maximum value: 60 seconds.
    */
  var MinUpdatePeriodSeconds: js.UndefOr[_Integer] = js.undefined
  
  /**
    * Amount of time (in seconds) that the player should be from the live point at the end of the manifest. Minimum value: 2 seconds. Maximum value: 60 seconds.
    */
  var SuggestedPresentationDelaySeconds: js.UndefOr[_Integer] = js.undefined
}
object DashPlaylistSettings {
  
  inline def apply(): DashPlaylistSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashPlaylistSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DashPlaylistSettings] (val x: Self) extends AnyVal {
    
    inline def setManifestWindowSeconds(value: _Integer): Self = StObject.set(x, "ManifestWindowSeconds", value.asInstanceOf[js.Any])
    
    inline def setManifestWindowSecondsUndefined: Self = StObject.set(x, "ManifestWindowSeconds", js.undefined)
    
    inline def setMinBufferTimeSeconds(value: _Integer): Self = StObject.set(x, "MinBufferTimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setMinBufferTimeSecondsUndefined: Self = StObject.set(x, "MinBufferTimeSeconds", js.undefined)
    
    inline def setMinUpdatePeriodSeconds(value: _Integer): Self = StObject.set(x, "MinUpdatePeriodSeconds", value.asInstanceOf[js.Any])
    
    inline def setMinUpdatePeriodSecondsUndefined: Self = StObject.set(x, "MinUpdatePeriodSeconds", js.undefined)
    
    inline def setSuggestedPresentationDelaySeconds(value: _Integer): Self = StObject.set(x, "SuggestedPresentationDelaySeconds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedPresentationDelaySecondsUndefined: Self = StObject.set(x, "SuggestedPresentationDelaySeconds", js.undefined)
  }
}
