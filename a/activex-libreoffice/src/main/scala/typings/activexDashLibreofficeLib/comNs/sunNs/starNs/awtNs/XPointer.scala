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
    acquire: js.Function0[scala.Unit],
    getType: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setType: js.Function1[scala.Double, scala.Unit]
  ): XPointer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setType")(setType)
    __obj.asInstanceOf[XPointer]
  }
}

