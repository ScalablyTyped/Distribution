package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TempFileResponse extends StObject {
  
  /** 文件的临时路径 */
  var apFilePath: String
}
object TempFileResponse {
  
  inline def apply(apFilePath: String): TempFileResponse = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFileResponse]
  }
  
  extension [Self <: TempFileResponse](x: Self) {
    
    inline def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
  }
}
