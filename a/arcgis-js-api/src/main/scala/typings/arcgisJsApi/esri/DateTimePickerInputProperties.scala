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
  
  @scala.inline
  def apply(): DateTimePickerInputProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimePickerInputProperties]
  }
  
  @scala.inline
  implicit class DateTimePickerInputPropertiesMutableBuilder[Self <: DateTimePickerInputProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeTime(value: Boolean): Self = StObject.set(x, "includeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTimeUndefined: Self = StObject.set(x, "includeTime", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setType(value: `datetime-picker`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
