package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XWindowArranger extends XInterface {
  /** @deprecated Deprecated */
  def arrange(nCommand: Double): Unit
  /** @deprecated Deprecated */
  def hasArrangeCommand(nCommand: Double): Boolean
}

object XWindowArranger {
  @scala.inline
  def apply(
    acquire: () => Unit,
    arrange: Double => Unit,
    hasArrangeCommand: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XWindowArranger = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), arrange = js.Any.fromFunction1(arrange), hasArrangeCommand = js.Any.fromFunction1(hasArrangeCommand), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XWindowArranger]
  }
}

