package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An input/output error. */
trait InteractiveIOException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest {
  /** The type of input/output error. */
  var Code: IOErrorCode
}

object InteractiveIOException {
  @scala.inline
  def apply(
    Classification: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification,
    Code: IOErrorCode,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String
  ): InteractiveIOException = {
    val __obj = js.Dynamic.literal(Classification = Classification, Code = Code, Context = Context, Message = Message)
  
    __obj.asInstanceOf[InteractiveIOException]
  }
}

