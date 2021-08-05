package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DaylightVisibleElements
  extends StObject
     with Object {
  
  /**
    * When set to `false`, neither the date nor the season picker are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#VisibleElements)
    */
  var datePicker: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to `false`, neither of the play buttons are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#VisibleElements)
    */
  var playButtons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to `false`, the shadow toggle button is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#VisibleElements)
    */
  var shadowsToggle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to `false`, the timezone selector is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#VisibleElements)
    */
  var timezone: js.UndefOr[Boolean] = js.undefined
}
object DaylightVisibleElements {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): DaylightVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[DaylightVisibleElements]
  }
  
  extension [Self <: DaylightVisibleElements](x: Self) {
    
    inline def setDatePicker(value: Boolean): Self = StObject.set(x, "datePicker", value.asInstanceOf[js.Any])
    
    inline def setDatePickerUndefined: Self = StObject.set(x, "datePicker", js.undefined)
    
    inline def setPlayButtons(value: Boolean): Self = StObject.set(x, "playButtons", value.asInstanceOf[js.Any])
    
    inline def setPlayButtonsUndefined: Self = StObject.set(x, "playButtons", js.undefined)
    
    inline def setShadowsToggle(value: Boolean): Self = StObject.set(x, "shadowsToggle", value.asInstanceOf[js.Any])
    
    inline def setShadowsToggleUndefined: Self = StObject.set(x, "shadowsToggle", js.undefined)
    
    inline def setTimezone(value: Boolean): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
