package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This exception is used to indicate that the requested {@link OpenMode} is not supported.
  *
  * For example, each {@link OpenCommandArgument} supplied as argument of the command "open" contains such an open mode.
  * @author Kai Sommerfeld
  * @see Content
  * @version 1.0
  */
@js.native
trait UnsupportedOpenModeException extends Exception {
  
  /** contains the {@link OpenMode} that is not supported. */
  var Mode: Double = js.native
}
object UnsupportedOpenModeException {
  
  @scala.inline
  def apply(Context: XInterface, Message: String, Mode: Double): UnsupportedOpenModeException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedOpenModeException]
  }
  
  @scala.inline
  implicit class UnsupportedOpenModeExceptionMutableBuilder[Self <: UnsupportedOpenModeException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
  }
}
