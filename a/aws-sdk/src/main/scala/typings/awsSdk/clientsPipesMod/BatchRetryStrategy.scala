package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchRetryStrategy extends StObject {
  
  /**
    * The number of times to move a job to the RUNNABLE status. If the value of attempts is greater than one, the job is retried on failure the same number of attempts as the value.
    */
  var Attempts: js.UndefOr[BatchRetryAttempts] = js.undefined
}
object BatchRetryStrategy {
  
  inline def apply(): BatchRetryStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRetryStrategy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchRetryStrategy] (val x: Self) extends AnyVal {
    
    inline def setAttempts(value: BatchRetryAttempts): Self = StObject.set(x, "Attempts", value.asInstanceOf[js.Any])
    
    inline def setAttemptsUndefined: Self = StObject.set(x, "Attempts", js.undefined)
  }
}
