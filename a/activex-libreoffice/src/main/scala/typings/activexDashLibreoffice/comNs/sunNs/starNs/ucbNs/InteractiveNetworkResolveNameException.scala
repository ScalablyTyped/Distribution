package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.InteractionClassification
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A network error specifying a name resolution failure. */
trait InteractiveNetworkResolveNameException extends ClassifiedInteractionRequest {
  /** The server name for which resolution failed. */
  var Server: String
}

object InteractiveNetworkResolveNameException {
  @scala.inline
  def apply(Classification: InteractionClassification, Context: XInterface, Message: String, Server: String): InteractiveNetworkResolveNameException = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, Message = Message, Server = Server)
  
    __obj.asInstanceOf[InteractiveNetworkResolveNameException]
  }
}

