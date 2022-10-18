package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaPlacement extends StObject {
  
  /**
    * The audio fallback URL.
    */
  var AudioFallbackUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The audio host URL.
    */
  var AudioHostUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The event ingestion URL.
    */
  var EventIngestionUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The screen data URL.
    */
  var ScreenDataUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The screen sharing URL.
    */
  var ScreenSharingUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The screen viewing URL.
    */
  var ScreenViewingUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The signaling URL.
    */
  var SignalingUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The turn control URL.
    */
  var TurnControlUrl: js.UndefOr[String] = js.undefined
}
object MediaPlacement {
  
  inline def apply(): MediaPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPlacement]
  }
  
  extension [Self <: MediaPlacement](x: Self) {
    
    inline def setAudioFallbackUrl(value: String): Self = StObject.set(x, "AudioFallbackUrl", value.asInstanceOf[js.Any])
    
    inline def setAudioFallbackUrlUndefined: Self = StObject.set(x, "AudioFallbackUrl", js.undefined)
    
    inline def setAudioHostUrl(value: String): Self = StObject.set(x, "AudioHostUrl", value.asInstanceOf[js.Any])
    
    inline def setAudioHostUrlUndefined: Self = StObject.set(x, "AudioHostUrl", js.undefined)
    
    inline def setEventIngestionUrl(value: String): Self = StObject.set(x, "EventIngestionUrl", value.asInstanceOf[js.Any])
    
    inline def setEventIngestionUrlUndefined: Self = StObject.set(x, "EventIngestionUrl", js.undefined)
    
    inline def setScreenDataUrl(value: String): Self = StObject.set(x, "ScreenDataUrl", value.asInstanceOf[js.Any])
    
    inline def setScreenDataUrlUndefined: Self = StObject.set(x, "ScreenDataUrl", js.undefined)
    
    inline def setScreenSharingUrl(value: String): Self = StObject.set(x, "ScreenSharingUrl", value.asInstanceOf[js.Any])
    
    inline def setScreenSharingUrlUndefined: Self = StObject.set(x, "ScreenSharingUrl", js.undefined)
    
    inline def setScreenViewingUrl(value: String): Self = StObject.set(x, "ScreenViewingUrl", value.asInstanceOf[js.Any])
    
    inline def setScreenViewingUrlUndefined: Self = StObject.set(x, "ScreenViewingUrl", js.undefined)
    
    inline def setSignalingUrl(value: String): Self = StObject.set(x, "SignalingUrl", value.asInstanceOf[js.Any])
    
    inline def setSignalingUrlUndefined: Self = StObject.set(x, "SignalingUrl", js.undefined)
    
    inline def setTurnControlUrl(value: String): Self = StObject.set(x, "TurnControlUrl", value.asInstanceOf[js.Any])
    
    inline def setTurnControlUrlUndefined: Self = StObject.set(x, "TurnControlUrl", js.undefined)
  }
}
