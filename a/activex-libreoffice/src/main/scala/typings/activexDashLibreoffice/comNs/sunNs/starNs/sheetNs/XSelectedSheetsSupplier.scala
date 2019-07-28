package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 3.5 */
trait XSelectedSheetsSupplier extends XInterface {
  /** returns the indices of currently selected sheets. Sheet indices are 0-based. */
  val SelectedSheets: SafeArray[Double]
  /** returns the indices of currently selected sheets. Sheet indices are 0-based. */
  def getSelectedSheets(): SafeArray[Double]
}

object XSelectedSheetsSupplier {
  @scala.inline
  def apply(
    SelectedSheets: SafeArray[Double],
    acquire: () => Unit,
    getSelectedSheets: () => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSelectedSheetsSupplier = {
    val __obj = js.Dynamic.literal(SelectedSheets = SelectedSheets, acquire = js.Any.fromFunction0(acquire), getSelectedSheets = js.Any.fromFunction0(getSelectedSheets), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSelectedSheetsSupplier]
  }
}

