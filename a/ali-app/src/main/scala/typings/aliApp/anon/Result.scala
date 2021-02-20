package typings.aliApp.anon

import typings.aliApp.my.MultiLevelSelectItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends StObject {
  
  // 是否选择完成,取消返回false
  var result: js.Array[MultiLevelSelectItem] = js.native
  
  var success: Boolean = js.native
}
object Result {
  
  @scala.inline
  def apply(result: js.Array[MultiLevelSelectItem], success: Boolean): Result = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: js.Array[MultiLevelSelectItem]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: MultiLevelSelectItem*): Self = StObject.set(x, "result", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
