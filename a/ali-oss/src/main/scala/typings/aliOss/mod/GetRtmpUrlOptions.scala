package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRtmpUrlOptions extends StObject {
  
  /** the expire time in seconds of the url */
  var expires: js.UndefOr[Double] = js.undefined
  
  /** the additional parameters for url, e.g.: {playlistName: 'play.m3u8'} */
  var params: js.UndefOr[js.Object] = js.undefined
  
  /** the operation timeout */
  var timeout: js.UndefOr[Double] = js.undefined
}
object GetRtmpUrlOptions {
  
  inline def apply(): GetRtmpUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRtmpUrlOptions]
  }
  
  extension [Self <: GetRtmpUrlOptions](x: Self) {
    
    inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
