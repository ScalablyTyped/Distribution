package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionPlacementConstraintsDetails extends StObject {
  
  /**
    * A cluster query language expression to apply to the constraint.
    */
  var Expression: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of constraint.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionPlacementConstraintsDetails {
  
  inline def apply(): AwsEcsTaskDefinitionPlacementConstraintsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionPlacementConstraintsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsTaskDefinitionPlacementConstraintsDetails] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: NonEmptyString): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "Expression", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
