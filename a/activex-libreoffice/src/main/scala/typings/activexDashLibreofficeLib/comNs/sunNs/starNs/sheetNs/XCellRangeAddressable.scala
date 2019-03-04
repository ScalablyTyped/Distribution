package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a cell which can be addressed with a {@link com.sun.star.table.CellRangeAddress} . */
trait XCellRangeAddressable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the address of the cell range in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellRangeAddress} can be used to address the range within its document.
    */
  val RangeAddress: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /**
    * returns the address of the cell range in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellRangeAddress} can be used to address the range within its document.
    */
  def getRangeAddress(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
}

object XCellRangeAddressable {
  @scala.inline
  def apply(
    RangeAddress: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    acquire: js.Function0[scala.Unit],
    getRangeAddress: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCellRangeAddressable = {
    val __obj = js.Dynamic.literal(RangeAddress = RangeAddress, acquire = acquire, getRangeAddress = getRangeAddress, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XCellRangeAddressable]
  }
}

