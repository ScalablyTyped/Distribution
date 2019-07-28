package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides seeking a goal value for a cell. */
trait XGoalSeek extends XInterface {
  /**
    * calculates a value which gives a specified result in a formula.
    * @param aFormulaPosition is the address of the formula cell used for the calculation.
    * @param aVariablePosition is the address of the cell that is used in the formula as variable.
    * @param aGoalValue is the value which should be reached during the goal seek.
    * @returns the result of the goal seek, including the value that results in the specified goal, using the specified formula.
    */
  def seekGoal(aFormulaPosition: CellAddress, aVariablePosition: CellAddress, aGoalValue: String): GoalResult
}

object XGoalSeek {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    seekGoal: (CellAddress, CellAddress, String) => GoalResult
  ): XGoalSeek = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), seekGoal = js.Any.fromFunction3(seekGoal))
  
    __obj.asInstanceOf[XGoalSeek]
  }
}

