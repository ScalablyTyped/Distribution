package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaInvokeOperation extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the Lambda function that the specified job will invoke on every object in the manifest.
    */
  var FunctionArn: js.UndefOr[FunctionArnString] = js.undefined
}
object LambdaInvokeOperation {
  
  inline def apply(): LambdaInvokeOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaInvokeOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaInvokeOperation] (val x: Self) extends AnyVal {
    
    inline def setFunctionArn(value: FunctionArnString): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    inline def setFunctionArnUndefined: Self = StObject.set(x, "FunctionArn", js.undefined)
  }
}
