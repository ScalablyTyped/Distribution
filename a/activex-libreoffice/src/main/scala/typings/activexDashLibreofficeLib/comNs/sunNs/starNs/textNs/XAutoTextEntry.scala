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
    acquire: js.Function0[scala.Unit],
    applyTo: js.Function1[XTextRange, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAutoTextEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("applyTo")(applyTo)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XAutoTextEntry]
  }
}

