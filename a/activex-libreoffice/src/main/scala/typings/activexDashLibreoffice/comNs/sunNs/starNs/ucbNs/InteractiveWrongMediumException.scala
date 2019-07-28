package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.InteractionClassification
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is thrown when the wrong medium is inserted into a removable drive during an operation. */
trait InteractiveWrongMediumException extends ClassifiedInteractionRequest {
  /** identifies the medium thats needed to continue with the pending operation. */
  var Medium: js.Any
}

object InteractiveWrongMediumException {
  @scala.inline
  def apply(Classification: InteractionClassification, Context: XInterface, Medium: js.Any, Message: String): InteractiveWrongMediumException = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, Medium = Medium, Message = Message)
  
    __obj.asInstanceOf[InteractiveWrongMediumException]
  }
}

