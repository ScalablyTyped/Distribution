package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebvttDestinationSettings extends StObject {
  
  /**
    * Set Accessibility subtitles to Enabled if the ISMC or WebVTT captions track is intended to provide accessibility for people who are deaf or hard of hearing. When you enable this feature, MediaConvert adds the following attributes under EXT-X-MEDIA in the HLS or CMAF manifest for this track: CHARACTERISTICS="public.accessibility.describes-spoken-dialog,public.accessibility.describes-music-and-sound" and AUTOSELECT="YES". Keep the default value, Disabled, if the captions track is not intended to provide such accessibility. MediaConvert will not add the above attributes.
    */
  var Accessibility: js.UndefOr[WebvttAccessibilitySubs] = js.undefined
  
  /**
    * To use the available style, color, and position information from your input captions: Set Style passthrough (stylePassthrough) to Enabled (ENABLED). MediaConvert uses default settings when style and position information is missing from your input captions. To recreate the input captions exactly: Set Style passthrough to Strict (STRICT). MediaConvert automatically applies timing adjustments, including adjustments for frame rate conversion, ad avails, and input clipping. Your input captions format must be WebVTT. To ignore the style and position information from your input captions and use simplified output captions: Set Style passthrough to Disabled (DISABLED), or leave blank.
    */
  var StylePassthrough: js.UndefOr[WebvttStylePassthrough] = js.undefined
}
object WebvttDestinationSettings {
  
  inline def apply(): WebvttDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebvttDestinationSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebvttDestinationSettings] (val x: Self) extends AnyVal {
    
    inline def setAccessibility(value: WebvttAccessibilitySubs): Self = StObject.set(x, "Accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "Accessibility", js.undefined)
    
    inline def setStylePassthrough(value: WebvttStylePassthrough): Self = StObject.set(x, "StylePassthrough", value.asInstanceOf[js.Any])
    
    inline def setStylePassthroughUndefined: Self = StObject.set(x, "StylePassthrough", js.undefined)
  }
}
