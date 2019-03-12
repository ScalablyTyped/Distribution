package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to call a solver for a model that is defined by spreadsheet cells. */
trait XSolver
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  var Constraints: stdLib.SafeArray[SolverConstraint]
  var Document: XSpreadsheetDocument
  var Maximize: scala.Boolean
  var Objective: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  var ResultValue: scala.Double
  /** contains the solution's value for each of the variables, if a solution was found. */
  var Solution: stdLib.SafeArray[scala.Double]
  var Success: scala.Boolean
  var Variables: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress]
  def solve(): scala.Unit
}

object XSolver {
  @scala.inline
  def apply(
    Constraints: stdLib.SafeArray[SolverConstraint],
    Document: XSpreadsheetDocument,
    Maximize: scala.Boolean,
    Objective: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    ResultValue: scala.Double,
    Solution: stdLib.SafeArray[scala.Double],
    Success: scala.Boolean,
    Variables: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress],
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    solve: () => scala.Unit
  ): XSolver = {
    val __obj = js.Dynamic.literal(Constraints = Constraints, Document = Document, Maximize = Maximize, Objective = Objective, ResultValue = ResultValue, Solution = Solution, Success = Success, Variables = Variables, acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), solve = js.Any.fromFunction0(solve))
  
    __obj.asInstanceOf[XSolver]
  }
}

