package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * When specifying a range using date components, provide all elements of the ApplePayDateComponents down to the level of granularity that you want to expose.
  * For example, if you specify a range of days, be sure to include values for both months and years in addition to days in the ApplePayDateComponents.
  *
  * Apple Pay on the Web uses the Gregorian calendar when processing dates.
  */
trait ApplePayDateComponents extends StObject {
  
  /**
    * A number that represents a day.
    */
  var days: Double
  
  /**
    * A number that represents an hour.
    */
  var hours: Double
  
  /**
    * A number between 1 and 12 that represents a month.
    */
  var months: Double
  
  /**
    * A number that represents a year.
    */
  var years: Double
}
object ApplePayDateComponents {
  
  inline def apply(days: Double, hours: Double, months: Double, years: Double): ApplePayDateComponents = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayDateComponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayDateComponents] (val x: Self) extends AnyVal {
    
    inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
  }
}
