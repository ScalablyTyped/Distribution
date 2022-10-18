package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFunctionResponse extends StObject {
  
  /**
    * The Function object.
    */
  var functionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined
}
object UpdateFunctionResponse {
  
  inline def apply(): UpdateFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFunctionResponse]
  }
  
  extension [Self <: UpdateFunctionResponse](x: Self) {
    
    inline def setFunctionConfiguration(value: FunctionConfiguration): Self = StObject.set(x, "functionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFunctionConfigurationUndefined: Self = StObject.set(x, "functionConfiguration", js.undefined)
  }
}
