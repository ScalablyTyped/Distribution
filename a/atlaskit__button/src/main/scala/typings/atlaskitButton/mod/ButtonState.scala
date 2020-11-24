package typings.atlaskitButton.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonState extends js.Object {
  
  val isActive: Boolean = js.native
  
  val isFocus: Boolean = js.native
  
  val isHover: Boolean = js.native
}
object ButtonState {
  
  @scala.inline
  def apply(isActive: Boolean, isFocus: Boolean, isHover: Boolean): ButtonState = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isFocus = isFocus.asInstanceOf[js.Any], isHover = isHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonState]
  }
  
  @scala.inline
  implicit class ButtonStateOps[Self <: ButtonState] (val x: Self) extends AnyVal {
    
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
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocus(value: Boolean): Self = this.set("isFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHover(value: Boolean): Self = this.set("isHover", value.asInstanceOf[js.Any])
  }
}
