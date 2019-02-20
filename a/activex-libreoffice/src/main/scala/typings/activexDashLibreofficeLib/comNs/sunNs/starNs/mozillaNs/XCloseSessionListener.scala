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

