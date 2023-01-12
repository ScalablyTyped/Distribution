package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedProfileTime extends StObject {
  
  /**
    *  The aggregation period. This indicates the period during which an aggregation profile collects posted agent profiles for a profiling group. Use one of three valid durations that are specified using the ISO 8601 format.     P1D — 1 day     PT1H — 1 hour     PT5M — 5 minutes   
    */
  var period: js.UndefOr[AggregationPeriod] = js.undefined
  
  /**
    *  The time that aggregation of posted agent profiles for a profiling group starts. The aggregation profile contains profiles posted by the agent starting at this time for an aggregation period specified by the period property of the AggregatedProfileTime object.   Specify start using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var start: js.UndefOr[js.Date] = js.undefined
}
object AggregatedProfileTime {
  
  inline def apply(): AggregatedProfileTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregatedProfileTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregatedProfileTime] (val x: Self) extends AnyVal {
    
    inline def setPeriod(value: AggregationPeriod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
