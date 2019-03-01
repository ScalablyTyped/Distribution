package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a method to apply TableAutoFormats to a cell range. */
trait XAutoFormattable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * applies an AutoFormat to the cell range of the current context.
    * @param aName is the name of the AutoFormat to apply.
    * @throws com::sun::star::lang::IllegalArgumentException if the specified AutoFormat does not exist.
    */
  def autoFormat(aName: java.lang.String): scala.Unit
}

object XAutoFormattable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    autoFormat: js.Function1[java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAutoFormattable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("autoFormat")(autoFormat)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XAutoFormattable]
  }
}

