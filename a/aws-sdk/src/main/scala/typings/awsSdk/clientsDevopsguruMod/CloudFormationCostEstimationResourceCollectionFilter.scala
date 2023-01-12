package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudFormationCostEstimationResourceCollectionFilter extends StObject {
  
  /**
    * An array of CloudFormation stack names. Its size is fixed at 1 item.
    */
  var StackNames: js.UndefOr[CostEstimationStackNames] = js.undefined
}
object CloudFormationCostEstimationResourceCollectionFilter {
  
  inline def apply(): CloudFormationCostEstimationResourceCollectionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFormationCostEstimationResourceCollectionFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudFormationCostEstimationResourceCollectionFilter] (val x: Self) extends AnyVal {
    
    inline def setStackNames(value: CostEstimationStackNames): Self = StObject.set(x, "StackNames", value.asInstanceOf[js.Any])
    
    inline def setStackNamesUndefined: Self = StObject.set(x, "StackNames", js.undefined)
    
    inline def setStackNamesVarargs(value: StackName*): Self = StObject.set(x, "StackNames", js.Array(value*))
  }
}
