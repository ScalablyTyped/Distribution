package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPolicy extends StObject {
  
  /**
    * The number of active simulation jobs create as part of the batch that can be in an active state at the same time.  Active states include: Pending,Preparing, Running, Restarting, RunningFailed and Terminating. All other states are terminal states. 
    */
  var maxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
  
  /**
    * The amount of time, in seconds, to wait for the batch to complete.  If a batch times out, and there are pending requests that were failing due to an internal failure (like InternalServiceError), they will be moved to the failed list and the batch status will be Failed. If the pending requests were failing for any other reason, the failed pending requests will be moved to the failed list and the batch status will be TimedOut. 
    */
  var timeoutInSeconds: js.UndefOr[BatchTimeoutInSeconds] = js.undefined
}
object BatchPolicy {
  
  inline def apply(): BatchPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPolicy]
  }
  
  extension [Self <: BatchPolicy](x: Self) {
    
    inline def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "maxConcurrency", js.undefined)
    
    inline def setTimeoutInSeconds(value: BatchTimeoutInSeconds): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSecondsUndefined: Self = StObject.set(x, "timeoutInSeconds", js.undefined)
  }
}
