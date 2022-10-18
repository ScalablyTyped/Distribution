package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFunctionUrlConfigRequest extends StObject {
  
  /**
    * The type of authentication that your function URL uses. Set to AWS_IAM if you want to restrict access to authenticated IAM users only. Set to NONE if you want to bypass IAM authentication to create a public endpoint. For more information, see  Security and auth model for Lambda function URLs.
    */
  var AuthType: js.UndefOr[FunctionUrlAuthType] = js.undefined
  
  /**
    * The cross-origin resource sharing (CORS) settings for your function URL.
    */
  var Cors: js.UndefOr[typings.awsSdk.clientsLambdaMod.Cors] = js.undefined
  
  /**
    * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.clientsLambdaMod.FunctionName
  
  /**
    * The alias name.
    */
  var Qualifier: js.UndefOr[FunctionUrlQualifier] = js.undefined
}
object UpdateFunctionUrlConfigRequest {
  
  inline def apply(FunctionName: FunctionName): UpdateFunctionUrlConfigRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionUrlConfigRequest]
  }
  
  extension [Self <: UpdateFunctionUrlConfigRequest](x: Self) {
    
    inline def setAuthType(value: FunctionUrlAuthType): Self = StObject.set(x, "AuthType", value.asInstanceOf[js.Any])
    
    inline def setAuthTypeUndefined: Self = StObject.set(x, "AuthType", js.undefined)
    
    inline def setCors(value: Cors): Self = StObject.set(x, "Cors", value.asInstanceOf[js.Any])
    
    inline def setCorsUndefined: Self = StObject.set(x, "Cors", js.undefined)
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setQualifier(value: FunctionUrlQualifier): Self = StObject.set(x, "Qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierUndefined: Self = StObject.set(x, "Qualifier", js.undefined)
  }
}
