package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowCastVisibleElements extends StObject {
  
  /**
  		 * When set to `false`, the color picker is not displayed in the options for any of the visualization modes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast.html#VisibleElements)
  		 */
  var colorPicker: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * When set to `false`, the date picker is not displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast.html#VisibleElements)
  		 */
  var datePicker: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * When set to `false`, the slider used to select a time range for the analysis is not displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast.html#VisibleElements)
  		 */
  var timeRangeSlider: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * When set to `false`, the dropdown used to select a timezone for the time range is not displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast.html#VisibleElements)
  		 */
  var timezone: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * When set to `false`, the tooltip with the accumulated shadow time is not displayed when hovering the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast.html#VisibleElements)
  		 */
  var tooltip: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * When set to `false`, the options for the various visualization modes are not displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast.html#VisibleElements)
  		 */
  var visualizationOptions: js.UndefOr[Boolean] = js.undefined
}
object ShadowCastVisibleElements {
  
  inline def apply(): ShadowCastVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowCastVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowCastVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setColorPicker(value: Boolean): Self = StObject.set(x, "colorPicker", value.asInstanceOf[js.Any])
    
    inline def setColorPickerUndefined: Self = StObject.set(x, "colorPicker", js.undefined)
    
    inline def setDatePicker(value: Boolean): Self = StObject.set(x, "datePicker", value.asInstanceOf[js.Any])
    
    inline def setDatePickerUndefined: Self = StObject.set(x, "datePicker", js.undefined)
    
    inline def setTimeRangeSlider(value: Boolean): Self = StObject.set(x, "timeRangeSlider", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeSliderUndefined: Self = StObject.set(x, "timeRangeSlider", js.undefined)
    
    inline def setTimezone(value: Boolean): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setVisualizationOptions(value: Boolean): Self = StObject.set(x, "visualizationOptions", value.asInstanceOf[js.Any])
    
    inline def setVisualizationOptionsUndefined: Self = StObject.set(x, "visualizationOptions", js.undefined)
  }
}
