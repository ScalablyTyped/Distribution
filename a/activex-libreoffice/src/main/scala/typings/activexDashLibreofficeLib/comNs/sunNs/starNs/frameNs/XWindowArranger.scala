package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XWindowArranger
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @deprecated Deprecated */
  def arrange(nCommand: scala.Double): scala.Unit
  /** @deprecated Deprecated */
  def hasArrangeCommand(nCommand: scala.Double): scala.Boolean
}

object XWindowArranger {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    arrange: scala.Double => scala.Unit,
    hasArrangeCommand: scala.Double => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XWindowArranger = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), arrange = js.Any.fromFunction1(arrange), hasArrangeCommand = js.Any.fromFunction1(hasArrangeCommand), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XWindowArranger]
  }
}

