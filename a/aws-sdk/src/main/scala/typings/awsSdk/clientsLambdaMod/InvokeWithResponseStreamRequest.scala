package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvokeWithResponseStreamRequest extends StObject {
  
  /**
    * Up to 3,583 bytes of base64-encoded data about the invoking client to pass to the function in the context object.
    */
  var ClientContext: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Lambda function.  Name formats     Function name – my-function.    Function ARN – arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN – 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: NamespacedFunctionName
  
  /**
    * Use one of the following options:    RequestResponse (default) – Invoke the function synchronously. Keep the connection open until the function returns a response or times out. The API operation response includes the function response and additional data.    DryRun – Validate parameter values and verify that the IAM user or role has permission to invoke the function.  
    */
  var InvocationType: js.UndefOr[ResponseStreamingInvocationType] = js.undefined
  
  /**
    * Set to Tail to include the execution log in the response. Applies to synchronously invoked functions only.
    */
  var LogType: js.UndefOr[typings.awsSdk.clientsLambdaMod.LogType] = js.undefined
  
  /**
    * The JSON that you want to provide to your Lambda function as input. You can enter the JSON directly. For example, --payload '{ "key": "value" }'. You can also specify a file path. For example, --payload file://payload.json.
    */
  var Payload: js.UndefOr[_Blob] = js.undefined
  
  /**
    * The alias name.
    */
  var Qualifier: js.UndefOr[typings.awsSdk.clientsLambdaMod.Qualifier] = js.undefined
}
object InvokeWithResponseStreamRequest {
  
  inline def apply(FunctionName: NamespacedFunctionName): InvokeWithResponseStreamRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeWithResponseStreamRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvokeWithResponseStreamRequest] (val x: Self) extends AnyVal {
    
    inline def setClientContext(value: String): Self = StObject.set(x, "ClientContext", value.asInstanceOf[js.Any])
    
    inline def setClientContextUndefined: Self = StObject.set(x, "ClientContext", js.undefined)
    
    inline def setFunctionName(value: NamespacedFunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setInvocationType(value: ResponseStreamingInvocationType): Self = StObject.set(x, "InvocationType", value.asInstanceOf[js.Any])
    
    inline def setInvocationTypeUndefined: Self = StObject.set(x, "InvocationType", js.undefined)
    
    inline def setLogType(value: LogType): Self = StObject.set(x, "LogType", value.asInstanceOf[js.Any])
    
    inline def setLogTypeUndefined: Self = StObject.set(x, "LogType", js.undefined)
    
    inline def setPayload(value: _Blob): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    
    inline def setQualifier(value: Qualifier): Self = StObject.set(x, "Qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierUndefined: Self = StObject.set(x, "Qualifier", js.undefined)
  }
}
