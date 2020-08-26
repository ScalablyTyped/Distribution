package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to call a solver for a model that is defined by spreadsheet cells. */
@js.native
trait XSolver extends XInterface {
  var Constraints: SafeArray[SolverConstraint] = js.native
  var Document: XSpreadsheetDocument = js.native
  var Maximize: Boolean = js.native
  var Objective: CellAddress = js.native
  var ResultValue: Double = js.native
  /** contains the solution's value for each of the variables, if a solution was found. */
  var Solution: SafeArray[Double] = js.native
  var Success: Boolean = js.native
  var Variables: SafeArray[CellAddress] = js.native
  def solve(): Unit = js.native
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
    val __obj = js.Dynamic.literal(Constraints = Constraints.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], Maximize = Maximize.asInstanceOf[js.Any], Objective = Objective.asInstanceOf[js.Any], ResultValue = ResultValue.asInstanceOf[js.Any], Solution = Solution.asInstanceOf[js.Any], Success = Success.asInstanceOf[js.Any], Variables = Variables.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), solve = js.Any.fromFunction0(solve))
    __obj.asInstanceOf[XSolver]
  }
  @scala.inline
  implicit class XSolverOps[Self <: XSolver] (val x: Self) extends AnyVal {
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
    def setConstraints(value: SafeArray[SolverConstraint]): Self = this.set("Constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocument(value: XSpreadsheetDocument): Self = this.set("Document", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximize(value: Boolean): Self = this.set("Maximize", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjective(value: CellAddress): Self = this.set("Objective", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultValue(value: Double): Self = this.set("ResultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setSolution(value: SafeArray[Double]): Self = this.set("Solution", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("Success", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: SafeArray[CellAddress]): Self = this.set("Variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setSolve(value: () => Unit): Self = this.set("solve", js.Any.fromFunction0(value))
  }
  
}

