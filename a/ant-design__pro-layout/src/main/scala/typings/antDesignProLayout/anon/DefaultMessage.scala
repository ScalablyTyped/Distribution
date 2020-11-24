package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultMessage extends js.Object {
  
  var defaultMessage: js.UndefOr[String] = js.native
  
  var id: js.Any = js.native
}
object DefaultMessage {
  
  @scala.inline
  def apply(id: js.Any): DefaultMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultMessage]
  }
  
  @scala.inline
  implicit class DefaultMessageOps[Self <: DefaultMessage] (val x: Self) extends AnyVal {
    
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
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMessage(value: String): Self = this.set("defaultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMessage: Self = this.set("defaultMessage", js.undefined)
  }
}
