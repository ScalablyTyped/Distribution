package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows locking the input on components. */
trait XBoundControl
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * determines whether the input is currently locked or not.
    * @returns `TRUE` when it is currently locked, otherwise `FALSE` .
    */
  var Lock: scala.Boolean
  /**
    * determines whether the input is currently locked or not.
    * @returns `TRUE` when it is currently locked, otherwise `FALSE` .
    */
  def getLock(): scala.Boolean
  /**
    * is used for altering the current lock state of the component.
    * @param bLock the new lock state.
    */
  def setLock(bLock: scala.Boolean): scala.Unit
}

object XBoundControl {
  @scala.inline
  def apply(
    Lock: scala.Boolean,
    acquire: () => scala.Unit,
    getLock: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setLock: scala.Boolean => scala.Unit
  ): XBoundControl = {
    val __obj = js.Dynamic.literal(Lock = Lock, acquire = js.Any.fromFunction0(acquire), getLock = js.Any.fromFunction0(getLock), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLock = js.Any.fromFunction1(setLock))
  
    __obj.asInstanceOf[XBoundControl]
  }
}

