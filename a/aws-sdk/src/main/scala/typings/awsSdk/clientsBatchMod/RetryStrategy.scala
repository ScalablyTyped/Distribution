package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryStrategy extends StObject {
  
  /**
    * The number of times to move a job to the RUNNABLE status. You can specify between 1 and 10 attempts. If the value of attempts is greater than one, the job is retried on failure the same number of attempts as the value.
    */
  var attempts: js.UndefOr[Integer] = js.undefined
  
  /**
    * Array of up to 5 objects that specify the conditions where jobs are retried or failed. If this parameter is specified, then the attempts parameter must also be specified. If none of the listed conditions match, then the job is retried.
    */
  var evaluateOnExit: js.UndefOr[EvaluateOnExitList] = js.undefined
}
object RetryStrategy {
  
  inline def apply(): RetryStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryStrategy]
  }
  
  extension [Self <: RetryStrategy](x: Self) {
    
    inline def setAttempts(value: Integer): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
    
    inline def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
    
    inline def setEvaluateOnExit(value: EvaluateOnExitList): Self = StObject.set(x, "evaluateOnExit", value.asInstanceOf[js.Any])
    
    inline def setEvaluateOnExitUndefined: Self = StObject.set(x, "evaluateOnExit", js.undefined)
    
    inline def setEvaluateOnExitVarargs(value: EvaluateOnExit*): Self = StObject.set(x, "evaluateOnExit", js.Array(value*))
  }
}
