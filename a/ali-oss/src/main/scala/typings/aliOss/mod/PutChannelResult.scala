package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutChannelResult extends StObject {
  
  var playUrls: js.Array[String]
  
  var publishUrls: js.Array[String]
  
  var res: NormalSuccessResponse
}
object PutChannelResult {
  
  inline def apply(playUrls: js.Array[String], publishUrls: js.Array[String], res: NormalSuccessResponse): PutChannelResult = {
    val __obj = js.Dynamic.literal(playUrls = playUrls.asInstanceOf[js.Any], publishUrls = publishUrls.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutChannelResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutChannelResult] (val x: Self) extends AnyVal {
    
    inline def setPlayUrls(value: js.Array[String]): Self = StObject.set(x, "playUrls", value.asInstanceOf[js.Any])
    
    inline def setPlayUrlsVarargs(value: String*): Self = StObject.set(x, "playUrls", js.Array(value*))
    
    inline def setPublishUrls(value: js.Array[String]): Self = StObject.set(x, "publishUrls", value.asInstanceOf[js.Any])
    
    inline def setPublishUrlsVarargs(value: String*): Self = StObject.set(x, "publishUrls", js.Array(value*))
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
