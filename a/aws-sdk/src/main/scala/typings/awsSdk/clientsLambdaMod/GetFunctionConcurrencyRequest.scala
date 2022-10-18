package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFunctionConcurrencyRequest extends StObject {
  
  /**
    * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.clientsLambdaMod.FunctionName
}
object GetFunctionConcurrencyRequest {
  
  inline def apply(FunctionName: FunctionName): GetFunctionConcurrencyRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionConcurrencyRequest]
  }
  
  extension [Self <: GetFunctionConcurrencyRequest](x: Self) {
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
  }
}
