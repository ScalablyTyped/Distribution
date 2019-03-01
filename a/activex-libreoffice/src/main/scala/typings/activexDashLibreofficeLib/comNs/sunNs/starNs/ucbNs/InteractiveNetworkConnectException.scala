package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A network error specifying a connection failure. */
trait InteractiveNetworkConnectException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest {
  /** The name of the server to which connecting failed. */
  var Server: java.lang.String
}

object InteractiveNetworkConnectException {
  @scala.inline
  def apply(
    Classification: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    Server: java.lang.String
  ): InteractiveNetworkConnectException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Classification")(Classification)
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("Message")(Message)
    __obj.updateDynamic("Server")(Server)
    __obj.asInstanceOf[InteractiveNetworkConnectException]
  }
}

