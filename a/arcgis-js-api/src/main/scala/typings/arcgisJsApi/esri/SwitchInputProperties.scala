package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchInputProperties extends StObject {
  
  /**
    * Coded value used when the switch state is turned off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-SwitchInput.html#offValue)
    */
  var offValue: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Coded value used when the switch state is turned on.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-SwitchInput.html#onValue)
    */
  var onValue: js.UndefOr[String | Double] = js.undefined
}
object SwitchInputProperties {
  
  inline def apply(): SwitchInputProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchInputProperties]
  }
  
  extension [Self <: SwitchInputProperties](x: Self) {
    
    inline def setOffValue(value: String | Double): Self = StObject.set(x, "offValue", value.asInstanceOf[js.Any])
    
    inline def setOffValueUndefined: Self = StObject.set(x, "offValue", js.undefined)
    
    inline def setOnValue(value: String | Double): Self = StObject.set(x, "onValue", value.asInstanceOf[js.Any])
    
    inline def setOnValueUndefined: Self = StObject.set(x, "onValue", js.undefined)
  }
}
