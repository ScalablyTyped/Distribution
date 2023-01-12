package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails extends StObject {
  
  /**
    * The command that the container runs to determine whether it is healthy.
    */
  var Command: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The time period in seconds between each health check execution. The default value is 30 seconds.
    */
  var Interval: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of times to retry a failed health check before the container is considered unhealthy. The default value is 3.
    */
  var Retries: js.UndefOr[Integer] = js.undefined
  
  /**
    * The optional grace period in seconds that allows containers time to bootstrap before failed health checks count towards the maximum number of retries.
    */
  var StartPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The time period in seconds to wait for a health check to succeed before it is considered a failure. The default value is 5.
    */
  var Timeout: js.UndefOr[Integer] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: NonEmptyStringList): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "Command", js.undefined)
    
    inline def setCommandVarargs(value: NonEmptyString*): Self = StObject.set(x, "Command", js.Array(value*))
    
    inline def setInterval(value: Integer): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
    
    inline def setRetries(value: Integer): Self = StObject.set(x, "Retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesUndefined: Self = StObject.set(x, "Retries", js.undefined)
    
    inline def setStartPeriod(value: Integer): Self = StObject.set(x, "StartPeriod", value.asInstanceOf[js.Any])
    
    inline def setStartPeriodUndefined: Self = StObject.set(x, "StartPeriod", js.undefined)
    
    inline def setTimeout(value: Integer): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
  }
}
