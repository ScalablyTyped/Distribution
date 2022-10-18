package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaPlacement extends StObject {
  
  /**
    * The audio fallback URL.
    */
  var AudioFallbackUrl: js.UndefOr[UriType] = js.undefined
  
  /**
    * The audio host URL.
    */
  var AudioHostUrl: js.UndefOr[UriType] = js.undefined
  
  /**
    * The event ingestion URL to which you send client meeting events.
    */
  var EventIngestionUrl: js.UndefOr[UriType] = js.undefined
  
  /**
    * The screen data URL.
    */
  var ScreenDataUrl: js.UndefOr[UriType] = js.undefined
  
  /**
    * The screen sharing URL.
    */
  var ScreenSharingUrl: js.UndefOr[UriType] = js.undefined
  
  /**
    * The screen viewing URL.
    */
  var ScreenViewingUrl: js.UndefOr[UriType] = js.undefined
  
  /**
    * The signaling URL.
    */
  var SignalingUrl: js.UndefOr[UriType] = js.undefined
  
  /**
    * The turn control URL.
    */
  var TurnControlUrl: js.UndefOr[UriType] = js.undefined
}
object MediaPlacement {
  
  inline def apply(): MediaPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPlacement]
  }
  
  extension [Self <: MediaPlacement](x: Self) {
    
    inline def setAudioFallbackUrl(value: UriType): Self = StObject.set(x, "AudioFallbackUrl", value.asInstanceOf[js.Any])
    
    inline def setAudioFallbackUrlUndefined: Self = StObject.set(x, "AudioFallbackUrl", js.undefined)
    
    inline def setAudioHostUrl(value: UriType): Self = StObject.set(x, "AudioHostUrl", value.asInstanceOf[js.Any])
    
    inline def setAudioHostUrlUndefined: Self = StObject.set(x, "AudioHostUrl", js.undefined)
    
    inline def setEventIngestionUrl(value: UriType): Self = StObject.set(x, "EventIngestionUrl", value.asInstanceOf[js.Any])
    
    inline def setEventIngestionUrlUndefined: Self = StObject.set(x, "EventIngestionUrl", js.undefined)
    
    inline def setScreenDataUrl(value: UriType): Self = StObject.set(x, "ScreenDataUrl", value.asInstanceOf[js.Any])
    
    inline def setScreenDataUrlUndefined: Self = StObject.set(x, "ScreenDataUrl", js.undefined)
    
    inline def setScreenSharingUrl(value: UriType): Self = StObject.set(x, "ScreenSharingUrl", value.asInstanceOf[js.Any])
    
    inline def setScreenSharingUrlUndefined: Self = StObject.set(x, "ScreenSharingUrl", js.undefined)
    
    inline def setScreenViewingUrl(value: UriType): Self = StObject.set(x, "ScreenViewingUrl", value.asInstanceOf[js.Any])
    
    inline def setScreenViewingUrlUndefined: Self = StObject.set(x, "ScreenViewingUrl", js.undefined)
    
    inline def setSignalingUrl(value: UriType): Self = StObject.set(x, "SignalingUrl", value.asInstanceOf[js.Any])
    
    inline def setSignalingUrlUndefined: Self = StObject.set(x, "SignalingUrl", js.undefined)
    
    inline def setTurnControlUrl(value: UriType): Self = StObject.set(x, "TurnControlUrl", value.asInstanceOf[js.Any])
    
    inline def setTurnControlUrlUndefined: Self = StObject.set(x, "TurnControlUrl", js.undefined)
  }
}
