package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
@js.native
trait XUsedAreaCursor extends XInterface {
  /**
    * points the cursor to the end of the used area.
    * @param bExpand `TRUE` = expands the current cursor range, `FALSE` = sets size of the cursor to a single cell.
    */
  def gotoEndOfUsedArea(bExpand: Boolean): Unit = js.native
  /**
    * points the cursor to the start of the used area.
    * @param bExpand `TRUE` = expands the current cursor range, `FALSE` = sets size of the cursor to a single cell.
    */
  def gotoStartOfUsedArea(bExpand: Boolean): Unit = js.native
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
  @scala.inline
  implicit class XUsedAreaCursorOps[Self <: XUsedAreaCursor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGotoEndOfUsedArea(value: Boolean => Unit): Self = this.set("gotoEndOfUsedArea", js.Any.fromFunction1(value))
    @scala.inline
    def setGotoStartOfUsedArea(value: Boolean => Unit): Self = this.set("gotoStartOfUsedArea", js.Any.fromFunction1(value))
  }
  
}

