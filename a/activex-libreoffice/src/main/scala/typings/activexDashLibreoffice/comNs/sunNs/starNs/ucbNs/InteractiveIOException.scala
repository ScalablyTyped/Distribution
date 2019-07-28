package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.InteractionClassification
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An input/output error. */
trait InteractiveIOException extends ClassifiedInteractionRequest {
  /** The type of input/output error. */
  var Code: IOErrorCode
}

object InteractiveIOException {
  @scala.inline
  def apply(Classification: InteractionClassification, Code: IOErrorCode, Context: XInterface, Message: String): InteractiveIOException = {
    val __obj = js.Dynamic.literal(Classification = Classification, Code = Code, Context = Context, Message = Message)
  
    __obj.asInstanceOf[InteractiveIOException]
  }
}

