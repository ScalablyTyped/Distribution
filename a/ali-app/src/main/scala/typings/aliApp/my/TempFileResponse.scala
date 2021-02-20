package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TempFileResponse extends StObject {
  
  /** 文件的临时路径 */
  var apFilePath: String = js.native
}
object TempFileResponse {
  
  @scala.inline
  def apply(apFilePath: String): TempFileResponse = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFileResponse]
  }
  
  @scala.inline
  implicit class TempFileResponseMutableBuilder[Self <: TempFileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
  }
}
