package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppendObjectResult extends StObject {
  
  var name: String
  
  var nextAppendPosition: String
  
  // the url of oss
  var res: NormalSuccessResponse
  
  var url: String
}
object AppendObjectResult {
  
  inline def apply(name: String, nextAppendPosition: String, res: NormalSuccessResponse, url: String): AppendObjectResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nextAppendPosition = nextAppendPosition.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendObjectResult]
  }
  
  extension [Self <: AppendObjectResult](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNextAppendPosition(value: String): Self = StObject.set(x, "nextAppendPosition", value.asInstanceOf[js.Any])
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
