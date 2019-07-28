package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.`type`
import typings.std.SafeArray
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
  def addGridControlListener(listener: XGridControlListener): Unit
  /** revokes a previously registered grid control listener */
  def removeGridControlListener(listener: XGridControlListener): Unit
}

object XGridControl {
  @scala.inline
  def apply(
    CurrentColumnPosition: Double,
    acquire: () => Unit,
    addGridControlListener: XGridControlListener => Unit,
    getCurrentColumnPosition: () => Double,
    queryFieldData: (Double, `type`) => SafeArray[_],
    queryFieldDataType: `type` => SafeArray[Boolean],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeGridControlListener: XGridControlListener => Unit,
    setCurrentColumnPosition: Double => Unit
  ): XGridControl = {
    val __obj = js.Dynamic.literal(CurrentColumnPosition = CurrentColumnPosition, acquire = js.Any.fromFunction0(acquire), addGridControlListener = js.Any.fromFunction1(addGridControlListener), getCurrentColumnPosition = js.Any.fromFunction0(getCurrentColumnPosition), queryFieldData = js.Any.fromFunction2(queryFieldData), queryFieldDataType = js.Any.fromFunction1(queryFieldDataType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeGridControlListener = js.Any.fromFunction1(removeGridControlListener), setCurrentColumnPosition = js.Any.fromFunction1(setCurrentColumnPosition))
  
    __obj.asInstanceOf[XGridControl]
  }
}

