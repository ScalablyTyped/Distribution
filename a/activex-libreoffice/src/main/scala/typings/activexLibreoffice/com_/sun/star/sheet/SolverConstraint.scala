package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to specify a constraint for a solver model. */
trait SolverConstraint extends StObject {
  
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
  
  @scala.inline
  implicit class SolverConstraintMutableBuilder[Self <: SolverConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: CellAddress): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: SolverConstraintOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: js.Any): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
  }
}
