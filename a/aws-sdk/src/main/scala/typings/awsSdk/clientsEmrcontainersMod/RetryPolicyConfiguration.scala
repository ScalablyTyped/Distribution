package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryPolicyConfiguration extends StObject {
  
  /**
    * The maximum number of attempts on the job's driver.
    */
  var maxAttempts: JavaInteger
}
object RetryPolicyConfiguration {
  
  inline def apply(maxAttempts: JavaInteger): RetryPolicyConfiguration = {
    val __obj = js.Dynamic.literal(maxAttempts = maxAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryPolicyConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetryPolicyConfiguration] (val x: Self) extends AnyVal {
    
    inline def setMaxAttempts(value: JavaInteger): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
  }
}
