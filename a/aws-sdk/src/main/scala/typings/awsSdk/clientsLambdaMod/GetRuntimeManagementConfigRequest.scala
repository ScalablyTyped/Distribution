package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRuntimeManagementConfigRequest extends StObject {
  
  /**
    * The name of the Lambda function.  Name formats     Function name – my-function.    Function ARN – arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN – 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: NamespacedFunctionName
  
  /**
    * Specify a version of the function. This can be $LATEST or a published version number. If no value is specified, the configuration for the $LATEST version is returned.
    */
  var Qualifier: js.UndefOr[typings.awsSdk.clientsLambdaMod.Qualifier] = js.undefined
}
object GetRuntimeManagementConfigRequest {
  
  inline def apply(FunctionName: NamespacedFunctionName): GetRuntimeManagementConfigRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRuntimeManagementConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRuntimeManagementConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setFunctionName(value: NamespacedFunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setQualifier(value: Qualifier): Self = StObject.set(x, "Qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierUndefined: Self = StObject.set(x, "Qualifier", js.undefined)
  }
}
