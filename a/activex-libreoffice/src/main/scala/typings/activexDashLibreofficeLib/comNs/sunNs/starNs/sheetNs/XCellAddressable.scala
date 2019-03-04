package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a cell which can be addressed with a {@link com.sun.star.table.CellAddress} . */
trait XCellAddressable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the address of the cell in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellAddress} can be used to address the cell within its document.
    */
  val CellAddress: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  /**
    * returns the address of the cell in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellAddress} can be used to address the cell within its document.
    */
  def getCellAddress(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
}

object XCellAddressable {
  @scala.inline
  def apply(
    CellAddress: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    acquire: js.Function0[scala.Unit],
    getCellAddress: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCellAddressable = {
    val __obj = js.Dynamic.literal(CellAddress = CellAddress, acquire = acquire, getCellAddress = getCellAddress, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XCellAddressable]
  }
}

