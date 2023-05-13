package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResult extends StObject {
  
  var res: NormalSuccessResponse
}
object DeleteResult {
  
  inline def apply(res: NormalSuccessResponse): DeleteResult = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResult] (val x: Self) extends AnyVal {
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
