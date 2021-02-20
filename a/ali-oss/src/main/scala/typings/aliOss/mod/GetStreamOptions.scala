package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStreamOptions extends StObject {
  
  // image process params, will send with x-oss-process e.g.: {process: 'image/resize,w_200'}
  var headers: js.UndefOr[js.Object] = js.native
  
  var process: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object GetStreamOptions {
  
  @scala.inline
  def apply(): GetStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamOptions]
  }
  
  @scala.inline
  implicit class GetStreamOptionsMutableBuilder[Self <: GetStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setProcess(value: String): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
