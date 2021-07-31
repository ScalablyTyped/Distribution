package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectResult extends StObject {
  
  var content: js.UndefOr[js.Any] = js.undefined
  
  // file content buffer if file parameter is null or ignore
  var res: NormalSuccessResponse
}
object GetObjectResult {
  
  @scala.inline
  def apply(res: NormalSuccessResponse): GetObjectResult = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectResult]
  }
  
  @scala.inline
  implicit class GetObjectResultMutableBuilder[Self <: GetObjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
