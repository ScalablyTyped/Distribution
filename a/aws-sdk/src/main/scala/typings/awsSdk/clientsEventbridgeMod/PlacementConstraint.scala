package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementConstraint extends StObject {
  
  /**
    * A cluster query language expression to apply to the constraint. You cannot specify an expression if the constraint type is distinctInstance. To learn more, see Cluster Query Language in the Amazon Elastic Container Service Developer Guide. 
    */
  var expression: js.UndefOr[PlacementConstraintExpression] = js.undefined
  
  /**
    * The type of constraint. Use distinctInstance to ensure that each task in a particular group is running on a different container instance. Use memberOf to restrict the selection to a group of valid candidates. 
    */
  var `type`: js.UndefOr[PlacementConstraintType] = js.undefined
}
object PlacementConstraint {
  
  inline def apply(): PlacementConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementConstraint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlacementConstraint] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: PlacementConstraintExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setType(value: PlacementConstraintType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
