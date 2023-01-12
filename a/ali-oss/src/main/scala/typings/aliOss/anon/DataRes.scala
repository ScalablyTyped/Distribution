package typings.aliOss.anon

import typings.aliOss.mod.NormalSuccessResponse
import typings.aliOss.mod.StyleData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRes extends StObject {
  
  var data: StyleData
  
  var res: NormalSuccessResponse
}
object DataRes {
  
  inline def apply(data: StyleData, res: NormalSuccessResponse): DataRes = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataRes] (val x: Self) extends AnyVal {
    
    inline def setData(value: StyleData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
