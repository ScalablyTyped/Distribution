package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a VCL container window.
  * @deprecated Deprecated
  */
trait XVclContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns all windows. */
  val Windows: activexDashInteropLib.SafeArray[XWindow]
  /** adds the specified container listener to receive container events from this container. */
  def addVclContainerListener(l: XVclContainerListener): scala.Unit
  /** returns all windows. */
  def getWindows(): activexDashInteropLib.SafeArray[XWindow]
  /** removes the specified container listener so that it no longer receives container events from this container. */
  def removeVclContainerListener(l: XVclContainerListener): scala.Unit
}

object XVclContainer {
  @scala.inline
  def apply(
    Windows: activexDashInteropLib.SafeArray[XWindow],
    acquire: js.Function0[scala.Unit],
    addVclContainerListener: js.Function1[XVclContainerListener, scala.Unit],
    getWindows: js.Function0[activexDashInteropLib.SafeArray[XWindow]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeVclContainerListener: js.Function1[XVclContainerListener, scala.Unit]
  ): XVclContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Windows")(Windows)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addVclContainerListener")(addVclContainerListener)
    __obj.updateDynamic("getWindows")(getWindows)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeVclContainerListener")(removeVclContainerListener)
    __obj.asInstanceOf[XVclContainer]
  }
}

