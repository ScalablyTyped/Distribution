package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Widgets extends StObject {
  
  /**
    * Floor filtering is controlled by a configurable [floor filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#Widgets)
    */
  var floorFilter: WebMapFloorFilter
  
  /**
    * Time animation is controlled by a configurable [time slider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#Widgets)
    */
  var timeSlider: WebMapTimeSlider
}
object Widgets {
  
  inline def apply(floorFilter: WebMapFloorFilter, timeSlider: WebMapTimeSlider): Widgets = {
    val __obj = js.Dynamic.literal(floorFilter = floorFilter.asInstanceOf[js.Any], timeSlider = timeSlider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Widgets]
  }
  
  extension [Self <: Widgets](x: Self) {
    
    inline def setFloorFilter(value: WebMapFloorFilter): Self = StObject.set(x, "floorFilter", value.asInstanceOf[js.Any])
    
    inline def setTimeSlider(value: WebMapTimeSlider): Self = StObject.set(x, "timeSlider", value.asInstanceOf[js.Any])
  }
}
