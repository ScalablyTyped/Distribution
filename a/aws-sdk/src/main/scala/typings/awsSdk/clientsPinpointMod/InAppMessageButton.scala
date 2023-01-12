package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppMessageButton extends StObject {
  
  /**
    * Default button content.
    */
  var Android: js.UndefOr[OverrideButtonConfiguration] = js.undefined
  
  /**
    * Default button content.
    */
  var DefaultConfig: js.UndefOr[DefaultButtonConfiguration] = js.undefined
  
  /**
    * Default button content.
    */
  var IOS: js.UndefOr[OverrideButtonConfiguration] = js.undefined
  
  /**
    * Default button content.
    */
  var Web: js.UndefOr[OverrideButtonConfiguration] = js.undefined
}
object InAppMessageButton {
  
  inline def apply(): InAppMessageButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InAppMessageButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InAppMessageButton] (val x: Self) extends AnyVal {
    
    inline def setAndroid(value: OverrideButtonConfiguration): Self = StObject.set(x, "Android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "Android", js.undefined)
    
    inline def setDefaultConfig(value: DefaultButtonConfiguration): Self = StObject.set(x, "DefaultConfig", value.asInstanceOf[js.Any])
    
    inline def setDefaultConfigUndefined: Self = StObject.set(x, "DefaultConfig", js.undefined)
    
    inline def setIOS(value: OverrideButtonConfiguration): Self = StObject.set(x, "IOS", value.asInstanceOf[js.Any])
    
    inline def setIOSUndefined: Self = StObject.set(x, "IOS", js.undefined)
    
    inline def setWeb(value: OverrideButtonConfiguration): Self = StObject.set(x, "Web", value.asInstanceOf[js.Any])
    
    inline def setWebUndefined: Self = StObject.set(x, "Web", js.undefined)
  }
}
