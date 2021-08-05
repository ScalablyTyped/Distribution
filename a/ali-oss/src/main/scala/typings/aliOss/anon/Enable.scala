package typings.aliOss.anon

import typings.aliOss.mod.NormalSuccessResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enable extends StObject {
  
  var enable: Boolean
  
  var prefix: String | Null
  
  var res: NormalSuccessResponse
}
object Enable {
  
  inline def apply(enable: Boolean, res: NormalSuccessResponse): Enable = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], prefix = null)
    __obj.asInstanceOf[Enable]
  }
  
  extension [Self <: Enable](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
