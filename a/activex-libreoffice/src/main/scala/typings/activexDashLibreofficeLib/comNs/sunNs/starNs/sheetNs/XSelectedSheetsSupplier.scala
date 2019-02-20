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

