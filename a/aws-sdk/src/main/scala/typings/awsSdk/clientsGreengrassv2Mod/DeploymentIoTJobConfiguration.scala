package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentIoTJobConfiguration extends StObject {
  
  /**
    * The stop configuration for the job. This configuration defines when and how to stop a job rollout.
    */
  var abortConfig: js.UndefOr[IoTJobAbortConfig] = js.undefined
  
  /**
    * The rollout configuration for the job. This configuration defines the rate at which the job rolls out to the fleet of target devices.
    */
  var jobExecutionsRolloutConfig: js.UndefOr[IoTJobExecutionsRolloutConfig] = js.undefined
  
  /**
    * The timeout configuration for the job. This configuration defines the amount of time each device has to complete the job.
    */
  var timeoutConfig: js.UndefOr[IoTJobTimeoutConfig] = js.undefined
}
object DeploymentIoTJobConfiguration {
  
  inline def apply(): DeploymentIoTJobConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentIoTJobConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentIoTJobConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAbortConfig(value: IoTJobAbortConfig): Self = StObject.set(x, "abortConfig", value.asInstanceOf[js.Any])
    
    inline def setAbortConfigUndefined: Self = StObject.set(x, "abortConfig", js.undefined)
    
    inline def setJobExecutionsRolloutConfig(value: IoTJobExecutionsRolloutConfig): Self = StObject.set(x, "jobExecutionsRolloutConfig", value.asInstanceOf[js.Any])
    
    inline def setJobExecutionsRolloutConfigUndefined: Self = StObject.set(x, "jobExecutionsRolloutConfig", js.undefined)
    
    inline def setTimeoutConfig(value: IoTJobTimeoutConfig): Self = StObject.set(x, "timeoutConfig", value.asInstanceOf[js.Any])
    
    inline def setTimeoutConfigUndefined: Self = StObject.set(x, "timeoutConfig", js.undefined)
  }
}
