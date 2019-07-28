package typings.activexDashLibreoffice.comNs.sunNs.starNs.mozillaNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Listener for closing of the corresponding session. */
trait XCloseSessionListener extends XInterface {
  /**
    * Notifies a closesession listener that the corresponding session was logged out
    * @param sessionData [in]: the data identifying the session that was closed
    */
  def sessionClosed(sessionData: js.Any): Unit
}

object XCloseSessionListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    sessionClosed: js.Any => Unit
  ): XCloseSessionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), sessionClosed = js.Any.fromFunction1(sessionClosed))
  
    __obj.asInstanceOf[XCloseSessionListener]
  }
}

