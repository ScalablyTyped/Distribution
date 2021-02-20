package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRtmpUrlOptions extends StObject {
  
  var expires: js.UndefOr[Double] = js.native
  
  // the expire time in seconds of the url
  var params: js.UndefOr[js.Object] = js.native
  
  // the additional parameters for url, e.g.: {playlistName: 'play.m3u8'}
  var timeout: js.UndefOr[Double] = js.native
}
object GetRtmpUrlOptions {
  
  @scala.inline
  def apply(): GetRtmpUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRtmpUrlOptions]
  }
  
  @scala.inline
  implicit class GetRtmpUrlOptionsMutableBuilder[Self <: GetRtmpUrlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
