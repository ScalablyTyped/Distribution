package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRuntimeManagementConfigRequest extends StObject {
  
  /**
    * The name of the Lambda function.  Name formats     Function name – my-function.    Function ARN – arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN – 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.clientsLambdaMod.FunctionName
  
  /**
    * Specify a version of the function. This can be $LATEST or a published version number. If no value is specified, the configuration for the $LATEST version is returned.
    */
  var Qualifier: js.UndefOr[typings.awsSdk.clientsLambdaMod.Qualifier] = js.undefined
  
  /**
    * The ARN of the runtime version you want the function to use.  This is only required if you're using the Manual runtime update mode. 
    */
  var RuntimeVersionArn: js.UndefOr[typings.awsSdk.clientsLambdaMod.RuntimeVersionArn] = js.undefined
  
  /**
    * Specify the runtime update mode.    Auto (default) - Automatically update to the most recent and secure runtime version using a Two-phase runtime version rollout. This is the best choice for most customers to ensure they always benefit from runtime updates.    Function update - Lambda updates the runtime of your function to the most recent and secure runtime version when you update your function. This approach synchronizes runtime updates with function deployments, giving you control over when runtime updates are applied and allowing you to detect and mitigate rare runtime update incompatibilities early. When using this setting, you need to regularly update your functions to keep their runtime up-to-date.    Manual - You specify a runtime version in your function configuration. The function will use this runtime version indefinitely. In the rare case where a new runtime version is incompatible with an existing function, this allows you to roll back your function to an earlier runtime version. For more information, see Roll back a runtime version.  
    */
  var UpdateRuntimeOn: typings.awsSdk.clientsLambdaMod.UpdateRuntimeOn
}
object PutRuntimeManagementConfigRequest {
  
  inline def apply(FunctionName: FunctionName, UpdateRuntimeOn: UpdateRuntimeOn): PutRuntimeManagementConfigRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], UpdateRuntimeOn = UpdateRuntimeOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRuntimeManagementConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRuntimeManagementConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setQualifier(value: Qualifier): Self = StObject.set(x, "Qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierUndefined: Self = StObject.set(x, "Qualifier", js.undefined)
    
    inline def setRuntimeVersionArn(value: RuntimeVersionArn): Self = StObject.set(x, "RuntimeVersionArn", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionArnUndefined: Self = StObject.set(x, "RuntimeVersionArn", js.undefined)
    
    inline def setUpdateRuntimeOn(value: UpdateRuntimeOn): Self = StObject.set(x, "UpdateRuntimeOn", value.asInstanceOf[js.Any])
  }
}
