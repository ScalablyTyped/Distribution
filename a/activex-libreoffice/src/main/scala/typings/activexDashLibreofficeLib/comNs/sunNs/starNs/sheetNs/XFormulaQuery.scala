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

object XFormulaQuery {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryDependents: js.Function1[scala.Boolean, XSheetCellRanges],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryPrecedents: js.Function1[scala.Boolean, XSheetCellRanges],
    release: js.Function0[scala.Unit]
  ): XFormulaQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryDependents")(queryDependents)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("queryPrecedents")(queryPrecedents)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XFormulaQuery]
  }
}

