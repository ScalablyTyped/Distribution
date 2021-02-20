package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutChannelResult extends StObject {
  
  var playUrls: js.Array[String] = js.native
  
  var publishUrls: js.Array[String] = js.native
  
  var res: NormalSuccessResponse = js.native
}
object PutChannelResult {
  
  @scala.inline
  def apply(playUrls: js.Array[String], publishUrls: js.Array[String], res: NormalSuccessResponse): PutChannelResult = {
    val __obj = js.Dynamic.literal(playUrls = playUrls.asInstanceOf[js.Any], publishUrls = publishUrls.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutChannelResult]
  }
  
  @scala.inline
  implicit class PutChannelResultMutableBuilder[Self <: PutChannelResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayUrls(value: js.Array[String]): Self = StObject.set(x, "playUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayUrlsVarargs(value: String*): Self = StObject.set(x, "playUrls", js.Array(value :_*))
    
    @scala.inline
    def setPublishUrls(value: js.Array[String]): Self = StObject.set(x, "publishUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishUrlsVarargs(value: String*): Self = StObject.set(x, "publishUrls", js.Array(value :_*))
    
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
