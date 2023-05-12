package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateCodeRequest extends StObject {
  
  /**
    * The code definition to be evaluated. Note that code and runtime are both required for this action. The runtime value must be APPSYNC_JS.
    */
  var code: Code
  
  /**
    * The map that holds all of the contextual information for your resolver invocation. A context is required for this action.
    */
  var context: Context
  
  /**
    * The function within the code to be evaluated. If provided, the valid values are request and response.
    */
  var function: js.UndefOr[String] = js.undefined
  
  /**
    * The runtime to be used when evaluating the code. Currently, only the APPSYNC_JS runtime is supported.
    */
  var runtime: AppSyncRuntime
}
object EvaluateCodeRequest {
  
  inline def apply(code: Code, context: Context, runtime: AppSyncRuntime): EvaluateCodeRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateCodeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluateCodeRequest] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setRuntime(value: AppSyncRuntime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
  }
}
