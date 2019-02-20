package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to query cells for dependencies in formulas.
  *
  * All methods return a collection of cell ranges.
  * @see com.sun.star.sheet.SheetRangesQuery
  * @see com.sun.star.sheet.SheetCellRanges
  */
trait XFormulaQuery
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * queries all dependent formula cells.
    *
    * Dependent cells are cells containing formulas with references to the original cell.
    * @param bRecursive `FALSE` = queries cells dependent from the original range(s), `TRUE` = repeats query with all found cells (finds dependents of depende
    * @returns all dependent cells of any formula cell of the current cell range(s).
    */
  def queryDependents(bRecursive: scala.Boolean): XSheetCellRanges
  /**
    * queries all precedent cells.
    *
    * Precedent cells are cells which are referenced from a formula cell.
    * @param bRecursive `FALSE` = queries precedent cells of the original range(s), `TRUE` = repeats query with all found cells (finds precedents of precedent
    * @returns all precedent cells of any formula cell of the current cell range(s).
    */
  def queryPrecedents(bRecursive: scala.Boolean): XSheetCellRanges
}

