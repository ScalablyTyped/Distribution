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
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    sessionClosed: js.Any => scala.Unit
  ): XCloseSessionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), sessionClosed = js.Any.fromFunction1(sessionClosed))
  
    __obj.asInstanceOf[XCloseSessionListener]
  }
}

