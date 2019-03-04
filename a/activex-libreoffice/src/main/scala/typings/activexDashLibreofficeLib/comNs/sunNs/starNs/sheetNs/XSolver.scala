package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to call a solver for a model that is defined by spreadsheet cells. */
trait XSolver
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  var Constraints: activexDashInteropLib.SafeArray[SolverConstraint]
  var Document: XSpreadsheetDocument
  var Maximize: scala.Boolean
  var Objective: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  var ResultValue: scala.Double
  /** contains the solution's value for each of the variables, if a solution was found. */
  var Solution: activexDashInteropLib.SafeArray[scala.Double]
  var Success: scala.Boolean
  var Variables: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress]
  def solve(): scala.Unit
}

object XSolver {
  @scala.inline
  def apply(
    Constraints: activexDashInteropLib.SafeArray[SolverConstraint],
    Document: XSpreadsheetDocument,
    Maximize: scala.Boolean,
    Objective: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    ResultValue: scala.Double,
    Solution: activexDashInteropLib.SafeArray[scala.Double],
    Success: scala.Boolean,
    Variables: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress],
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    solve: js.Function0[scala.Unit]
  ): XSolver = {
    val __obj = js.Dynamic.literal(Constraints = Constraints, Document = Document, Maximize = Maximize, Objective = Objective, ResultValue = ResultValue, Solution = Solution, Success = Success, Variables = Variables, acquire = acquire, queryInterface = queryInterface, release = release, solve = solve)
  
    __obj.asInstanceOf[XSolver]
  }
}

