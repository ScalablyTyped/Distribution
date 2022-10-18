package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServiceActionExecutionParametersOutput extends StObject {
  
  /**
    * The parameters of the self-service action.
    */
  var ServiceActionParameters: js.UndefOr[ExecutionParameters] = js.undefined
}
object DescribeServiceActionExecutionParametersOutput {
  
  inline def apply(): DescribeServiceActionExecutionParametersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServiceActionExecutionParametersOutput]
  }
  
  extension [Self <: DescribeServiceActionExecutionParametersOutput](x: Self) {
    
    inline def setServiceActionParameters(value: ExecutionParameters): Self = StObject.set(x, "ServiceActionParameters", value.asInstanceOf[js.Any])
    
    inline def setServiceActionParametersUndefined: Self = StObject.set(x, "ServiceActionParameters", js.undefined)
    
    inline def setServiceActionParametersVarargs(value: ExecutionParameter*): Self = StObject.set(x, "ServiceActionParameters", js.Array(value*))
  }
}
