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
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setBlockerId: js.Function1[scala.Double, scala.Unit]
  ): XBlockerMonitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setBlockerId")(setBlockerId)
    __obj.asInstanceOf[XBlockerMonitor]
  }
}

