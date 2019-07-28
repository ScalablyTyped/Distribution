package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, eError = eError)
  
    __obj.asInstanceOf[ContentCreationException]
  }
}

