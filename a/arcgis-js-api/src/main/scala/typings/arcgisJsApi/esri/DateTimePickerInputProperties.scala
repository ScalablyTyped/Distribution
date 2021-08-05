package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`datetime-picker`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimePickerInputProperties
  extends StObject
     with InputProperties {
  
  /**
    * Indicates if the input should provide an option to select the time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-DateTimePickerInput.html#includeTime)
    */
  var includeTime: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum date to allow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-DateTimePickerInput.html#max)
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum date to allow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-DateTimePickerInput.html#min)
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * The type of input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-DateTimePickerInput.html#type)
    */
  var `type`: js.UndefOr[`datetime-picker`] = js.undefined
}
object DateTimePickerInputProperties {
  
  inline def apply(): DateTimePickerInputProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimePickerInputProperties]
  }
  
  extension [Self <: DateTimePickerInputProperties](x: Self) {
    
    inline def setIncludeTime(value: Boolean): Self = StObject.set(x, "includeTime", value.asInstanceOf[js.Any])
    
    inline def setIncludeTimeUndefined: Self = StObject.set(x, "includeTime", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setType(value: `datetime-picker`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
