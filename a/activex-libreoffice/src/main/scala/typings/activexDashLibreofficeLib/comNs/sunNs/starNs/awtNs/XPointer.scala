package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the type of mouse pointer. */
trait XPointer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the currently set {@link SystemPointer} of this mouse pointer. */
  var Type: scala.Double
  /** returns the currently set {@link SystemPointer} of this mouse pointer. */
  def getType(): scala.Double
  /** selects a {@link SystemPointer} for this mouse pointer. */
  def setType(nType: scala.Double): scala.Unit
}

object XPointer {
  @scala.inline
  def apply(
    Type: scala.Double,
    acquire: () => scala.Unit,
    getType: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setType: scala.Double => scala.Unit
  ): XPointer = {
    val __obj = js.Dynamic.literal(Type = Type, acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setType = js.Any.fromFunction1(setType))
  
    __obj.asInstanceOf[XPointer]
  }
}

