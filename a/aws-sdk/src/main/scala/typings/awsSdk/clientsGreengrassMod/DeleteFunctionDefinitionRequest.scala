package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFunctionDefinitionRequest extends StObject {
  
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: string
}
object DeleteFunctionDefinitionRequest {
  
  inline def apply(FunctionDefinitionId: string): DeleteFunctionDefinitionRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFunctionDefinitionRequest]
  }
  
  extension [Self <: DeleteFunctionDefinitionRequest](x: Self) {
    
    inline def setFunctionDefinitionId(value: string): Self = StObject.set(x, "FunctionDefinitionId", value.asInstanceOf[js.Any])
  }
}
