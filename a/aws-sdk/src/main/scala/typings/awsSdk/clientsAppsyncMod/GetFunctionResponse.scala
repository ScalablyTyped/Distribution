package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFunctionResponse extends StObject {
  
  /**
    * The Function object.
    */
  var functionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined
}
object GetFunctionResponse {
  
  inline def apply(): GetFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFunctionResponse]
  }
  
  extension [Self <: GetFunctionResponse](x: Self) {
    
    inline def setFunctionConfiguration(value: FunctionConfiguration): Self = StObject.set(x, "functionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFunctionConfigurationUndefined: Self = StObject.set(x, "functionConfiguration", js.undefined)
  }
}
