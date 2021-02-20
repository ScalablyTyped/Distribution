package typings.aliApp.my

import typings.aliApp.aliAppStrings.center
import typings.aliApp.aliAppStrings.left
import typings.aliApp.aliAppStrings.right
import typings.aliApp.anon.InputValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromptOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** message对齐方式，可用枚举left/center/right，iOS ‘center’, android ‘left’ */
  var align: js.UndefOr[left | center | right | String] = js.native
  
  /** 确认按钮文字，默认‘取消’ */
  var cancelButtonText: String = js.native
  
  /** prompt框文本，默认‘请输入内容’ */
  var message: js.UndefOr[String] = js.native
  
  /** 确认按钮文字，默认‘确定’ */
  var okButtonText: String = js.native
  
  /** 输入框内的提示文案 */
  var placeholder: js.UndefOr[String] = js.native
  
  @JSName("success")
  def success_MPromptOptions(result: InputValue): Unit = js.native
  
  /** prompt框标题 */
  var title: js.UndefOr[String] = js.native
}
object PromptOptions {
  
  @scala.inline
  def apply(cancelButtonText: String, okButtonText: String, success: InputValue => Unit): PromptOptions = {
    val __obj = js.Dynamic.literal(cancelButtonText = cancelButtonText.asInstanceOf[js.Any], okButtonText = okButtonText.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[PromptOptions]
  }
  
  @scala.inline
  implicit class PromptOptionsMutableBuilder[Self <: PromptOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: left | center | right | String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOkButtonText(value: String): Self = StObject.set(x, "okButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setSuccess(value: InputValue => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
