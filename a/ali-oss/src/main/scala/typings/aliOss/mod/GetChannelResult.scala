package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetChannelResult extends StObject {
  
  var Audio: js.UndefOr[js.Object] = js.native
  
  var ConnectedTime: js.UndefOr[String] = js.native
  
  var RemoteAddr: js.UndefOr[String] = js.native
  
  var Status: String = js.native
  
  var Video: js.UndefOr[js.Object] = js.native
  
  var res: NormalSuccessResponse = js.native
}
object GetChannelResult {
  
  @scala.inline
  def apply(Status: String, res: NormalSuccessResponse): GetChannelResult = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelResult]
  }
  
  @scala.inline
  implicit class GetChannelResultMutableBuilder[Self <: GetChannelResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: js.Object): Self = StObject.set(x, "Audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "Audio", js.undefined)
    
    @scala.inline
    def setConnectedTime(value: String): Self = StObject.set(x, "ConnectedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedTimeUndefined: Self = StObject.set(x, "ConnectedTime", js.undefined)
    
    @scala.inline
    def setRemoteAddr(value: String): Self = StObject.set(x, "RemoteAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteAddrUndefined: Self = StObject.set(x, "RemoteAddr", js.undefined)
    
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo(value: js.Object): Self = StObject.set(x, "Video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "Video", js.undefined)
  }
}
