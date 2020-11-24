package typings.amazonConnectStreams.connect

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitorInfo extends js.Object {
  
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
  implicit class MonitorInfoOps[Self <: MonitorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgentName(value: String): Self = this.set("agentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerName(value: String): Self = this.set("customerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinTime(value: Date): Self = this.set("joinTime", value.asInstanceOf[js.Any])
  }
}
