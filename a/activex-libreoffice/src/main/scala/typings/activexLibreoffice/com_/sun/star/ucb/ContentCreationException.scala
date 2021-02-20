package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This exception is thrown to indicate that the creation of a UCB content failed.
  * @author Kai Sommerfeld
  * @version 1.0
  */
@js.native
trait ContentCreationException extends Exception {
  
  /** An error code. */
  var eError: ContentCreationError = js.native
}
object ContentCreationException {
  
  @scala.inline
  def apply(Context: XInterface, Message: String, eError: ContentCreationError): ContentCreationException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], eError = eError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentCreationException]
  }
  
  @scala.inline
  implicit class ContentCreationExceptionMutableBuilder[Self <: ContentCreationException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEError(value: ContentCreationError): Self = StObject.set(x, "eError", value.asInstanceOf[js.Any])
  }
}
