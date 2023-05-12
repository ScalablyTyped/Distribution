package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFunctionUrlConfigRequest extends StObject {
  
  /**
    * The type of authentication that your function URL uses. Set to AWS_IAM if you want to restrict access to authenticated users only. Set to NONE if you want to bypass IAM authentication to create a public endpoint. For more information, see Security and auth model for Lambda function URLs.
    */
  var AuthType: FunctionUrlAuthType
  
  /**
    * The cross-origin resource sharing (CORS) settings for your function URL.
    */
  var Cors: js.UndefOr[typings.awsSdk.clientsLambdaMod.Cors] = js.undefined
  
  /**
    * The name of the Lambda function.  Name formats     Function name – my-function.    Function ARN – arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN – 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.clientsLambdaMod.FunctionName
  
  /**
    * Use one of the following options:    BUFFERED – This is the default option. Lambda invokes your function using the Invoke API operation. Invocation results are available when the payload is complete. The maximum payload size is 6 MB.    RESPONSE_STREAM – Your function streams payload results as they become available. Lambda invokes your function using the InvokeWithResponseStream API operation. The maximum response payload size is 20 MB, however, you can request a quota increase.  
    */
  var InvokeMode: js.UndefOr[typings.awsSdk.clientsLambdaMod.InvokeMode] = js.undefined
  
  /**
    * The alias name.
    */
  var Qualifier: js.UndefOr[FunctionUrlQualifier] = js.undefined
}
object CreateFunctionUrlConfigRequest {
  
  inline def apply(AuthType: FunctionUrlAuthType, FunctionName: FunctionName): CreateFunctionUrlConfigRequest = {
    val __obj = js.Dynamic.literal(AuthType = AuthType.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFunctionUrlConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFunctionUrlConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthType(value: FunctionUrlAuthType): Self = StObject.set(x, "AuthType", value.asInstanceOf[js.Any])
    
    inline def setCors(value: Cors): Self = StObject.set(x, "Cors", value.asInstanceOf[js.Any])
    
    inline def setCorsUndefined: Self = StObject.set(x, "Cors", js.undefined)
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setInvokeMode(value: InvokeMode): Self = StObject.set(x, "InvokeMode", value.asInstanceOf[js.Any])
    
    inline def setInvokeModeUndefined: Self = StObject.set(x, "InvokeMode", js.undefined)
    
    inline def setQualifier(value: FunctionUrlQualifier): Self = StObject.set(x, "Qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierUndefined: Self = StObject.set(x, "Qualifier", js.undefined)
  }
}
