package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * identifies an autotext entry.
  * @deprecated Deprecated
  */
trait XAutoTextEntry
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** inserts the contents represented by this auto text entry at the specified text range. */
  def applyTo(xRange: XTextRange): scala.Unit
}

object XAutoTextEntry {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    applyTo: XTextRange => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XAutoTextEntry = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), applyTo = js.Any.fromFunction1(applyTo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAutoTextEntry]
  }
}

