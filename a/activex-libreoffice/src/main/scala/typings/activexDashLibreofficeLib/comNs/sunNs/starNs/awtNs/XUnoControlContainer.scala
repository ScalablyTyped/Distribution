package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the tab controllers of a {@link UnoControlContainer} . */
trait XUnoControlContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns all currently specified tab controllers. */
  var TabControllers: stdLib.SafeArray[XTabController]
  /** adds a single tab controller. */
  def addTabController(TabController: XTabController): scala.Unit
  /** returns all currently specified tab controllers. */
  def getTabControllers(): stdLib.SafeArray[XTabController]
  /** removes a single tab controller. */
  def removeTabController(TabController: XTabController): scala.Unit
  /** sets a set of tab controllers. */
  def setTabControllers(TabControllers: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XTabController]): scala.Unit
}

object XUnoControlContainer {
  @scala.inline
  def apply(
    TabControllers: stdLib.SafeArray[XTabController],
    acquire: () => scala.Unit,
    addTabController: XTabController => scala.Unit,
    getTabControllers: () => stdLib.SafeArray[XTabController],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeTabController: XTabController => scala.Unit,
    setTabControllers: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XTabController] => scala.Unit
  ): XUnoControlContainer = {
    val __obj = js.Dynamic.literal(TabControllers = TabControllers, acquire = js.Any.fromFunction0(acquire), addTabController = js.Any.fromFunction1(addTabController), getTabControllers = js.Any.fromFunction0(getTabControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTabController = js.Any.fromFunction1(removeTabController), setTabControllers = js.Any.fromFunction1(setTabControllers))
  
    __obj.asInstanceOf[XUnoControlContainer]
  }
}

