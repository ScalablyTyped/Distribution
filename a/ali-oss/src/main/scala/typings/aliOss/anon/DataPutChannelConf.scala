package typings.aliOss.anon

import typings.aliOss.mod.NormalSuccessResponse
import typings.aliOss.mod.PutChannelConf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataPutChannelConf extends StObject {
  
  var data: PutChannelConf
  
  var res: NormalSuccessResponse
}
object DataPutChannelConf {
  
  inline def apply(data: PutChannelConf, res: NormalSuccessResponse): DataPutChannelConf = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPutChannelConf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataPutChannelConf] (val x: Self) extends AnyVal {
    
    inline def setData(value: PutChannelConf): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
