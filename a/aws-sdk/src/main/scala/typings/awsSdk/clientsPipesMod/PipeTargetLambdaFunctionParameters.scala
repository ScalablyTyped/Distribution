package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeTargetLambdaFunctionParameters extends StObject {
  
  /**
    * Choose from the following options.    RequestResponse (default) - Invoke the function synchronously. Keep the connection open until the function returns a response or times out. The API response includes the function response and additional data.    Event - Invoke the function asynchronously. Send events that fail multiple times to the function's dead-letter queue (if it's configured). The API response only includes a status code.    DryRun - Validate parameter values and verify that the user or role has permission to invoke the function.  
    */
  var InvocationType: js.UndefOr[PipeTargetInvocationType] = js.undefined
}
object PipeTargetLambdaFunctionParameters {
  
  inline def apply(): PipeTargetLambdaFunctionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipeTargetLambdaFunctionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeTargetLambdaFunctionParameters] (val x: Self) extends AnyVal {
    
    inline def setInvocationType(value: PipeTargetInvocationType): Self = StObject.set(x, "InvocationType", value.asInstanceOf[js.Any])
    
    inline def setInvocationTypeUndefined: Self = StObject.set(x, "InvocationType", js.undefined)
  }
}
