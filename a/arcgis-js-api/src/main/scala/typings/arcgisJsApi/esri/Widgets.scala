package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Widgets
  extends StObject
     with Object {
  
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
  
  inline def apply(
    constructor: js.Function,
    floorFilter: WebMapFloorFilter,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    timeSlider: WebMapTimeSlider
  ): Widgets = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], floorFilter = floorFilter.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), timeSlider = timeSlider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Widgets]
  }
  
  extension [Self <: Widgets](x: Self) {
    
    inline def setFloorFilter(value: WebMapFloorFilter): Self = StObject.set(x, "floorFilter", value.asInstanceOf[js.Any])
    
    inline def setTimeSlider(value: WebMapTimeSlider): Self = StObject.set(x, "timeSlider", value.asInstanceOf[js.Any])
  }
}
