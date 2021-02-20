package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStreamResult extends StObject {
  
  // readable stream instance if response status is not 200, stream will be null.
  var res: NormalSuccessResponse = js.native
  
  var stream: js.UndefOr[js.Any] = js.native
}
object GetStreamResult {
  
  @scala.inline
  def apply(res: NormalSuccessResponse): GetStreamResult = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamResult]
  }
  
  @scala.inline
  implicit class GetStreamResultMutableBuilder[Self <: GetStreamResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
