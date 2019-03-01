package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is thrown when the wrong medium is inserted into a removable drive during an operation. */
trait InteractiveWrongMediumException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest {
  /** identifies the medium thats needed to continue with the pending operation. */
  var Medium: js.Any
}

object InteractiveWrongMediumException {
  @scala.inline
  def apply(
    Classification: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Medium: js.Any,
    Message: java.lang.String
  ): InteractiveWrongMediumException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Classification")(Classification)
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("Medium")(Medium)
    __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[InteractiveWrongMediumException]
  }
}

