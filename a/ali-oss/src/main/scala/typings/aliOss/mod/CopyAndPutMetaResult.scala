package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyAndPutMetaResult extends StObject {
  
  var data: ModifyData = js.native
  
  var res: NormalSuccessResponse = js.native
}
object CopyAndPutMetaResult {
  
  @scala.inline
  def apply(data: ModifyData, res: NormalSuccessResponse): CopyAndPutMetaResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyAndPutMetaResult]
  }
  
  @scala.inline
  implicit class CopyAndPutMetaResultMutableBuilder[Self <: CopyAndPutMetaResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: ModifyData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
