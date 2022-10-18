package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFunctionResponse extends StObject {
  
  /**
    * The Function object.
    */
  var functionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined
}
object CreateFunctionResponse {
  
  inline def apply(): CreateFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFunctionResponse]
  }
  
  extension [Self <: CreateFunctionResponse](x: Self) {
    
    inline def setFunctionConfiguration(value: FunctionConfiguration): Self = StObject.set(x, "functionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFunctionConfigurationUndefined: Self = StObject.set(x, "functionConfiguration", js.undefined)
  }
}
