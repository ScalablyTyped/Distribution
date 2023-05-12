package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFunctionUrlConfigResponse extends StObject {
  
  /**
    * The type of authentication that your function URL uses. Set to AWS_IAM if you want to restrict access to authenticated users only. Set to NONE if you want to bypass IAM authentication to create a public endpoint. For more information, see Security and auth model for Lambda function URLs.
    */
  var AuthType: FunctionUrlAuthType
  
  /**
    * The cross-origin resource sharing (CORS) settings for your function URL.
    */
  var Cors: js.UndefOr[typings.awsSdk.clientsLambdaMod.Cors] = js.undefined
  
  /**
    * When the function URL was created, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var CreationTime: Timestamp
  
  /**
    * The Amazon Resource Name (ARN) of your function.
    */
  var FunctionArn: typings.awsSdk.clientsLambdaMod.FunctionArn
  
  /**
    * The HTTP URL endpoint for your function.
    */
  var FunctionUrl: typings.awsSdk.clientsLambdaMod.FunctionUrl
  
  /**
    * Use one of the following options:    BUFFERED – This is the default option. Lambda invokes your function using the Invoke API operation. Invocation results are available when the payload is complete. The maximum payload size is 6 MB.    RESPONSE_STREAM – Your function streams payload results as they become available. Lambda invokes your function using the InvokeWithResponseStream API operation. The maximum response payload size is 20 MB, however, you can request a quota increase.  
    */
  var InvokeMode: js.UndefOr[typings.awsSdk.clientsLambdaMod.InvokeMode] = js.undefined
  
  /**
    * When the function URL configuration was last updated, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var LastModifiedTime: Timestamp
}
object UpdateFunctionUrlConfigResponse {
  
  inline def apply(
    AuthType: FunctionUrlAuthType,
    CreationTime: Timestamp,
    FunctionArn: FunctionArn,
    FunctionUrl: FunctionUrl,
    LastModifiedTime: Timestamp
  ): UpdateFunctionUrlConfigResponse = {
    val __obj = js.Dynamic.literal(AuthType = AuthType.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], FunctionArn = FunctionArn.asInstanceOf[js.Any], FunctionUrl = FunctionUrl.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionUrlConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFunctionUrlConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthType(value: FunctionUrlAuthType): Self = StObject.set(x, "AuthType", value.asInstanceOf[js.Any])
    
    inline def setCors(value: Cors): Self = StObject.set(x, "Cors", value.asInstanceOf[js.Any])
    
    inline def setCorsUndefined: Self = StObject.set(x, "Cors", js.undefined)
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setFunctionArn(value: FunctionArn): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    inline def setFunctionUrl(value: FunctionUrl): Self = StObject.set(x, "FunctionUrl", value.asInstanceOf[js.Any])
    
    inline def setInvokeMode(value: InvokeMode): Self = StObject.set(x, "InvokeMode", value.asInstanceOf[js.Any])
    
    inline def setInvokeModeUndefined: Self = StObject.set(x, "InvokeMode", js.undefined)
    
    inline def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
  }
}
