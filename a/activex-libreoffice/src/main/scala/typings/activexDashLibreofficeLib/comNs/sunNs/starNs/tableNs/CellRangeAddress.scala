package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a cell range address within a spreadsheet document. */
trait CellRangeAddress extends js.Object {
  /** is the index of the column of the right edge of the range. */
  var EndColumn: scala.Double
  /** is the index of the row of the bottom edge of the range. */
  var EndRow: scala.Double
  /** is the index of the sheet that contains the cell range. */
  var Sheet: scala.Double
  /** is the index of the column of the left edge of the range. */
  var StartColumn: scala.Double
  /** is the index of the row of the top edge of the range. */
  var StartRow: scala.Double
}

object CellRangeAddress {
  @scala.inline
  def apply(
    EndColumn: scala.Double,
    EndRow: scala.Double,
    Sheet: scala.Double,
    StartColumn: scala.Double,
    StartRow: scala.Double
  ): CellRangeAddress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EndColumn")(EndColumn)
    __obj.updateDynamic("EndRow")(EndRow)
    __obj.updateDynamic("Sheet")(Sheet)
    __obj.updateDynamic("StartColumn")(StartColumn)
    __obj.updateDynamic("StartRow")(StartRow)
    __obj.asInstanceOf[CellRangeAddress]
  }
}

