package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IoTJobTimeoutConfig extends StObject {
  
  /**
    * The amount of time, in minutes, that devices have to complete the job. The timer starts when the job status is set to IN_PROGRESS. If the job status doesn't change to a terminal state before the time expires, then the job status is set to TIMED_OUT. The timeout interval must be between 1 minute and 7 days (10080 minutes).
    */
  var inProgressTimeoutInMinutes: js.UndefOr[IoTJobInProgressTimeoutInMinutes] = js.undefined
}
object IoTJobTimeoutConfig {
  
  inline def apply(): IoTJobTimeoutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IoTJobTimeoutConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IoTJobTimeoutConfig] (val x: Self) extends AnyVal {
    
    inline def setInProgressTimeoutInMinutes(value: IoTJobInProgressTimeoutInMinutes): Self = StObject.set(x, "inProgressTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setInProgressTimeoutInMinutesUndefined: Self = StObject.set(x, "inProgressTimeoutInMinutes", js.undefined)
  }
}
