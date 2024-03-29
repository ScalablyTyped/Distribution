package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to call a solver for a model that is defined by spreadsheet cells. */
trait XSolver
  extends StObject
     with XInterface {
  
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
  
  inline def apply(
    Constraints: SafeArray[SolverConstraint],
    Document: XSpreadsheetDocument,
    Maximize: Boolean,
    Objective: CellAddress,
    ResultValue: Double,
    Solution: SafeArray[Double],
    Success: Boolean,
    Variables: SafeArray[CellAddress],
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    solve: () => Unit
  ): XSolver = {
    val __obj = js.Dynamic.literal(Constraints = Constraints.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], Maximize = Maximize.asInstanceOf[js.Any], Objective = Objective.asInstanceOf[js.Any], ResultValue = ResultValue.asInstanceOf[js.Any], Solution = Solution.asInstanceOf[js.Any], Success = Success.asInstanceOf[js.Any], Variables = Variables.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), solve = js.Any.fromFunction0(solve))
    __obj.asInstanceOf[XSolver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSolver] (val x: Self) extends AnyVal {
    
    inline def setConstraints(value: SafeArray[SolverConstraint]): Self = StObject.set(x, "Constraints", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: XSpreadsheetDocument): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    inline def setMaximize(value: Boolean): Self = StObject.set(x, "Maximize", value.asInstanceOf[js.Any])
    
    inline def setObjective(value: CellAddress): Self = StObject.set(x, "Objective", value.asInstanceOf[js.Any])
    
    inline def setResultValue(value: Double): Self = StObject.set(x, "ResultValue", value.asInstanceOf[js.Any])
    
    inline def setSolution(value: SafeArray[Double]): Self = StObject.set(x, "Solution", value.asInstanceOf[js.Any])
    
    inline def setSolve(value: () => Unit): Self = StObject.set(x, "solve", js.Any.fromFunction0(value))
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: SafeArray[CellAddress]): Self = StObject.set(x, "Variables", value.asInstanceOf[js.Any])
  }
}
