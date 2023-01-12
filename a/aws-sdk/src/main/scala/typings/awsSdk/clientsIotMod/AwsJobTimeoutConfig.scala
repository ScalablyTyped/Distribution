package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsJobTimeoutConfig extends StObject {
  
  /**
    * Specifies the amount of time, in minutes, this device has to finish execution of this job. The timeout interval can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The in progress timer can't be updated and will apply to all job executions for the job. Whenever a job execution remains in the IN_PROGRESS status for longer than this interval, the job execution will fail and switch to the terminal TIMED_OUT status.
    */
  var inProgressTimeoutInMinutes: js.UndefOr[AwsJobTimeoutInProgressTimeoutInMinutes] = js.undefined
}
object AwsJobTimeoutConfig {
  
  inline def apply(): AwsJobTimeoutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsJobTimeoutConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsJobTimeoutConfig] (val x: Self) extends AnyVal {
    
    inline def setInProgressTimeoutInMinutes(value: AwsJobTimeoutInProgressTimeoutInMinutes): Self = StObject.set(x, "inProgressTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setInProgressTimeoutInMinutesUndefined: Self = StObject.set(x, "inProgressTimeoutInMinutes", js.undefined)
  }
}
