package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorInfo extends StObject {
  
  val agentName: String
  
  val customerName: String
  
  val joinTime: js.Date
}
object MonitorInfo {
  
  inline def apply(agentName: String, customerName: String, joinTime: js.Date): MonitorInfo = {
    val __obj = js.Dynamic.literal(agentName = agentName.asInstanceOf[js.Any], customerName = customerName.asInstanceOf[js.Any], joinTime = joinTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitorInfo] (val x: Self) extends AnyVal {
    
    inline def setAgentName(value: String): Self = StObject.set(x, "agentName", value.asInstanceOf[js.Any])
    
    inline def setCustomerName(value: String): Self = StObject.set(x, "customerName", value.asInstanceOf[js.Any])
    
    inline def setJoinTime(value: js.Date): Self = StObject.set(x, "joinTime", value.asInstanceOf[js.Any])
  }
}
