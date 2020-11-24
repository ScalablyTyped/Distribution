package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutStreamOptions extends js.Object {
  
  var callback: ObjectCallback = js.native
  
  var contentLength: js.UndefOr[Double] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
   // custom mime, will send with Content-Type entity header
  var meta: UserMeta = js.native
  
   // the operation timeout
  var mime: String = js.native
  
   // the stream length, chunked encoding will be used if absent
  var timeout: Double = js.native
}
object PutStreamOptions {
  
  @scala.inline
  def apply(callback: ObjectCallback, meta: UserMeta, mime: String, timeout: Double): PutStreamOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutStreamOptions]
  }
  
  @scala.inline
  implicit class PutStreamOptionsOps[Self <: PutStreamOptions] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: ObjectCallback): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: UserMeta): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLength(value: Double): Self = this.set("contentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLength: Self = this.set("contentLength", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
}
