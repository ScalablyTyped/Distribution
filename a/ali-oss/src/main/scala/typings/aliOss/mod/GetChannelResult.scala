package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelResult extends StObject {
  
  var Audio: js.UndefOr[js.Object] = js.undefined
  
  var ConnectedTime: js.UndefOr[String] = js.undefined
  
  var RemoteAddr: js.UndefOr[String] = js.undefined
  
  var Status: String
  
  var Video: js.UndefOr[js.Object] = js.undefined
  
  var res: NormalSuccessResponse
}
object GetChannelResult {
  
  inline def apply(Status: String, res: NormalSuccessResponse): GetChannelResult = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetChannelResult] (val x: Self) extends AnyVal {
    
    inline def setAudio(value: js.Object): Self = StObject.set(x, "Audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "Audio", js.undefined)
    
    inline def setConnectedTime(value: String): Self = StObject.set(x, "ConnectedTime", value.asInstanceOf[js.Any])
    
    inline def setConnectedTimeUndefined: Self = StObject.set(x, "ConnectedTime", js.undefined)
    
    inline def setRemoteAddr(value: String): Self = StObject.set(x, "RemoteAddr", value.asInstanceOf[js.Any])
    
    inline def setRemoteAddrUndefined: Self = StObject.set(x, "RemoteAddr", js.undefined)
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: js.Object): Self = StObject.set(x, "Video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "Video", js.undefined)
  }
}
