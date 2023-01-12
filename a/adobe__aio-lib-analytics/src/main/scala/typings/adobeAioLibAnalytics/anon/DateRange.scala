package typings.adobeAioLibAnalytics.anon

import typings.adobeAioLibAnalytics.adobeAioLibAnalyticsStrings.dateRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateRange extends StObject {
  
  var dateRange: String
  
  var `type`: dateRange
}
object DateRange {
  
  inline def apply(dateRange: String): DateRange = {
    val __obj = js.Dynamic.literal(dateRange = dateRange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dateRange")
    __obj.asInstanceOf[DateRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateRange] (val x: Self) extends AnyVal {
    
    inline def setDateRange(value: String): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setType(value: dateRange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
