package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region 文件 https://docs.alipay.com/mini/api/file
trait SavedFileData extends StObject {
  
  /** 文件保存路径 */
  var apFilePath: String
}
object SavedFileData {
  
  inline def apply(apFilePath: String): SavedFileData = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFileData]
  }
  
  extension [Self <: SavedFileData](x: Self) {
    
    inline def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
  }
}
