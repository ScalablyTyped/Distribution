package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to a message box. */
@js.native
trait XMessageBox extends js.Object {
  
  /** the caption text. */
  var CaptionText: String = js.native
  
  /** the message text. */
  var MessageText: String = js.native
  
  /**
    * shows the message box.
    * @returns one of {@link MessageBoxResults} .
    */
  def execute(): Double = js.native
}
object XMessageBox {
  
  @scala.inline
  def apply(CaptionText: String, MessageText: String, execute: () => Double): XMessageBox = {
    val __obj = js.Dynamic.literal(CaptionText = CaptionText.asInstanceOf[js.Any], MessageText = MessageText.asInstanceOf[js.Any], execute = js.Any.fromFunction0(execute))
    __obj.asInstanceOf[XMessageBox]
  }
  
  @scala.inline
  implicit class XMessageBoxOps[Self <: XMessageBox] (val x: Self) extends AnyVal {
    
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
    def setCaptionText(value: String): Self = this.set("CaptionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageText(value: String): Self = this.set("MessageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecute(value: () => Double): Self = this.set("execute", js.Any.fromFunction0(value))
  }
}
