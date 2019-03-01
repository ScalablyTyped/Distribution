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
    acquire: js.Function0[scala.Unit],
    clearArrows: js.Function0[scala.Unit],
    hideDependents: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, scala.Boolean],
    hidePrecedents: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    showDependents: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, scala.Boolean],
    showErrors: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, scala.Boolean],
    showInvalid: js.Function0[scala.Boolean],
    showPrecedents: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, scala.Boolean]
  ): XSheetAuditing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("clearArrows")(clearArrows)
    __obj.updateDynamic("hideDependents")(hideDependents)
    __obj.updateDynamic("hidePrecedents")(hidePrecedents)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("showDependents")(showDependents)
    __obj.updateDynamic("showErrors")(showErrors)
    __obj.updateDynamic("showInvalid")(showInvalid)
    __obj.updateDynamic("showPrecedents")(showPrecedents)
    __obj.asInstanceOf[XSheetAuditing]
  }
}

