package typings.activexLibreoffice.com_.sun.star.awt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to a message box. */
@js.native
trait XMessageBox extends StObject {
  
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
  implicit class XMessageBoxMutableBuilder[Self <: XMessageBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptionText(value: String): Self = StObject.set(x, "CaptionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecute(value: () => Double): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessageText(value: String): Self = StObject.set(x, "MessageText", value.asInstanceOf[js.Any])
  }
}
