package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomatedEncodingSettings extends StObject {
  
  /**
    * Use automated ABR to have MediaConvert set up the renditions in your ABR package for you automatically, based on characteristics of your input video. This feature optimizes video quality while minimizing the overall size of your ABR package.
    */
  var AbrSettings: js.UndefOr[AutomatedAbrSettings] = js.undefined
}
object AutomatedEncodingSettings {
  
  inline def apply(): AutomatedEncodingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomatedEncodingSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutomatedEncodingSettings] (val x: Self) extends AnyVal {
    
    inline def setAbrSettings(value: AutomatedAbrSettings): Self = StObject.set(x, "AbrSettings", value.asInstanceOf[js.Any])
    
    inline def setAbrSettingsUndefined: Self = StObject.set(x, "AbrSettings", js.undefined)
  }
}
