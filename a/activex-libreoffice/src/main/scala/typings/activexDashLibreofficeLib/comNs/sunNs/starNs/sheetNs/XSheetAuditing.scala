package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides methods to access auditing (detective) features in a spreadsheet. */
trait XSheetAuditing
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** removes all auditing arrows from the spreadsheet. */
  def clearArrows(): scala.Unit
  /**
    * removes arrows for one level of dependents of a formula cell.
    *
    * If the method is executed again for the same cell, the previous level of dependent cells is removed.
    * @param aPosition the address of the formula cell.
    */
  def hideDependents(aPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress): scala.Boolean
  /**
    * removes arrows for one level of precedents of a formula cell.
    *
    * If the method is executed again for the same cell, the previous level of dependent cells is removed.
    * @param aPosition the address of the formula cell.
    */
  def hidePrecedents(aPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress): scala.Boolean
  /**
    * draws arrows between a formula cell and its dependents.
    *
    * If the method is executed again for the same cell, the next level of dependent cells is marked.
    * @param aPosition the address of the formula cell.
    */
  def showDependents(aPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress): scala.Boolean
  /** draws arrows between a formula cell containing an error and the cells causing the error. */
  def showErrors(aPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress): scala.Boolean
  /** marks all cells containing invalid values. */
  def showInvalid(): scala.Boolean
  /**
    * draws arrows between a formula cell and its precedents.
    *
    * If the method is executed again for the same cell, the next level of dependent cells is marked.
    * @param aPosition the address of the formula cell.
    */
  def showPrecedents(aPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress): scala.Boolean
}

object XSheetAuditing {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    clearArrows: () => scala.Unit,
    hideDependents: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress => scala.Boolean,
    hidePrecedents: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    showDependents: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress => scala.Boolean,
    showErrors: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress => scala.Boolean,
    showInvalid: () => scala.Boolean,
    showPrecedents: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress => scala.Boolean
  ): XSheetAuditing = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), clearArrows = js.Any.fromFunction0(clearArrows), hideDependents = js.Any.fromFunction1(hideDependents), hidePrecedents = js.Any.fromFunction1(hidePrecedents), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), showDependents = js.Any.fromFunction1(showDependents), showErrors = js.Any.fromFunction1(showErrors), showInvalid = js.Any.fromFunction0(showInvalid), showPrecedents = js.Any.fromFunction1(showPrecedents))
  
    __obj.asInstanceOf[XSheetAuditing]
  }
}

