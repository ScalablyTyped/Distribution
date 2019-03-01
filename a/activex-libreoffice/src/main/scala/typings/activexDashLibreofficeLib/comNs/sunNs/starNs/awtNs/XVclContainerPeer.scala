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
    acquire: js.Function0[scala.Unit],
    enableDialogControl: js.Function1[scala.Boolean, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setGroup: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XWindow], scala.Unit],
    setTabOrder: js.Function3[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XWindow], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      scala.Boolean, 
      scala.Unit
    ]
  ): XVclContainerPeer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("enableDialogControl")(enableDialogControl)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setGroup")(setGroup)
    __obj.updateDynamic("setTabOrder")(setTabOrder)
    __obj.asInstanceOf[XVclContainerPeer]
  }
}

