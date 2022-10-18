package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppMonitorsResponse extends StObject {
  
  /**
    * An array of structures that contain information about the returned app monitors.
    */
  var AppMonitorSummaries: js.UndefOr[AppMonitorSummaryList] = js.undefined
  
  /**
    * A token that you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListAppMonitorsResponse {
  
  inline def apply(): ListAppMonitorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppMonitorsResponse]
  }
  
  extension [Self <: ListAppMonitorsResponse](x: Self) {
    
    inline def setAppMonitorSummaries(value: AppMonitorSummaryList): Self = StObject.set(x, "AppMonitorSummaries", value.asInstanceOf[js.Any])
    
    inline def setAppMonitorSummariesUndefined: Self = StObject.set(x, "AppMonitorSummaries", js.undefined)
    
    inline def setAppMonitorSummariesVarargs(value: AppMonitorSummary*): Self = StObject.set(x, "AppMonitorSummaries", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
