package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMinuteUsageRequest extends StObject {
  
  /**
    * The month being requested, with a value of 1-12.
    */
  var month: Month
  
  /**
    * The year being requested, in the format of YYYY.
    */
  var year: Year
}
object GetMinuteUsageRequest {
  
  inline def apply(month: Month, year: Year): GetMinuteUsageRequest = {
    val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMinuteUsageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMinuteUsageRequest] (val x: Self) extends AnyVal {
    
    inline def setMonth(value: Month): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Year): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
