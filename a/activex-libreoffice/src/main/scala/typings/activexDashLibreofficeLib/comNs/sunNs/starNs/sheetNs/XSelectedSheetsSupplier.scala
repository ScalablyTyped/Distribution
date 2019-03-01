package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 3.5 */
trait XSelectedSheetsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the indices of currently selected sheets. Sheet indices are 0-based. */
  val SelectedSheets: activexDashInteropLib.SafeArray[scala.Double]
  /** returns the indices of currently selected sheets. Sheet indices are 0-based. */
  def getSelectedSheets(): activexDashInteropLib.SafeArray[scala.Double]
}

object XSelectedSheetsSupplier {
  @scala.inline
  def apply(
    SelectedSheets: activexDashInteropLib.SafeArray[scala.Double],
    acquire: js.Function0[scala.Unit],
    getSelectedSheets: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSelectedSheetsSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SelectedSheets")(SelectedSheets)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getSelectedSheets")(getSelectedSheets)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSelectedSheetsSupplier]
  }
}

