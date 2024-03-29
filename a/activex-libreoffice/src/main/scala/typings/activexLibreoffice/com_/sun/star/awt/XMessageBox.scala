package typings.activexLibreoffice.com_.sun.star.awt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to a message box. */
trait XMessageBox extends StObject {
  
  /** the caption text. */
  var CaptionText: String
  
  /** the message text. */
  var MessageText: String
  
  /**
    * shows the message box.
    * @returns one of {@link MessageBoxResults} .
    */
  def execute(): Double
}
object XMessageBox {
  
  inline def apply(CaptionText: String, MessageText: String, execute: () => Double): XMessageBox = {
    val __obj = js.Dynamic.literal(CaptionText = CaptionText.asInstanceOf[js.Any], MessageText = MessageText.asInstanceOf[js.Any], execute = js.Any.fromFunction0(execute))
    __obj.asInstanceOf[XMessageBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XMessageBox] (val x: Self) extends AnyVal {
    
    inline def setCaptionText(value: String): Self = StObject.set(x, "CaptionText", value.asInstanceOf[js.Any])
    
    inline def setExecute(value: () => Double): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
    
    inline def setMessageText(value: String): Self = StObject.set(x, "MessageText", value.asInstanceOf[js.Any])
  }
}
