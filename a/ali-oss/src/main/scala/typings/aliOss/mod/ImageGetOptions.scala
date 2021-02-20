package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageGetOptions extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object ImageGetOptions {
  
  @scala.inline
  def apply(): ImageGetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageGetOptions]
  }
  
  @scala.inline
  implicit class ImageGetOptionsMutableBuilder[Self <: ImageGetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
