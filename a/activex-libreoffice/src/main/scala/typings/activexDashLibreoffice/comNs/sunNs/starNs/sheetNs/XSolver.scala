package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to call a solver for a model that is defined by spreadsheet cells. */
trait XSolver extends XInterface {
  var Constraints: SafeArray[SolverConstraint]
  var Document: XSpreadsheetDocument
  var Maximize: Boolean
  var Objective: CellAddress
  var ResultValue: Double
  /** contains the solution's value for each of the variables, if a solution was found. */
  var Solution: SafeArray[Double]
  var Success: Boolean
  var Variables: SafeArray[CellAddress]
  def solve(): Unit
}

object XSolver {
  @scala.inline
  def apply(
    Constraints: SafeArray[SolverConstraint],
    Document: XSpreadsheetDocument,
    Maximize: Boolean,
    Objective: CellAddress,
    ResultValue: Double,
    Solution: SafeArray[Double],
    Success: Boolean,
    Variables: SafeArray[CellAddress],
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    solve: () => Unit
  ): XSolver = {
    val __obj = js.Dynamic.literal(Constraints = Constraints, Document = Document, Maximize = Maximize, Objective = Objective, ResultValue = ResultValue, Solution = Solution, Success = Success, Variables = Variables, acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), solve = js.Any.fromFunction0(solve))
  
    __obj.asInstanceOf[XSolver]
  }
}

