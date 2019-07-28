package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
trait XUsedAreaCursor extends XInterface {
  /**
    * points the cursor to the end of the used area.
    * @param bExpand `TRUE` = expands the current cursor range, `FALSE` = sets size of the cursor to a single cell.
    */
  def gotoEndOfUsedArea(bExpand: Boolean): Unit
  /**
    * points the cursor to the start of the used area.
    * @param bExpand `TRUE` = expands the current cursor range, `FALSE` = sets size of the cursor to a single cell.
    */
  def gotoStartOfUsedArea(bExpand: Boolean): Unit
}

object XUsedAreaCursor {
  @scala.inline
  def apply(
    acquire: () => Unit,
    gotoEndOfUsedArea: Boolean => Unit,
    gotoStartOfUsedArea: Boolean => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUsedAreaCursor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), gotoEndOfUsedArea = js.Any.fromFunction1(gotoEndOfUsedArea), gotoStartOfUsedArea = js.Any.fromFunction1(gotoStartOfUsedArea), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XUsedAreaCursor]
  }
}

