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
  var Right: Any
}
object SolverConstraint {
  
  inline def apply(Left: CellAddress, Operator: SolverConstraintOperator, Right: Any): SolverConstraint = {
    val __obj = js.Dynamic.literal(Left = Left.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolverConstraint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SolverConstraint] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: CellAddress): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: SolverConstraintOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Any): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
  }
}
