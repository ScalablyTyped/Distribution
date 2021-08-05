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
    * Time animation is controlled by a configurable [time slider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#Widgets)
    */
  var TimeSlider: WebMapTimeSlider
}
object Widgets {
  
  inline def apply(
    TimeSlider: WebMapTimeSlider,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): Widgets = {
    val __obj = js.Dynamic.literal(TimeSlider = TimeSlider.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[Widgets]
  }
  
  extension [Self <: Widgets](x: Self) {
    
    inline def setTimeSlider(value: WebMapTimeSlider): Self = StObject.set(x, "TimeSlider", value.asInstanceOf[js.Any])
  }
}
