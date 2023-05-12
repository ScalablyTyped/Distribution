package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMonitorsInput extends StObject {
  
  /**
    * The number of monitor objects that you want to return with this call.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsInternetmonitorMod.MaxResults] = js.undefined
  
  /**
    * The status of a monitor. This includes the status of the data processing for the monitor and the status of the monitor itself. For information about the statuses for a monitor, see  Monitor.
    */
  var MonitorStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListMonitorsInput {
  
  inline def apply(): ListMonitorsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMonitorsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMonitorsInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMonitorStatus(value: String): Self = StObject.set(x, "MonitorStatus", value.asInstanceOf[js.Any])
    
    inline def setMonitorStatusUndefined: Self = StObject.set(x, "MonitorStatus", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
