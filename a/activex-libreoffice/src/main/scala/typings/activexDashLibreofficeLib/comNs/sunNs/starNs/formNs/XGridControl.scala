package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies (some) functionality provided by a grid control (aka table control)
  * @since OOo 3.1
  */
trait XGridControl
  extends XGrid
     with XGridFieldDataSupplier {
  /** registers a listener which is to be notified about state changes in the grid control */
  def addGridControlListener(listener: XGridControlListener): scala.Unit
  /** revokes a previously registered grid control listener */
  def removeGridControlListener(listener: XGridControlListener): scala.Unit
}

object XGridControl {
  @scala.inline
  def apply(
    CurrentColumnPosition: scala.Double,
    acquire: js.Function0[scala.Unit],
    addGridControlListener: js.Function1[XGridControlListener, scala.Unit],
    getCurrentColumnPosition: js.Function0[scala.Double],
    queryFieldData: js.Function2[scala.Double, activexDashLibreofficeLib.`type`, activexDashInteropLib.SafeArray[_]],
    queryFieldDataType: js.Function1[activexDashLibreofficeLib.`type`, activexDashInteropLib.SafeArray[scala.Boolean]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeGridControlListener: js.Function1[XGridControlListener, scala.Unit],
    setCurrentColumnPosition: js.Function1[scala.Double, scala.Unit]
  ): XGridControl = {
    val __obj = js.Dynamic.literal(CurrentColumnPosition = CurrentColumnPosition, acquire = acquire, addGridControlListener = addGridControlListener, getCurrentColumnPosition = getCurrentColumnPosition, queryFieldData = queryFieldData, queryFieldDataType = queryFieldDataType, queryInterface = queryInterface, release = release, removeGridControlListener = removeGridControlListener, setCurrentColumnPosition = setCurrentColumnPosition)
  
    __obj.asInstanceOf[XGridControl]
  }
}

