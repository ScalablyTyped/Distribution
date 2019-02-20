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

