package typings.atom.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailedMessage extends js.Object {
  
  var buttons: js.UndefOr[StringDictionary[js.Function0[Unit]]] = js.native
  
  var detailedMessage: js.UndefOr[String] = js.native
  
  var message: String = js.native
}
object DetailedMessage {
  
  @scala.inline
  def apply(message: String): DetailedMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedMessage]
  }
  
  @scala.inline
  implicit class DetailedMessageOps[Self <: DetailedMessage] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons(value: StringDictionary[js.Function0[Unit]]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setDetailedMessage(value: String): Self = this.set("detailedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailedMessage: Self = this.set("detailedMessage", js.undefined)
  }
}
