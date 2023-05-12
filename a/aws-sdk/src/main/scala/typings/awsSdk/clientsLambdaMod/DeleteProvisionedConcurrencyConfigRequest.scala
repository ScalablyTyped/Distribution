package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProvisionedConcurrencyConfigRequest extends StObject {
  
  /**
    * The name of the Lambda function.  Name formats     Function name – my-function.    Function ARN – arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN – 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.clientsLambdaMod.FunctionName
  
  /**
    * The version number or alias name.
    */
  var Qualifier: typings.awsSdk.clientsLambdaMod.Qualifier
}
object DeleteProvisionedConcurrencyConfigRequest {
  
  inline def apply(FunctionName: FunctionName, Qualifier: Qualifier): DeleteProvisionedConcurrencyConfigRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], Qualifier = Qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProvisionedConcurrencyConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteProvisionedConcurrencyConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setQualifier(value: Qualifier): Self = StObject.set(x, "Qualifier", value.asInstanceOf[js.Any])
  }
}
