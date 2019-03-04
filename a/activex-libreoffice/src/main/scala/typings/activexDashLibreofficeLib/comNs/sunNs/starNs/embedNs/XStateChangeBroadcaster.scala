package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** broadcasts message in case embedded object object changes it's state. */
trait XStateChangeBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** adds the specified listener to receive events about states change */
  def addStateChangeListener(xListener: XStateChangeListener): scala.Unit
  /** removes the specified listener */
  def removeStateChangeListener(xListener: XStateChangeListener): scala.Unit
}

object XStateChangeBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addStateChangeListener: js.Function1[XStateChangeListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeStateChangeListener: js.Function1[XStateChangeListener, scala.Unit]
  ): XStateChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire, addStateChangeListener = addStateChangeListener, queryInterface = queryInterface, release = release, removeStateChangeListener = removeStateChangeListener)
  
    __obj.asInstanceOf[XStateChangeBroadcaster]
  }
}

