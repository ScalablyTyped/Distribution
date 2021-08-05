package typings.arcgisJsApi.esri

import typings.std.Date
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopsByDates
  extends StObject
     with Object {
  
  /**
    * Array of dates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByDates)
    */
  var dates: js.Array[Date]
}
object StopsByDates {
  
  inline def apply(
    constructor: js.Function,
    dates: js.Array[Date],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): StopsByDates = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], dates = dates.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[StopsByDates]
  }
  
  extension [Self <: StopsByDates](x: Self) {
    
    inline def setDates(value: js.Array[Date]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
    
    inline def setDatesVarargs(value: Date*): Self = StObject.set(x, "dates", js.Array(value :_*))
  }
}
