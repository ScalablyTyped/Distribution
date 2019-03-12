package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Blocker Monitor.
  *
  * This interface is used to manipulate a blocker.
  */
trait XBlockerMonitor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Configures the blocker's id.
    * @param id the keeper id of the blocker
    */
  def setBlockerId(id: scala.Double): scala.Unit
}

object XBlockerMonitor {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setBlockerId: scala.Double => scala.Unit
  ): XBlockerMonitor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setBlockerId = js.Any.fromFunction1(setBlockerId))
  
    __obj.asInstanceOf[XBlockerMonitor]
  }
}

