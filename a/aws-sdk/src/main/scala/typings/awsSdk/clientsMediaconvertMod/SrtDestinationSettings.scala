package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SrtDestinationSettings extends StObject {
  
  /**
    * Set Style passthrough (StylePassthrough) to ENABLED to use the available style, color, and position information from your input captions. MediaConvert uses default settings for any missing style and position information in your input captions. Set Style passthrough to DISABLED, or leave blank, to ignore the style and position information from your input captions and use simplified output captions.
    */
  var StylePassthrough: js.UndefOr[SrtStylePassthrough] = js.undefined
}
object SrtDestinationSettings {
  
  inline def apply(): SrtDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SrtDestinationSettings]
  }
  
  extension [Self <: SrtDestinationSettings](x: Self) {
    
    inline def setStylePassthrough(value: SrtStylePassthrough): Self = StObject.set(x, "StylePassthrough", value.asInstanceOf[js.Any])
    
    inline def setStylePassthroughUndefined: Self = StObject.set(x, "StylePassthrough", js.undefined)
  }
}
