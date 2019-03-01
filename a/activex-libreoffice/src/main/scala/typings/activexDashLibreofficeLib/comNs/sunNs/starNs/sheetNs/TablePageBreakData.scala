package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a page break in a spreadsheet.
  * @see com.sun.star.sheet.XSheetPageBreak
  */
trait TablePageBreakData extends js.Object {
  /** is `TRUE` for a manual page break, `FALSE` for an automatic one. */
  var ManualBreak: scala.Boolean
  /** the position (column or row index) of the page break. */
  var Position: scala.Double
}

object TablePageBreakData {
  @scala.inline
  def apply(ManualBreak: scala.Boolean, Position: scala.Double): TablePageBreakData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ManualBreak")(ManualBreak)
    __obj.updateDynamic("Position")(Position)
    __obj.asInstanceOf[TablePageBreakData]
  }
}

