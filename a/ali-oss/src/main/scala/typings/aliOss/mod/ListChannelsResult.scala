package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelsResult extends StObject {
  
  var channels: js.Array[Channel]
  
  var isTruncated: Boolean
  
  var nextMarker: String | Null
  
  var res: NormalSuccessResponse
}
object ListChannelsResult {
  
  @scala.inline
  def apply(channels: js.Array[Channel], isTruncated: Boolean, res: NormalSuccessResponse): ListChannelsResult = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], isTruncated = isTruncated.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], nextMarker = null)
    __obj.asInstanceOf[ListChannelsResult]
  }
  
  @scala.inline
  implicit class ListChannelsResultMutableBuilder[Self <: ListChannelsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: js.Array[Channel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setIsTruncated(value: Boolean): Self = StObject.set(x, "isTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarker(value: String): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerNull: Self = StObject.set(x, "nextMarker", null)
    
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
