package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Listener for closing of the corresponding session. */
trait XCloseSessionListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Notifies a closesession listener that the corresponding session was logged out
    * @param sessionData [in]: the data identifying the session that was closed
    */
  def sessionClosed(sessionData: js.Any): scala.Unit
}

object XCloseSessionListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    sessionClosed: js.Function1[js.Any, scala.Unit]
  ): XCloseSessionListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, sessionClosed = sessionClosed)
  
    __obj.asInstanceOf[XCloseSessionListener]
  }
}

