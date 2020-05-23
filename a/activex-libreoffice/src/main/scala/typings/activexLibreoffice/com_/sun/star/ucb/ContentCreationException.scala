package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception is thrown to indicate that the creation of a UCB content failed.
  * @author Kai Sommerfeld
  * @version 1.0
  */
trait ContentCreationException extends Exception {
  /** An error code. */
  var eError: ContentCreationError
}

object ContentCreationException {
  @scala.inline
  def apply(Context: XInterface, Message: String, eError: ContentCreationError): ContentCreationException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], eError = eError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentCreationException]
  }
}

