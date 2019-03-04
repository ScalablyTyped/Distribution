package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A network error specifying a write failure. */
trait InteractiveNetworkWriteException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest {
  /** Any diagnostic message about the failure (which will typically be an English phrase or sentence). */
  var Diagnostic: java.lang.String
}

object InteractiveNetworkWriteException {
  @scala.inline
  def apply(
    Classification: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Diagnostic: java.lang.String,
    Message: java.lang.String
  ): InteractiveNetworkWriteException = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, Diagnostic = Diagnostic, Message = Message)
  
    __obj.asInstanceOf[InteractiveNetworkWriteException]
  }
}

