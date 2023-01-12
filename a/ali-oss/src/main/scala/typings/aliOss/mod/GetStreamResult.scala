package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamResult extends StObject {
  
  var res: NormalSuccessResponse
  
  /** readable stream instance if response status is not 200, stream will be null. */
  var stream: js.UndefOr[Any] = js.undefined
}
object GetStreamResult {
  
  inline def apply(res: NormalSuccessResponse): GetStreamResult = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStreamResult] (val x: Self) extends AnyVal {
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setStream(value: Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
