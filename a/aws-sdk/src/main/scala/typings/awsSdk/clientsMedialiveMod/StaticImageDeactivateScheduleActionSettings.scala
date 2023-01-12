package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticImageDeactivateScheduleActionSettings extends StObject {
  
  /**
    * The time in milliseconds for the image to fade out. Default is 0 (no fade-out).
    */
  var FadeOut: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * The image overlay layer to deactivate, 0 to 7. Default is 0.
    */
  var Layer: js.UndefOr[integerMin0Max7] = js.undefined
}
object StaticImageDeactivateScheduleActionSettings {
  
  inline def apply(): StaticImageDeactivateScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticImageDeactivateScheduleActionSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaticImageDeactivateScheduleActionSettings] (val x: Self) extends AnyVal {
    
    inline def setFadeOut(value: integerMin0): Self = StObject.set(x, "FadeOut", value.asInstanceOf[js.Any])
    
    inline def setFadeOutUndefined: Self = StObject.set(x, "FadeOut", js.undefined)
    
    inline def setLayer(value: integerMin0Max7): Self = StObject.set(x, "Layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "Layer", js.undefined)
  }
}
