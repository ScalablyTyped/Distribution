package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsServicePlacementConstraintsDetails extends StObject {
  
  /**
    * A cluster query language expression to apply to the constraint. You cannot specify an expression if the constraint type is distinctInstance.
    */
  var Expression: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of constraint. Use distinctInstance to run each task in a particular group on a different container instance. Use memberOf to restrict the selection to a group of valid candidates. Valid values: distinctInstance | memberOf 
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsServicePlacementConstraintsDetails {
  
  inline def apply(): AwsEcsServicePlacementConstraintsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsServicePlacementConstraintsDetails]
  }
  
  extension [Self <: AwsEcsServicePlacementConstraintsDetails](x: Self) {
    
    inline def setExpression(value: NonEmptyString): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "Expression", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
