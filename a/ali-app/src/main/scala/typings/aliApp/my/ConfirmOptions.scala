package typings.aliApp.my

import typings.aliApp.anon.Confirm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 确认按钮文字，默认‘取消’ */
  var cancelButtonText: String = js.native
  
  /** 确认按钮文字，默认‘确定’ */
  var confirmButtonText: String = js.native
  
  /** confirm框的内容 */
  var content: String = js.native
  
  @JSName("success")
  def success_MConfirmOptions(result: Confirm): Unit = js.native
  
  /** confirm框的标题 */
  var title: String = js.native
}
object ConfirmOptions {
  
  @scala.inline
  def apply(
    cancelButtonText: String,
    confirmButtonText: String,
    content: String,
    success: Confirm => Unit,
    title: String
  ): ConfirmOptions = {
    val __obj = js.Dynamic.literal(cancelButtonText = cancelButtonText.asInstanceOf[js.Any], confirmButtonText = confirmButtonText.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], success = js.Any.fromFunction1(success), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmOptions]
  }
  
  @scala.inline
  implicit class ConfirmOptionsMutableBuilder[Self <: ConfirmOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmButtonText(value: String): Self = StObject.set(x, "confirmButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Confirm => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
