package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveFileOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 文件路径 */
  var apFilePath: String = js.native
  
  @JSName("success")
  var success_SaveFileOptions: js.UndefOr[js.Function1[/* res */ SavedFileData, Unit]] = js.native
}
object SaveFileOptions {
  
  @scala.inline
  def apply(apFilePath: String): SaveFileOptions = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveFileOptions]
  }
  
  @scala.inline
  implicit class SaveFileOptionsMutableBuilder[Self <: SaveFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ SavedFileData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
