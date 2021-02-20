package typings.amazonConnectStreams.connect

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitorInfo extends StObject {
  
  val agentName: String = js.native
  
  val customerName: String = js.native
  
  val joinTime: Date = js.native
}
object MonitorInfo {
  
  @scala.inline
  def apply(agentName: String, customerName: String, joinTime: Date): MonitorInfo = {
    val __obj = js.Dynamic.literal(agentName = agentName.asInstanceOf[js.Any], customerName = customerName.asInstanceOf[js.Any], joinTime = joinTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorInfo]
  }
  
  @scala.inline
  implicit class MonitorInfoMutableBuilder[Self <: MonitorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentName(value: String): Self = StObject.set(x, "agentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerName(value: String): Self = StObject.set(x, "customerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinTime(value: Date): Self = StObject.set(x, "joinTime", value.asInstanceOf[js.Any])
  }
}
