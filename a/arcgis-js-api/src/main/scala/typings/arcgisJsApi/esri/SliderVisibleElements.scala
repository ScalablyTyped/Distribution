package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderVisibleElements extends StObject {
  
  /**
    * Indicates whether to display labels for slider thumbs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#VisibleElements)
    */
  var labels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) or [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) range values on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#VisibleElements)
    */
  var rangeLabels: js.UndefOr[Boolean] = js.undefined
}
object SliderVisibleElements {
  
  inline def apply(): SliderVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderVisibleElements]
  }
  
  extension [Self <: SliderVisibleElements](x: Self) {
    
    inline def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setRangeLabels(value: Boolean): Self = StObject.set(x, "rangeLabels", value.asInstanceOf[js.Any])
    
    inline def setRangeLabelsUndefined: Self = StObject.set(x, "rangeLabels", js.undefined)
  }
}
