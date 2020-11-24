package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelHistory extends js.Object {
  
   //
  var EndTime: String = js.native
  
  var RemoteAddr: String = js.native
  
  var StartTime: String = js.native
}
object ChannelHistory {
  
  @scala.inline
  def apply(EndTime: String, RemoteAddr: String, StartTime: String): ChannelHistory = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], RemoteAddr = RemoteAddr.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelHistory]
  }
  
  @scala.inline
  implicit class ChannelHistoryOps[Self <: ChannelHistory] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: String): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteAddr(value: String): Self = this.set("RemoteAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("StartTime", value.asInstanceOf[js.Any])
  }
}
