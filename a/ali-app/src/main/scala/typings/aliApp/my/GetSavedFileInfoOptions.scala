package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSavedFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 文件路径 */
  var apFilePath: String = js.native
  
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_GetSavedFileInfoOptions: js.UndefOr[js.Function1[/* res */ SavedFileInfoData, Unit]] = js.native
}
object GetSavedFileInfoOptions {
  
  @scala.inline
  def apply(apFilePath: String): GetSavedFileInfoOptions = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileInfoOptions]
  }
  
  @scala.inline
  implicit class GetSavedFileInfoOptionsMutableBuilder[Self <: GetSavedFileInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ SavedFileInfoData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
