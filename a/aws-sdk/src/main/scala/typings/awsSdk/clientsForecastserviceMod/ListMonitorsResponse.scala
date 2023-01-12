package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMonitorsResponse extends StObject {
  
  /**
    * An array of objects that summarize each monitor's properties.
    */
  var Monitors: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Monitors] = js.undefined
  
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.NextToken] = js.undefined
}
object ListMonitorsResponse {
  
  inline def apply(): ListMonitorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMonitorsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMonitorsResponse] (val x: Self) extends AnyVal {
    
    inline def setMonitors(value: Monitors): Self = StObject.set(x, "Monitors", value.asInstanceOf[js.Any])
    
    inline def setMonitorsUndefined: Self = StObject.set(x, "Monitors", js.undefined)
    
    inline def setMonitorsVarargs(value: MonitorSummary*): Self = StObject.set(x, "Monitors", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
