package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to specify a constraint for a solver model. */
trait SolverConstraint extends js.Object {
  var Left: CellAddress
  var Operator: SolverConstraintOperator
  /** The comparison value, of type `double` or {@link com.sun.star.table.CellAddress} . */
  var Right: js.Any
}

object SolverConstraint {
  @scala.inline
  def apply(Left: CellAddress, Operator: SolverConstraintOperator, Right: js.Any): SolverConstraint = {
    val __obj = js.Dynamic.literal(Left = Left.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolverConstraint]
  }
}

