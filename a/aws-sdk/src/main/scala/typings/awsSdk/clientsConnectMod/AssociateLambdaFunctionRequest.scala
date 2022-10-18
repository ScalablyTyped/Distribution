package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateLambdaFunctionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the Lambda function being associated. Maximum number of characters allowed is 140.
    */
  var FunctionArn: typings.awsSdk.clientsConnectMod.FunctionArn
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
}
object AssociateLambdaFunctionRequest {
  
  inline def apply(FunctionArn: FunctionArn, InstanceId: InstanceId): AssociateLambdaFunctionRequest = {
    val __obj = js.Dynamic.literal(FunctionArn = FunctionArn.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateLambdaFunctionRequest]
  }
  
  extension [Self <: AssociateLambdaFunctionRequest](x: Self) {
    
    inline def setFunctionArn(value: FunctionArn): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
