package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelHistory extends StObject {
  
  //
  var EndTime: String
  
  var RemoteAddr: String
  
  var StartTime: String
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
