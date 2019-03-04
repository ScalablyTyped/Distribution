package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to find the used area of the entire sheet.
  *
  * The used area is the smallest cell range that contains all cells of the spreadsheet with any contents (values, text, formulas) or visible formatting
  * (borders and background color).
  * @see com.sun.star.sheet.SheetCellCursor
  */
trait XUsedAreaCursor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * points the cursor to the end of the used area.
    * @param bExpand `TRUE` = expands the current cursor range, `FALSE` = sets size of the cursor to a single cell.
    */
  def gotoEndOfUsedArea(bExpand: scala.Boolean): scala.Unit
  /**
    * points the cursor to the start of the used area.
    * @param bExpand `TRUE` = expands the current cursor range, `FALSE` = sets size of the cursor to a single cell.
    */
  def gotoStartOfUsedArea(bExpand: scala.Boolean): scala.Unit
}

object XUsedAreaCursor {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    gotoEndOfUsedArea: js.Function1[scala.Boolean, scala.Unit],
    gotoStartOfUsedArea: js.Function1[scala.Boolean, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XUsedAreaCursor = {
    val __obj = js.Dynamic.literal(acquire = acquire, gotoEndOfUsedArea = gotoEndOfUsedArea, gotoStartOfUsedArea = gotoStartOfUsedArea, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XUsedAreaCursor]
  }
}

