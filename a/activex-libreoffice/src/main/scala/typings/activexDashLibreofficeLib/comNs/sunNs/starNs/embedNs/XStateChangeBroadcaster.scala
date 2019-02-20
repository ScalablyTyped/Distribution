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

