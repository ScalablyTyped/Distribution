package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRuntimeManagementConfigResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of your function.
    */
  var FunctionArn: js.UndefOr[NameSpacedFunctionArn] = js.undefined
  
  /**
    * The ARN of the runtime the function is configured to use. If the runtime update mode is Manual, the ARN is returned, otherwise null is returned.
    */
  var RuntimeVersionArn: js.UndefOr[typings.awsSdk.clientsLambdaMod.RuntimeVersionArn] = js.undefined
  
  /**
    * The current runtime update mode of the function.
    */
  var UpdateRuntimeOn: js.UndefOr[typings.awsSdk.clientsLambdaMod.UpdateRuntimeOn] = js.undefined
}
object GetRuntimeManagementConfigResponse {
  
  inline def apply(): GetRuntimeManagementConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRuntimeManagementConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRuntimeManagementConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setFunctionArn(value: NameSpacedFunctionArn): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    inline def setFunctionArnUndefined: Self = StObject.set(x, "FunctionArn", js.undefined)
    
    inline def setRuntimeVersionArn(value: RuntimeVersionArn): Self = StObject.set(x, "RuntimeVersionArn", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionArnUndefined: Self = StObject.set(x, "RuntimeVersionArn", js.undefined)
    
    inline def setUpdateRuntimeOn(value: UpdateRuntimeOn): Self = StObject.set(x, "UpdateRuntimeOn", value.asInstanceOf[js.Any])
    
    inline def setUpdateRuntimeOnUndefined: Self = StObject.set(x, "UpdateRuntimeOn", js.undefined)
  }
}
