package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.InteractionClassification
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A network error specifying a read failure. */
trait InteractiveNetworkReadException extends ClassifiedInteractionRequest {
  /** Any diagnostic message about the failure (which will typically be an English phrase or sentence). */
  var Diagnostic: String
}

object InteractiveNetworkReadException {
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: XInterface,
    Diagnostic: String,
    Message: String
  ): InteractiveNetworkReadException = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, Diagnostic = Diagnostic, Message = Message)
  
    __obj.asInstanceOf[InteractiveNetworkReadException]
  }
}

