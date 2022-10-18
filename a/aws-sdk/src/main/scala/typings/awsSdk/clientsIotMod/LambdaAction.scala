package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaAction extends StObject {
  
  /**
    * The ARN of the Lambda function.
    */
  var functionArn: FunctionArn
}
object LambdaAction {
  
  inline def apply(functionArn: FunctionArn): LambdaAction = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaAction]
  }
  
  extension [Self <: LambdaAction](x: Self) {
    
    inline def setFunctionArn(value: FunctionArn): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
  }
}
