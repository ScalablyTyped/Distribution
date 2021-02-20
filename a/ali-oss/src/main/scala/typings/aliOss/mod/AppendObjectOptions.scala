package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppendObjectOptions extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.native
  
  // custom mime, will send with Content-Type entity header
  var meta: js.UndefOr[UserMeta] = js.native
  
  // the operation timeout
  var mime: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  // specify the position which is the content length of the latest object
  var timeout: js.UndefOr[Double] = js.native
}
object AppendObjectOptions {
  
  @scala.inline
  def apply(): AppendObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppendObjectOptions]
  }
  
  @scala.inline
  implicit class AppendObjectOptionsMutableBuilder[Self <: AppendObjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMeta(value: UserMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
