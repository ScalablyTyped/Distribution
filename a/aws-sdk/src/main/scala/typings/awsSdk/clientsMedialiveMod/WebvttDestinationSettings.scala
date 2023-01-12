package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebvttDestinationSettings extends StObject {
  
  /**
    * Controls whether the color and position of the source captions is passed through to the WebVTT output captions.  PASSTHROUGH - Valid only if the source captions are EMBEDDED or TELETEXT.  NO_STYLE_DATA - Don't pass through the style. The output captions will not contain any font styling information.
    */
  var StyleControl: js.UndefOr[WebvttDestinationStyleControl] = js.undefined
}
object WebvttDestinationSettings {
  
  inline def apply(): WebvttDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebvttDestinationSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebvttDestinationSettings] (val x: Self) extends AnyVal {
    
    inline def setStyleControl(value: WebvttDestinationStyleControl): Self = StObject.set(x, "StyleControl", value.asInstanceOf[js.Any])
    
    inline def setStyleControlUndefined: Self = StObject.set(x, "StyleControl", js.undefined)
  }
}
