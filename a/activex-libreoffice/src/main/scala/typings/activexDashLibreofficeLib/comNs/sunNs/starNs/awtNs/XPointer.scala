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

