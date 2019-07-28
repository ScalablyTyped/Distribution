package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.Optional
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Obtains human readable strings from an {@link XInteractionRequest} . */
trait XInteractionRequestStringResolver extends XInterface {
  /**
    * Obtains a string containing a human readable message from an informational interaction request.
    *
    * An informational interaction request contains not more than one interaction continuation (user has no choice; request is just informational). The
    * supplies continuation must either be a {@link XInteractionAbort} or {@link XInteractionApprove}
    * @param Request the interaction request for that the message shall be obtained.
    * @returns the message string or an empty com::sun::star::beans::Optional.
    */
  def getStringFromInformationalRequest(Request: XInteractionRequest): Optional[String]
}

object XInteractionRequestStringResolver {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getStringFromInformationalRequest: XInteractionRequest => Optional[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInteractionRequestStringResolver = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getStringFromInformationalRequest = js.Any.fromFunction1(getStringFromInformationalRequest), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XInteractionRequestStringResolver]
  }
}

