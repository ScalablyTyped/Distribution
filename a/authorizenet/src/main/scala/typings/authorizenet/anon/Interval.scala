package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interval extends StObject {
  
  var interval: Length
  
  var startDate: String
  
  var totalOccurrences: String | Double
  
  var trialOccurrences: String | Double
}
object Interval {
  
  inline def apply(
    interval: Length,
    startDate: String,
    totalOccurrences: String | Double,
    trialOccurrences: String | Double
  ): Interval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], totalOccurrences = totalOccurrences.asInstanceOf[js.Any], trialOccurrences = trialOccurrences.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
  
  extension [Self <: Interval](x: Self) {
    
    inline def setInterval(value: Length): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setTotalOccurrences(value: String | Double): Self = StObject.set(x, "totalOccurrences", value.asInstanceOf[js.Any])
    
    inline def setTrialOccurrences(value: String | Double): Self = StObject.set(x, "trialOccurrences", value.asInstanceOf[js.Any])
  }
}
