package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskDefinitionPlacementConstraint extends StObject {
  
  /**
    * A cluster query language expression to apply to the constraint. For more information, see Cluster query language in the Amazon Elastic Container Service Developer Guide.
    */
  var expression: js.UndefOr[String] = js.undefined
  
  /**
    * The type of constraint. The MemberOf constraint restricts selection to be from a group of valid candidates.
    */
  var `type`: js.UndefOr[TaskDefinitionPlacementConstraintType] = js.undefined
}
object TaskDefinitionPlacementConstraint {
  
  inline def apply(): TaskDefinitionPlacementConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskDefinitionPlacementConstraint]
  }
  
  extension [Self <: TaskDefinitionPlacementConstraint](x: Self) {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setType(value: TaskDefinitionPlacementConstraintType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
