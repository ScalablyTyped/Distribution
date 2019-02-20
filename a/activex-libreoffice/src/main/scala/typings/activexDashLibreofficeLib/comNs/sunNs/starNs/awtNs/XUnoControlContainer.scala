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

