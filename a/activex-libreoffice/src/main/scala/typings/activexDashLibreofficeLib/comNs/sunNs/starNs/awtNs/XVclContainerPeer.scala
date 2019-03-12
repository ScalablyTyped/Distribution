package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the VCL container window implementation.
  * @deprecated Deprecated
  */
trait XVclContainerPeer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** enable as dialog control. */
  def enableDialogControl(bEnable: scala.Boolean): scala.Unit
  /** sets a group. */
  def setGroup(Windows: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XWindow]): scala.Unit
  /** sets the tab order. */
  def setTabOrder(
    WindowOrder: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XWindow],
    Tabs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_],
    GroupControl: scala.Boolean
  ): scala.Unit
}

object XVclContainerPeer {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    enableDialogControl: scala.Boolean => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setGroup: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XWindow] => scala.Unit,
    setTabOrder: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XWindow], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Boolean) => scala.Unit
  ): XVclContainerPeer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), enableDialogControl = js.Any.fromFunction1(enableDialogControl), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setGroup = js.Any.fromFunction1(setGroup), setTabOrder = js.Any.fromFunction3(setTabOrder))
  
    __obj.asInstanceOf[XVclContainerPeer]
  }
}

