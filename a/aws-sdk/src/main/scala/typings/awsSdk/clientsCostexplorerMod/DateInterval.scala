package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateInterval extends StObject {
  
  /**
    * The end of the time period. The end date is exclusive. For example, if end is 2017-05-01, Amazon Web Services retrieves cost and usage data from the start date up to, but not including, 2017-05-01.
    */
  var End: YearMonthDay
  
  /**
    * The beginning of the time period. The start date is inclusive. For example, if start is 2017-01-01, Amazon Web Services retrieves cost and usage data starting at 2017-01-01 up to the end date. The start date must be equal to or no later than the current date to avoid a validation error.
    */
  var Start: YearMonthDay
}
object DateInterval {
  
  inline def apply(End: YearMonthDay, Start: YearMonthDay): DateInterval = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateInterval]
  }
  
  extension [Self <: DateInterval](x: Self) {
    
    inline def setEnd(value: YearMonthDay): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setStart(value: YearMonthDay): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
  }
}
