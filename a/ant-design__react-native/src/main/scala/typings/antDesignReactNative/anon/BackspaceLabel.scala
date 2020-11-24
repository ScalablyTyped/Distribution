package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackspaceLabel extends js.Object {
  
  /** 退格 */
  var backspaceLabel: String = js.native
  
  /** 收起键盘 */
  var cancelKeyboardLabel: String = js.native
  
  /** 确定 */
  var confirmLabel: String = js.native
}
object BackspaceLabel {
  
  @scala.inline
  def apply(backspaceLabel: String, cancelKeyboardLabel: String, confirmLabel: String): BackspaceLabel = {
    val __obj = js.Dynamic.literal(backspaceLabel = backspaceLabel.asInstanceOf[js.Any], cancelKeyboardLabel = cancelKeyboardLabel.asInstanceOf[js.Any], confirmLabel = confirmLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackspaceLabel]
  }
  
  @scala.inline
  implicit class BackspaceLabelOps[Self <: BackspaceLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackspaceLabel(value: String): Self = this.set("backspaceLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelKeyboardLabel(value: String): Self = this.set("cancelKeyboardLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmLabel(value: String): Self = this.set("confirmLabel", value.asInstanceOf[js.Any])
  }
}
