package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error related to locking operations.
  *
  * Various meaningful errors are derived from this exception.
  * @since OOo 3.3
  */
trait InteractiveLockingException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest {
  /** The Url of the resource this exception is related to. */
  var Url: java.lang.String
}

object InteractiveLockingException {
  @scala.inline
  def apply(
    Classification: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    Url: java.lang.String
  ): InteractiveLockingException = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, Message = Message, Url = Url)
  
    __obj.asInstanceOf[InteractiveLockingException]
  }
}

