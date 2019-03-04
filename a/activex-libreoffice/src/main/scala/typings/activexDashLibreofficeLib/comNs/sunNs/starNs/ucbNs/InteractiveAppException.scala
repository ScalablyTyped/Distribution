package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An application error.
  * @since OOo 1.1.2
  */
trait InteractiveAppException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest {
  /** The type of application error. */
  var Code: scala.Double
}

object InteractiveAppException {
  @scala.inline
  def apply(
    Classification: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification,
    Code: scala.Double,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String
  ): InteractiveAppException = {
    val __obj = js.Dynamic.literal(Classification = Classification, Code = Code, Context = Context, Message = Message)
  
    __obj.asInstanceOf[InteractiveAppException]
  }
}

