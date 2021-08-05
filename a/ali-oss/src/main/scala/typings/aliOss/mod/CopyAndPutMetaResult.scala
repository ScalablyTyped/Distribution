package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyAndPutMetaResult extends StObject {
  
  var data: ModifyData
  
  var res: NormalSuccessResponse
}
object CopyAndPutMetaResult {
  
  inline def apply(data: ModifyData, res: NormalSuccessResponse): CopyAndPutMetaResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyAndPutMetaResult]
  }
  
  extension [Self <: CopyAndPutMetaResult](x: Self) {
    
    inline def setData(value: ModifyData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
