package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryPolicyExecution extends StObject {
  
  /**
    * The current number of attempts made on the driver of the job.
    */
  var currentAttemptCount: JavaInteger
}
object RetryPolicyExecution {
  
  inline def apply(currentAttemptCount: JavaInteger): RetryPolicyExecution = {
    val __obj = js.Dynamic.literal(currentAttemptCount = currentAttemptCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryPolicyExecution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetryPolicyExecution] (val x: Self) extends AnyVal {
    
    inline def setCurrentAttemptCount(value: JavaInteger): Self = StObject.set(x, "currentAttemptCount", value.asInstanceOf[js.Any])
  }
}
