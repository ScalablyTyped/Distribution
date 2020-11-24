package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecureLockIcon extends js.Object {
  
  val SecureLockIcon: Double = js.native
}
object SecureLockIcon {
  
  @scala.inline
  def apply(SecureLockIcon: Double): SecureLockIcon = {
    val __obj = js.Dynamic.literal(SecureLockIcon = SecureLockIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureLockIcon]
  }
  
  @scala.inline
  implicit class SecureLockIconOps[Self <: SecureLockIcon] (val x: Self) extends AnyVal {
    
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
    def setSecureLockIcon(value: Double): Self = this.set("SecureLockIcon", value.asInstanceOf[js.Any])
  }
}
