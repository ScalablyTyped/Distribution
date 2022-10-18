package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentResponse extends StObject {
  
  /**
    * Error messages for environment variables that couldn't be applied.
    */
  var Error: js.UndefOr[EnvironmentError] = js.undefined
  
  /**
    * Environment variable key-value pairs.
    */
  var Variables: js.UndefOr[EnvironmentVariables] = js.undefined
}
object EnvironmentResponse {
  
  inline def apply(): EnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentResponse]
  }
  
  extension [Self <: EnvironmentResponse](x: Self) {
    
    inline def setError(value: EnvironmentError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setVariables(value: EnvironmentVariables): Self = StObject.set(x, "Variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "Variables", js.undefined)
  }
}
