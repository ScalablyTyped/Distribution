package typings.antDesignProLayout.typingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageDescriptor extends js.Object {
  
  var defaultMessage: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var id: js.Any = js.native
}
object MessageDescriptor {
  
  @scala.inline
  def apply(id: js.Any): MessageDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptor]
  }
  
  @scala.inline
  implicit class MessageDescriptorOps[Self <: MessageDescriptor] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
