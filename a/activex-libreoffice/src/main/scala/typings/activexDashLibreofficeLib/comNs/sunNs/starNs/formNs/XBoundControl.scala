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
    acquire: js.Function0[scala.Unit],
    getLock: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setLock: js.Function1[scala.Boolean, scala.Unit]
  ): XBoundControl = {
    val __obj = js.Dynamic.literal(Lock = Lock, acquire = acquire, getLock = getLock, queryInterface = queryInterface, release = release, setLock = setLock)
  
    __obj.asInstanceOf[XBoundControl]
  }
}

