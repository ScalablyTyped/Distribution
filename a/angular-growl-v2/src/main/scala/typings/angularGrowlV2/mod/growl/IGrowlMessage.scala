package typings.angularGrowlV2.mod.growl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Growl message with configuration.
  */
@js.native
trait IGrowlMessage extends IGrowlMessageConfig {
  
  /**
    * Destroy the message.
    */
  def destroy(): Unit = js.native
  
  /**
    * Update the message body.
    * @param newText new message body
    */
  def setText(newText: String): Unit = js.native
  
  var text: String = js.native
}
object IGrowlMessage {
  
  @scala.inline
  def apply(destroy: () => Unit, setText: String => Unit, text: String): IGrowlMessage = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setText = js.Any.fromFunction1(setText), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGrowlMessage]
  }
  
  @scala.inline
  implicit class IGrowlMessageOps[Self <: IGrowlMessage] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
