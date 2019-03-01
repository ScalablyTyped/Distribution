package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Obtains human readable strings from an {@link XInteractionRequest} . */
trait XInteractionRequestStringResolver
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Obtains a string containing a human readable message from an informational interaction request.
    *
    * An informational interaction request contains not more than one interaction continuation (user has no choice; request is just informational). The
    * supplies continuation must either be a {@link XInteractionAbort} or {@link XInteractionApprove}
    * @param Request the interaction request for that the message shall be obtained.
    * @returns the message string or an empty com::sun::star::beans::Optional.
    */
  def getStringFromInformationalRequest(Request: XInteractionRequest): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Optional[java.lang.String]
}

object XInteractionRequestStringResolver {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getStringFromInformationalRequest: js.Function1[
      XInteractionRequest, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Optional[java.lang.String]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XInteractionRequestStringResolver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getStringFromInformationalRequest")(getStringFromInformationalRequest)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XInteractionRequestStringResolver]
  }
}

