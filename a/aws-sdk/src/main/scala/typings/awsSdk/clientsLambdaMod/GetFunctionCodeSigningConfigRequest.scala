package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFunctionCodeSigningConfigRequest extends StObject {
  
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.clientsLambdaMod.FunctionName
}
object GetFunctionCodeSigningConfigRequest {
  
  inline def apply(FunctionName: FunctionName): GetFunctionCodeSigningConfigRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionCodeSigningConfigRequest]
  }
  
  extension [Self <: GetFunctionCodeSigningConfigRequest](x: Self) {
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
  }
}
