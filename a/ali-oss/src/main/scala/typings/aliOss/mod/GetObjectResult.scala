package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectResult extends StObject {
  
  /** file content buffer if file parameter is null or ignore */
  var content: js.UndefOr[Any] = js.undefined
  
  var res: NormalSuccessResponse
}
object GetObjectResult {
  
  inline def apply(res: NormalSuccessResponse): GetObjectResult = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetObjectResult] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
