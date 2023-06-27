package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopsByDates extends StObject {
  
  /**
  		 * Array of dates.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#StopsByDates)
  		 */
  var dates: js.Array[js.Date]
}
object StopsByDates {
  
  inline def apply(dates: js.Array[js.Date]): StopsByDates = {
    val __obj = js.Dynamic.literal(dates = dates.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopsByDates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopsByDates] (val x: Self) extends AnyVal {
    
    inline def setDates(value: js.Array[js.Date]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
    
    inline def setDatesVarargs(value: js.Date*): Self = StObject.set(x, "dates", js.Array(value*))
  }
}
