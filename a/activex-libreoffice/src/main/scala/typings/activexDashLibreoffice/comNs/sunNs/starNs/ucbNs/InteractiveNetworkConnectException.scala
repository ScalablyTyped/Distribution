package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.InteractionClassification
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A network error specifying a connection failure. */
trait InteractiveNetworkConnectException extends ClassifiedInteractionRequest {
  /** The name of the server to which connecting failed. */
  var Server: String
}

object InteractiveNetworkConnectException {
  @scala.inline
  def apply(Classification: InteractionClassification, Context: XInterface, Message: String, Server: String): InteractiveNetworkConnectException = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, Message = Message, Server = Server)
  
    __obj.asInstanceOf[InteractiveNetworkConnectException]
  }
}

