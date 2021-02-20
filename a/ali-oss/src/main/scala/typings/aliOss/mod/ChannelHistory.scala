package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelHistory extends StObject {
  
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
  implicit class ChannelHistoryMutableBuilder[Self <: ChannelHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteAddr(value: String): Self = StObject.set(x, "RemoteAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
