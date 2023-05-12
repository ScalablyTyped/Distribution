package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMonitorsOutput extends StObject {
  
  /**
    * A list of monitors.
    */
  var Monitors: MonitorList
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListMonitorsOutput {
  
  inline def apply(Monitors: MonitorList): ListMonitorsOutput = {
    val __obj = js.Dynamic.literal(Monitors = Monitors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMonitorsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMonitorsOutput] (val x: Self) extends AnyVal {
    
    inline def setMonitors(value: MonitorList): Self = StObject.set(x, "Monitors", value.asInstanceOf[js.Any])
    
    inline def setMonitorsVarargs(value: Monitor*): Self = StObject.set(x, "Monitors", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
