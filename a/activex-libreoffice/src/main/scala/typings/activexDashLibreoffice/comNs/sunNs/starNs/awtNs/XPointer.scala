package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the type of mouse pointer. */
trait XPointer extends XInterface {
  /** returns the currently set {@link SystemPointer} of this mouse pointer. */
  var Type: Double
  /** returns the currently set {@link SystemPointer} of this mouse pointer. */
  def getType(): Double
  /** selects a {@link SystemPointer} for this mouse pointer. */
  def setType(nType: Double): Unit
}

object XPointer {
  @scala.inline
  def apply(
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setType: Double => Unit
  ): XPointer = {
    val __obj = js.Dynamic.literal(Type = Type, acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setType = js.Any.fromFunction1(setType))
  
    __obj.asInstanceOf[XPointer]
  }
}

