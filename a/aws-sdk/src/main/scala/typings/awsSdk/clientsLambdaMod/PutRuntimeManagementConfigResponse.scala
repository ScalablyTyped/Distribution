package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRuntimeManagementConfigResponse extends StObject {
  
  /**
    * The ARN of the function
    */
  var FunctionArn: typings.awsSdk.clientsLambdaMod.FunctionArn
  
  /**
    * The ARN of the runtime the function is configured to use. If the runtime update mode is manual, the ARN is returned, otherwise null is returned.
    */
  var RuntimeVersionArn: js.UndefOr[typings.awsSdk.clientsLambdaMod.RuntimeVersionArn] = js.undefined
  
  /**
    * The runtime update mode.
    */
  var UpdateRuntimeOn: typings.awsSdk.clientsLambdaMod.UpdateRuntimeOn
}
object PutRuntimeManagementConfigResponse {
  
  inline def apply(FunctionArn: FunctionArn, UpdateRuntimeOn: UpdateRuntimeOn): PutRuntimeManagementConfigResponse = {
    val __obj = js.Dynamic.literal(FunctionArn = FunctionArn.asInstanceOf[js.Any], UpdateRuntimeOn = UpdateRuntimeOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRuntimeManagementConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRuntimeManagementConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setFunctionArn(value: FunctionArn): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionArn(value: RuntimeVersionArn): Self = StObject.set(x, "RuntimeVersionArn", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionArnUndefined: Self = StObject.set(x, "RuntimeVersionArn", js.undefined)
    
    inline def setUpdateRuntimeOn(value: UpdateRuntimeOn): Self = StObject.set(x, "UpdateRuntimeOn", value.asInstanceOf[js.Any])
  }
}
