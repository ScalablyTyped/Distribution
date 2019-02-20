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

