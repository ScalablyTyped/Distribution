package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersResult extends StObject {
  
  /**
    * A list of parameters that aren't formatted correctly or don't run during an execution.
    */
  var InvalidParameters: js.UndefOr[ParameterNameList] = js.undefined
  
  /**
    * A list of details for a parameter.
    */
  var Parameters: js.UndefOr[ParameterList] = js.undefined
}
object GetParametersResult {
  
  inline def apply(): GetParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParametersResult]
  }
  
  extension [Self <: GetParametersResult](x: Self) {
    
    inline def setInvalidParameters(value: ParameterNameList): Self = StObject.set(x, "InvalidParameters", value.asInstanceOf[js.Any])
    
    inline def setInvalidParametersUndefined: Self = StObject.set(x, "InvalidParameters", js.undefined)
    
    inline def setInvalidParametersVarargs(value: PSParameterName*): Self = StObject.set(x, "InvalidParameters", js.Array(value*))
    
    inline def setParameters(value: ParameterList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
  }
}
