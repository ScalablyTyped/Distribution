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
    acquire: () => scala.Unit,
    addGridControlListener: XGridControlListener => scala.Unit,
    getCurrentColumnPosition: () => scala.Double,
    queryFieldData: (scala.Double, activexDashLibreofficeLib.`type`) => stdLib.SafeArray[_],
    queryFieldDataType: activexDashLibreofficeLib.`type` => stdLib.SafeArray[scala.Boolean],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeGridControlListener: XGridControlListener => scala.Unit,
    setCurrentColumnPosition: scala.Double => scala.Unit
  ): XGridControl = {
    val __obj = js.Dynamic.literal(CurrentColumnPosition = CurrentColumnPosition, acquire = js.Any.fromFunction0(acquire), addGridControlListener = js.Any.fromFunction1(addGridControlListener), getCurrentColumnPosition = js.Any.fromFunction0(getCurrentColumnPosition), queryFieldData = js.Any.fromFunction2(queryFieldData), queryFieldDataType = js.Any.fromFunction1(queryFieldDataType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeGridControlListener = js.Any.fromFunction1(removeGridControlListener), setCurrentColumnPosition = js.Any.fromFunction1(setCurrentColumnPosition))
  
    __obj.asInstanceOf[XGridControl]
  }
}

