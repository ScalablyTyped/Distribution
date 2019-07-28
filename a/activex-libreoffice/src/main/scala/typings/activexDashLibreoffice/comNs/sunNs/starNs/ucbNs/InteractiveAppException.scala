package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.InteractionClassification
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An application error.
  * @since OOo 1.1.2
  */
trait InteractiveAppException extends ClassifiedInteractionRequest {
  /** The type of application error. */
  var Code: Double
}

object InteractiveAppException {
  @scala.inline
  def apply(Classification: InteractionClassification, Code: Double, Context: XInterface, Message: String): InteractiveAppException = {
    val __obj = js.Dynamic.literal(Classification = Classification, Code = Code, Context = Context, Message = Message)
  
    __obj.asInstanceOf[InteractiveAppException]
  }
}

