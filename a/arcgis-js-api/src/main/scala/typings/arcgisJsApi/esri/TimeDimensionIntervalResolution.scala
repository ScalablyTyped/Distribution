package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeDimensionIntervalResolution extends StObject {
  
  /**
  		 * Number of days.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimensionInterval)
  		 */
  var days: Double
  
  /**
  		 * Number of hours.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimensionInterval)
  		 */
  var hours: Double
  
  /**
  		 * Number of minutes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimensionInterval)
  		 */
  var minutes: Double
  
  /**
  		 * Number of months.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimensionInterval)
  		 */
  var months: Double
  
  /**
  		 * Number of seconds.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimensionInterval)
  		 */
  var seconds: Double
  
  /**
  		 * Number of years.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimensionInterval)
  		 */
  var years: Double
}
object TimeDimensionIntervalResolution {
  
  inline def apply(days: Double, hours: Double, minutes: Double, months: Double, seconds: Double, years: Double): TimeDimensionIntervalResolution = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeDimensionIntervalResolution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeDimensionIntervalResolution] (val x: Self) extends AnyVal {
    
    inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
  }
}
