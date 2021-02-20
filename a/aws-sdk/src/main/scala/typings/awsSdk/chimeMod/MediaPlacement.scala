package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaPlacement extends StObject {
  
  /**
    * The audio fallback URL.
    */
  var AudioFallbackUrl: js.UndefOr[UriType] = js.native
  
  /**
    * The audio host URL.
    */
  var AudioHostUrl: js.UndefOr[UriType] = js.native
  
  /**
    * The screen data URL.
    */
  var ScreenDataUrl: js.UndefOr[UriType] = js.native
  
  /**
    * The screen sharing URL.
    */
  var ScreenSharingUrl: js.UndefOr[UriType] = js.native
  
  /**
    * The screen viewing URL.
    */
  var ScreenViewingUrl: js.UndefOr[UriType] = js.native
  
  /**
    * The signaling URL.
    */
  var SignalingUrl: js.UndefOr[UriType] = js.native
  
  /**
    * The turn control URL.
    */
  var TurnControlUrl: js.UndefOr[UriType] = js.native
}
object MediaPlacement {
  
  @scala.inline
  def apply(): MediaPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPlacement]
  }
  
  @scala.inline
  implicit class MediaPlacementMutableBuilder[Self <: MediaPlacement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioFallbackUrl(value: UriType): Self = StObject.set(x, "AudioFallbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioFallbackUrlUndefined: Self = StObject.set(x, "AudioFallbackUrl", js.undefined)
    
    @scala.inline
    def setAudioHostUrl(value: UriType): Self = StObject.set(x, "AudioHostUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioHostUrlUndefined: Self = StObject.set(x, "AudioHostUrl", js.undefined)
    
    @scala.inline
    def setScreenDataUrl(value: UriType): Self = StObject.set(x, "ScreenDataUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenDataUrlUndefined: Self = StObject.set(x, "ScreenDataUrl", js.undefined)
    
    @scala.inline
    def setScreenSharingUrl(value: UriType): Self = StObject.set(x, "ScreenSharingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenSharingUrlUndefined: Self = StObject.set(x, "ScreenSharingUrl", js.undefined)
    
    @scala.inline
    def setScreenViewingUrl(value: UriType): Self = StObject.set(x, "ScreenViewingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenViewingUrlUndefined: Self = StObject.set(x, "ScreenViewingUrl", js.undefined)
    
    @scala.inline
    def setSignalingUrl(value: UriType): Self = StObject.set(x, "SignalingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalingUrlUndefined: Self = StObject.set(x, "SignalingUrl", js.undefined)
    
    @scala.inline
    def setTurnControlUrl(value: UriType): Self = StObject.set(x, "TurnControlUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTurnControlUrlUndefined: Self = StObject.set(x, "TurnControlUrl", js.undefined)
  }
}
