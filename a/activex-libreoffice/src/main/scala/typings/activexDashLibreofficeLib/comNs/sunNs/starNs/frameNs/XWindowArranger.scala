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
    acquire: js.Function0[scala.Unit],
    arrange: js.Function1[scala.Double, scala.Unit],
    hasArrangeCommand: js.Function1[scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XWindowArranger = {
    val __obj = js.Dynamic.literal(acquire = acquire, arrange = arrange, hasArrangeCommand = hasArrangeCommand, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XWindowArranger]
  }
}

