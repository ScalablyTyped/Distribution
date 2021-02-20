package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region 文件 https://docs.alipay.com/mini/api/file
@js.native
trait SavedFileData extends StObject {
  
  /** 文件保存路径 */
  var apFilePath: String = js.native
}
object SavedFileData {
  
  @scala.inline
  def apply(apFilePath: String): SavedFileData = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFileData]
  }
  
  @scala.inline
  implicit class SavedFileDataMutableBuilder[Self <: SavedFileData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
  }
}
