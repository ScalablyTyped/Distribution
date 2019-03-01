package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the tab controllers of a {@link UnoControlContainer} . */
trait XUnoControlContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns all currently specified tab controllers. */
  var TabControllers: activexDashInteropLib.SafeArray[XTabController]
  /** adds a single tab controller. */
  def addTabController(TabController: XTabController): scala.Unit
  /** returns all currently specified tab controllers. */
  def getTabControllers(): activexDashInteropLib.SafeArray[XTabController]
  /** removes a single tab controller. */
  def removeTabController(TabController: XTabController): scala.Unit
  /** sets a set of tab controllers. */
  def setTabControllers(TabControllers: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XTabController]): scala.Unit
}

object XUnoControlContainer {
  @scala.inline
  def apply(
    TabControllers: activexDashInteropLib.SafeArray[XTabController],
    acquire: js.Function0[scala.Unit],
    addTabController: js.Function1[XTabController, scala.Unit],
    getTabControllers: js.Function0[activexDashInteropLib.SafeArray[XTabController]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeTabController: js.Function1[XTabController, scala.Unit],
    setTabControllers: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XTabController], scala.Unit]
  ): XUnoControlContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("TabControllers")(TabControllers)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addTabController")(addTabController)
    __obj.updateDynamic("getTabControllers")(getTabControllers)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeTabController")(removeTabController)
    __obj.updateDynamic("setTabControllers")(setTabControllers)
    __obj.asInstanceOf[XUnoControlContainer]
  }
}

