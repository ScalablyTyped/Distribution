package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to specify a constraint for a solver model. */
trait SolverConstraint extends js.Object {
  var Left: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  var Operator: SolverConstraintOperator
  /** The comparison value, of type `double` or {@link com.sun.star.table.CellAddress} . */
  var Right: js.Any
}

object SolverConstraint {
  @scala.inline
  def apply(
    Left: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    Operator: SolverConstraintOperator,
    Right: js.Any
  ): SolverConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Left")(Left)
    __obj.updateDynamic("Operator")(Operator)
    __obj.updateDynamic("Right")(Right)
    __obj.asInstanceOf[SolverConstraint]
  }
}

